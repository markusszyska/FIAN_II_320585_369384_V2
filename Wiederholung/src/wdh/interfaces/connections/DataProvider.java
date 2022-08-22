package wdh.interfaces.connections;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
	
	static FileConnection fc = new FileConnection();
	static DBConnection db = new DBConnection();
	static WebConnection wc = new WebConnection();
	
	public String getAllData() {
		
		String data = "";
		//Funktioniert, aber sehr umstaendlich
//		List<Object> connectionList = new ArrayList<>();
//		connectionList.add(new FileConnection());
//		connectionList.add(new DBConnection());
//		connectionList.add(new WebConnection());
//		for(Object o : connectionList) {
//			if(o instanceof FileConnection) {
//				data += ((FileConnection)o).getData();
//				data += "\n";
//			}
//			if(o instanceof DBConnection) {
//				data += ((DBConnection)o).getData();
//				data += "\n";
//			}
//			if(o instanceof WebConnection) {
//				data += ((WebConnection)o).getData();
//				data += "\n";
//			}
//		}
		//Mit abstrakter Elternklasse
//		List<AConnection> connectionList = new ArrayList<>();
//		connectionList.add(new FileConnection());
//		connectionList.add(new DBConnection());
//		connectionList.add(new WebConnection());
//		for(AConnection c : connectionList) {
//			data += c.getData() + "\n";
//		}
		
		List<IConnection> connectionList = new ArrayList<>();
		connectionList.add(new FileConnection());
		connectionList.add(new DBConnection());
		connectionList.add(new WebConnection());
		for(IConnection c : connectionList) {
			data += c.getData() + "\n";
		}
		return data;
	}
}
