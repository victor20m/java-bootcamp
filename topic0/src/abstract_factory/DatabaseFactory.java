package abstract_factory;

public abstract class DatabaseFactory {
	abstract MysqlDatabase getMysql(String mysql);

	abstract MongoDBDatabase getMongoDB(String mongodb);
}
