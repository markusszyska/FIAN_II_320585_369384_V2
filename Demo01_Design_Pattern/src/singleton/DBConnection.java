package singleton;

public class DBConnection {
	
	private static DBConnection instance = null;
	
	public static DBConnection getInstance() {		
			if(instance == null)
			instance = new DBConnection();				
		return instance;
	}
	
	public DBConnection() {
		
	}
}
