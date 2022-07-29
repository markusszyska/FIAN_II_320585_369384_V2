package model.crud;

import java.sql.ResultSet;

public interface IDBConnection {
	ResultSet getAllArtikel() throws Exception;
}
