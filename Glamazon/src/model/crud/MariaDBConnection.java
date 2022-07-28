package model.crud;

public class MariaDBConnection implements IDBConnection{
	@Override
	public String getAllArtikel() {
		return "Artikel aus Maria DB geladen";
	}
}
