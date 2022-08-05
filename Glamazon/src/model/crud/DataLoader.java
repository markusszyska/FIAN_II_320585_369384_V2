package model.crud;

import java.util.ArrayList;

import model.data.Artikel;
import model.data.Sortiment;

public class DataLoader {
	private static DataLoader instance = new DataLoader();
	private IDBConnection con;
	
	public static DataLoader getInstance() {
		return DataLoader.instance;
	}
	
	public IDBConnection getCon() {
		return con;
	}

	public void setCon(IDBConnection con) {
		this.con = con;
	}

	private DataLoader() {
		this.setCon(new SQLiteConnection());
	}

	public Sortiment getArtikelFromDataBase() {
		Sortiment sortiment = new Sortiment();
		ArrayList<Artikel> artikelliste1 = new SQLiteConnection().getAllArtikel();
		ArrayList<Artikel> artikelliste2 = new FileHandler().getAllArtikel();
		
		artikelliste1.addAll(artikelliste2);
		
		sortiment.setAlleArtikel(artikelliste1);	
		
		return sortiment;
	}
}
