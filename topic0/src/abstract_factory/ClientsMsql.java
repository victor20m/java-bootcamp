package abstract_factory;

public class ClientsMsql implements MysqlDatabase {

	@Override
	public String connectTo() {

		return "Connection to MYSQL clients database established.";
	}

}
