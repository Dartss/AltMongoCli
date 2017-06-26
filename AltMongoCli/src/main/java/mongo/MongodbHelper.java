package mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import exceptions.DatabaseNotSelectedException;
import model.ParsedSQLStatement;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

public class MongodbHelper {
    private static final String ASTERISK = "*";

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

    public String useDB(final String dbName) throws IllegalArgumentException{
        currentDB = mongoClient.getDatabase(dbName);
        return currentDB.getName();
    }

    public String dropDb(final String dbName) {
        return null;
    }

    public void dropCollection(final String collectionName) throws DatabaseNotSelectedException {
        if (currentDB == null) throw new DatabaseNotSelectedException();
        currentDB.getCollection(collectionName).drop();
    }

    public void insert(final String collectionName, final Document document) throws DatabaseNotSelectedException {
        if (currentDB == null) throw new DatabaseNotSelectedException();
        currentDB.getCollection(collectionName).insertOne(document);
    }

    public void insertMany(final String collectionName, final List<Document> documents) throws DatabaseNotSelectedException {
        if (currentDB == null) throw new DatabaseNotSelectedException();
        currentDB.getCollection(collectionName).insertMany(documents);
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

        Bson query = null;
        if (selectStatement.getConditions() != null)
            query = selectStatement.getConditions().get(0);

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
        if (selectStatement.getProjections().contains(ASTERISK)) return null;

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

    private MongoCollection getCollection(String name) throws DatabaseNotSelectedException {
        if(currentDB == null) throw new DatabaseNotSelectedException();

        return currentDB.getCollection(name);
    }

    public MongoDatabase getDB() throws DatabaseNotSelectedException {
        if (currentDB == null) throw new DatabaseNotSelectedException();
        return this.currentDB;
    }

}
