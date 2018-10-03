package abstract_factory;

public class AccountsFactory extends DatabaseFactory {

	@Override
	DatabaseInterface getConnection(String type) {
		switch (type) {
		case "mysql":
			return new AccountsMsql();

		case "mongodb":
			return new AccountsMdb();

		default:
			return null;
		}

	}
}