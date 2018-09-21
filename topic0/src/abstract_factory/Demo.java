package abstract_factory;

public class Demo {
	public static void main(String[] args) {

		/*
		 * Each type of database factory contains two types of databases: Accounts and
		 * Clients. When a dataabase factory is ordered, we specify which type of
		 * database we wish to connect to. Each string test represents a type of
		 * database from a specified factory.
		 */
		DatabaseFactory mysqlConnection = ConnectionMaker.establishConnection("mysql");
		DatabaseFactory mongodbConnection = ConnectionMaker.establishConnection("mongodb");

		String mysqlAccounts = mysqlConnection.getMysql("accounts").connectTo();
		String mysqlClients = mysqlConnection.getMysql("clients").connectTo();
		String mongodbAccounts = mongodbConnection.getMongoDB("accounts").connectTo();
		String mongodbClients = mongodbConnection.getMongoDB("clients").connectTo();

		System.out.println(mysqlAccounts + "\n" + mysqlClients + "\n" + mongodbAccounts + "\n" + mongodbClients);
	}
}
