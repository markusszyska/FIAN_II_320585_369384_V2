package model.crud;

public class DataLoader {
	
	private IDBConnection con;
	
	public DataLoader(Class<?> c) {
		
	}
	
	public String getDataFromDatabase() {
		return this.con.getAllArtikel();
	}
	
	public static void main(String[] args) {
		Kellner k = new Kellner(Weisswein.class);
	}
}
class Kellner{
	Wein wein;
	
	public Kellner(Class<?>c) {
		this.wein = new Weisswein();
	}
}

class Wein{
	
}

class Weisswein extends Wein{
	
}
class Rotwein extends Wein{
	
}