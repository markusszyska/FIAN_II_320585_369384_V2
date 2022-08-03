package model.crud;

import java.util.ArrayList;

import model.data.Artikel;
import model.data.Sortiment;

public class DataLoader {
	/**
	 * @Ray Bitte zum Singleton umbauen
	 */
	private IDBConnection con;

	public IDBConnection getCon() {
		return con;
	}

	public void setCon(IDBConnection con) {
		this.con = con;
	}

	public DataLoader() {
		this.setCon(new SQLiteConnection());
	}

	public Sortiment getArtikelFromDataBase() {
		Sortiment sortiment = new Sortiment();
		ArrayList<Artikel> artikelliste = this.getCon().getAllArtikel();
		sortiment.setAlleArtikel(artikelliste);	
		
		return sortiment;
	}
}
