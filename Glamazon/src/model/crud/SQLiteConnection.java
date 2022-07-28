package model.crud;

import java.sql.ResultSet;

public class SQLiteConnection implements IDBConnection{

	@Override
	public String getAllArtikel() {
		return "Artikel aus SQLite DB geladen";
	}
	
	
}
