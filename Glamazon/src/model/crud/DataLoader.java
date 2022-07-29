package model.crud;

import java.sql.ResultSet;

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
//		sortiment.getAlleArtikel().add(new Artikel("..."));
		try {
			ResultSet res = this.getCon().getAllArtikel();
			while (res.next()) {
				System.out.print("Datensatz: Id: " + res.getInt(1) + " Mwst Id: " + res.getInt(2) + " Name: "
						+ res.getString(3) + " Beschreibung: " + res.getString(4) + " Preis: " + res.getDouble(5) + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sortiment;
	}
	
	public static void main(String[] args) {
		DataLoader dl = new DataLoader();
		dl.getArtikelFromDataBase();
	}

}
