package abstract_factory;

public class ConnectionMaker {
	public static DatabaseFactory establishConnection(String connect) {
		switch(connect) {
			case "mysql":
				return new MySqlFactory();
			case "mongodb":
				return new MongoDBFactory();
			default:
				return null;
		}
	}
}
