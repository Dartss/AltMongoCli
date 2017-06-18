import asg.cliche.Command;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import java.util.ArrayList;
import java.util.List;

public class MongoShell {
    @Command(name = "use")
    public String use(String dbName){
        try {
            MongodbHelper.getInstance().useDB(dbName);
        } catch (IllegalArgumentException e) {
            return "Wrong DB name";
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
        String format = new String(new char[args.length])
                .replace("\0", " %s ");
        String inputString = "select " + String.format(format, args);

        return SelectCommandParser.getInstance().parseSelect(inputString);
    }

    @Command public void computeFrequencies(StringBuilder text) {
        System.out.println(text.toString());
    }
}