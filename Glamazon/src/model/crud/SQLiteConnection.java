package model.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnection implements IDBConnection {

	private final String URL = "jdbc:sqlite:./DB/glamazon.db";
	private Connection connection;

	private Connection getConnection() {
		return connection;
	}

	private void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public SQLiteConnection() {
		try {
			this.setConnection(DriverManager.getConnection(URL));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet getAllArtikel() throws SQLException {
		Statement stm = this.getConnection().createStatement();
		String sql = "SELECT * FROM artikel";
		ResultSet res = stm.executeQuery(sql);		
		return res;
	}

}
