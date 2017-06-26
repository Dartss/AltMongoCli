import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import model.CompoundCondition;
import model.Condition;
import model.SimpleCondition;
import model.ParsedSQLStatement;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class MongodbHelper {
    private final MongoClient mongoClient;
    private MongoDatabase currentDB;
    private static MongodbHelper instance = null;

    private MongodbHelper() {
        this.mongoClient = new MongoClient();
    }

    public static MongodbHelper getInstance()
    {
        if (instance == null) {
            instance = new MongodbHelper();
        }

        return instance;
    }

    public void useDB(final String dbName) {
        currentDB = mongoClient.getDatabase(dbName);
    }

    public List<String> listCollectionsNames () throws DatabaseNotSelectedException {
        List<String> collectionsNames = new ArrayList<>();
        if (currentDB != null) {
            for (String name : MongodbHelper.getInstance().getDB().listCollectionNames()) {
                collectionsNames.add(name);
            }
        } else {
            throw new DatabaseNotSelectedException();
        }
        return collectionsNames;
    }

    public List<String> listDatabases() {
        List<String> databasesNames = new ArrayList<>();
        for (Document name : mongoClient.listDatabases()) {
            databasesNames.add(name.getString("name"));
        }
        return databasesNames;
    }

    public List<String> getDocuments(ParsedSQLStatement selectStatement) throws DatabaseNotSelectedException {
        List<String> resultDocuments = new ArrayList<>();

        Bson query = generateQuery(selectStatement);
        Document projections = generateProjections(selectStatement);
        MongoCursor c;

        if (query != null && projections != null) {
            c = getCollection(selectStatement.getTarget()).find(query).projection(projections).iterator();
        } else if (query == null && projections != null) {
            c = getCollection(selectStatement.getTarget()).find().projection(projections).iterator();
        } else if (query != null && projections == null) {
            c = getCollection(selectStatement.getTarget()).find(query).iterator();
        } else {
            c = getCollection(selectStatement.getTarget()).find().iterator();
        }
        while(c.hasNext()) {
            resultDocuments.add(c.next().toString());
        }
        return resultDocuments;
    }

    private Document generateProjections(ParsedSQLStatement selectStatement) {
        if (selectStatement.getProjections().contains(Constants.ASTERISK)) return null;

        Document projections = null;

        if (selectStatement.getProjections() != null) {
            projections = new Document();
            for (String proj : selectStatement.getProjections()) {
                projections.append(proj, 1);
            }

            if (!selectStatement.getProjections().contains("_id"))
                projections.append("_id", 0);
        }
        return projections;
    }

    private Bson generateQuery(ParsedSQLStatement selectStatement) {
        Bson query = null;
        if (selectStatement.getConditions() != null)
        {
            
        }
        return query;
    }

    private MongoCollection getCollection(String name) throws DatabaseNotSelectedException {
        if(currentDB == null) throw new DatabaseNotSelectedException();

        return currentDB.getCollection(name);
    }

    public MongoDatabase getDB() throws DatabaseNotSelectedException {
        if (currentDB == null) throw new DatabaseNotSelectedException();
        return this.currentDB;
    }

    private Bson getBsonByOperator(Condition condition) {
        Bson query = null;
        switch (condition.getOperator()) {
            case ("=="):
                query = eq(condition.getColumnName(), condition.getExpression());
                break;
            case ("!="):
                query = ne(condition.getColumnName(), condition.getExpression());
                break;
            case (">"):
                query = gt(condition.getColumnName(), condition.getExpression());
                break;
            case ("<="):
                query = lte(condition.getColumnName(), condition.getExpression());
                break;
            case (">="):
                query = gte(condition.getColumnName(), condition.getExpression());
                break;
            case ("<"):
                query = lt(condition.getColumnName(), condition.getExpression());
                break;
        }
        return query;
    }
}
