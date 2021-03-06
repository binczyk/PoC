package mongo;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

    private static final String DB_NAME = "bank";
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 27017;

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(this.HOST, this.PORT);
    }

    @Override
    protected String getDatabaseName() {
        return this.DB_NAME;
    }
}
