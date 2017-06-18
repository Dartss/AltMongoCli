import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> getDocuments(String collectionName, List<String> field, String condition) throws DatabaseNotSelectedException {
        List<String> resultDocuments = new ArrayList<>();

        BasicDBObject query = new BasicDBObject();

        MongoCursor c = getCollection(collectionName).find(query).iterator();
        while(c.hasNext()) {
            resultDocuments.add(c.next().toString());
        }
        return resultDocuments;
    }

    private MongoCollection getCollection(String name) throws DatabaseNotSelectedException {
        if(currentDB == null) throw new DatabaseNotSelectedException();

        return currentDB.getCollection(name);
    }

    public MongoDatabase getDB() throws DatabaseNotSelectedException {
        if (currentDB == null) throw new DatabaseNotSelectedException();
        return this.currentDB;
    }
}
