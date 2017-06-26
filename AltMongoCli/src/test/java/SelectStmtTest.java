import exceptions.DatabaseNotSelectedException;
import mongo.MongodbHelper;
import org.bson.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelectStmtTest {
    private static final String testDbName = "test";
    private static final String testCollectionName = "customers";

    private static List<String> convertedCustomers = new ArrayList<>();

    // ------------------------Test customers
    //Dima
    private static Document dimasCC = new Document("name", "Master Card")
                .append("limit", 10000);
    private static Document dima = new Document("_id", "5950f4ed0b97a54dabaf9ba1")
                .append("name", "Dima")
                .append("age", 25)
                .append("credit_card", dimasCC);
    //Ivan
    private static Document ivansCC = new Document("name", "Visa")
            .append("limit", 5000);
    private static Document ivan = new Document("_id", "5950f4ed0b97a54dabaf9ba2")
            .append("name", "Ivan")
            .append("age", 18)
            .append("credit_card", ivansCC);
    //Stepka
    private static Document stepansCC = new Document("name", "Pay Pal")
            .append("limit", 20000);
    private static Document stepan = new Document("_id", "5950f4ed0b97a54dabaf9ba3")
            .append("name", "Stepan")
            .append("age", 52)
            .append("credit_card", stepansCC);

    private static MongodbHelper mongodbHelper = MongodbHelper.getInstance();
    private static MongoShell shell = new MongoShell();

    @Before
    public void setUpToHexStringData() throws DatabaseNotSelectedException {
        convertedCustomers.clear();

        //insure that collection not exists
        mongodbHelper.useDB("test");
        mongodbHelper.dropCollection(testCollectionName);

        List<Document> customers = new ArrayList<>();
        customers.add(dima);
        customers.add(stepan);
        customers.add(ivan);

        mongodbHelper.insertMany("customers", customers);

        customers.forEach(customer -> convertedCustomers.add(customer.toString()));
    }

    @Test
    public void testSelectAllQuery() {
        List<String> r = shell.select("* from "+testCollectionName);

        assertEquals(convertedCustomers, r);
    }

    @Test
    public void testSelectSimpleCondition() {
        List<String> r = shell.select("* from "+testCollectionName + " where age > 20");

        assertEquals(Arrays.asList(dima.toString(), stepan.toString()), r);
    }

    @Test
    public void testSelectSimpleCompoundConditionAnd() {
        List<String> r = shell.select("* from "+testCollectionName + " where age < 40 and name != Ivan");

        assertEquals(Arrays.asList(dima.toString()), r);
    }

    @Test
    public void testSelectSimpleCompoundConditionOr() {
        List<String> r = shell.select("* from "+testCollectionName + " where age >= 25 or name == Ivan");

        assertEquals(Arrays.asList(dima.toString(), stepan.toString(), ivan.toString()), r);
    }

    @Test
    public void testSelectCompoundCondition() {
        List<String> r = shell.select("* from "+testCollectionName + " where (age > 18 or name == Ivan) and (credit_card.name = Visa or credit_card.name = Master Card)");

        assertEquals(Arrays.asList(dima.toString(), stepan.toString(), ivan.toString()), r);
    }
}
