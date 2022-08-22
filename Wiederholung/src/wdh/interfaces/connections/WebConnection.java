package wdh.interfaces.connections;

//public class WebConnection extends AConnection{
public class WebConnection implements IConnection{
	public String getData() {
		return "Daten aus der Web API";
	}
}
