package wdh.interfaces.connections;

//public class DBConnection extends AConnection{
public class DBConnection implements IConnection{
	public String getData() {
		return "Daten aus Datenbank";
	}
}
