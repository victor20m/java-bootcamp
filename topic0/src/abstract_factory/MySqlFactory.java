package abstract_factory;

public class MySqlFactory extends DatabaseFactory {

	@Override
	MysqlDatabase getMysql(String mysql) {
		switch (mysql) {
		case "accounts":
			return new AccountsMsql();
		case "clients":
			return new ClientsMsql();
		default:
			return null;
		}
	}

	@Override
	MongoDBDatabase getMongoDB(String mongodb) {
		return null;
	}
}