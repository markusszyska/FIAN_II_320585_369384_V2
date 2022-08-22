package wdh.interfaces.connections;

//public class FileConnection extends AConnection {
public class FileConnection implements IConnection {
	public String getData() {
		return "Daten aus CSV Datei";
	}
}
