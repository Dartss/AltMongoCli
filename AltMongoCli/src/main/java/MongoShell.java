import asg.cliche.Command;
import com.mongodb.client.MongoCollection;
import exceptions.DatabaseNotSelectedException;
import model.ParsedSQLStatement;
import mongo.MongodbHelper;
import parser.SQLStatementParser;
import parser.SelectStmtParser;

import java.util.ArrayList;
import java.util.List;

public class MongoShell {

    @Command(name = "use")
    public String use(String dbName){
        try {
            dbName = MongodbHelper.getInstance().useDB(dbName);
        } catch (IllegalArgumentException e) {
            return "Wrong DB name : " + dbName;
        }
        return "Switched to db " + dbName;
    }

    @Command(name = "show")
    public List<String> showCollections(String subject)
    {
        List<String> results = new ArrayList<>();

        if (subject.equalsIgnoreCase("collections")) {
            try {
                results = MongodbHelper.getInstance().listCollectionsNames();
            } catch (DatabaseNotSelectedException e) {
                results.add(e.getMessage());
            }
        } else if (subject.equalsIgnoreCase("databases")) {
            results = MongodbHelper.getInstance().listDatabases();
        }

        return results;
    }

    @Command
    public List<String> find(String collectionName){
        MongoCollection collection = null;
        List<String> l = new ArrayList<>();

        try {
            collection = MongodbHelper.getInstance().getDB().getCollection(collectionName);
        } catch (DatabaseNotSelectedException e) {
            l.add(e.getMessage());
            return l;
        }

        for (Object o : collection.find()) {
            l.add(o.toString());
        }
        return  l;
    }

    @Command(name="select")
    public List<String> select(String... args)
    {
        //Initialize input string from array
        String format = new String(new char[args.length])
                .replace("\0", " %s ");
        //Stupid, I know, but parser.antlr lexer was made to recognize 'select' word
        String inputString = "select " + String.format(format, args);
        System.out.println("INPUT " + inputString);
        //Initialize select statement parser
        SQLStatementParser parser = SelectStmtParser.getInstance();
        ParsedSQLStatement parsedStatement = parser.parse(inputString);
        List<String> results = new ArrayList<>();

        try {
            results = MongodbHelper.getInstance().getDocuments(parsedStatement);
        } catch (DatabaseNotSelectedException e) {
            results.add(e.getMessage());
        }

        return results;
    }
}
