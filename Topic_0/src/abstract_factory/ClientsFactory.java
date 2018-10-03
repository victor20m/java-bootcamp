package abstract_factory;

public class ClientsFactory extends DatabaseFactory {

	@Override
	DatabaseInterface getConnection(String type) {
		switch (type) {
		case "mysql":
			return new ClientsMsql();

		case "mongodb":
			return new ClientsMdb();

		default:
			return null;

		}

	}
}