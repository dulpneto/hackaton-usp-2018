package config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class MongoConfig {

    private static Datastore datastore;

    public static Datastore datastore() {
        if (datastore == null) {
            initDatastore();
        }
        return datastore;
    }

    public static void initDatastore() {

        final Morphia morphia = new Morphia();

        // Tell Morphia where to find our models
        morphia.mapPackage("model");

        String mongoUri = "mongodb://{user}:{pass}@ds153980.mlab.com:53980/heroku_bbtsc7r7";
        //MongoClient mongoClient = new MongoClient(mongoUri);
        MongoClientURI uri = new MongoClientURI(mongoUri);
        MongoClient mongoClient = new MongoClient(uri);

        datastore = morphia.createDatastore(
                mongoClient, "heroku_bbtsc7r7");
    }

}
