package abstract_factory;

public class MongoDBFactory extends DatabaseFactory {

	@Override
	MysqlDatabase getMysql(String mysql) {
		return null;
	}

	@Override
	MongoDBDatabase getMongoDB(String mongodb) {
		switch (mongodb) {
		case "accounts":
			return new AccountsMdb();
		case "clients":
			return new ClientsMdb();
		default:
			return null;
		}
	}
}
