package model.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.crud.utility.ImageUtility;
import model.data.Artikel;

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
	public ArrayList<Artikel> getAllArtikel() {
		ArrayList<Artikel> artikelliste = new ArrayList<>();

		try {
			Statement stm = this.getConnection().createStatement();
			String sql = "SELECT * FROM artikel,bild WHERE artikel.ar_id = bild.ar_id";
			ResultSet res = stm.executeQuery(sql);
			while(res.next()) {
				Artikel artikel = new Artikel();
				artikel.setArtikelId(res.getInt(1));
				artikel.setMwst(res.getInt(2));
				artikel.setArtName(res.getString(3));
				artikel.setArtBeschreibung(res.getString(4));
				artikel.setPreis(res.getDouble(5));
				artikel.setIcon(ImageUtility.decodeImage(res.getString("bild")));

				artikelliste.add(artikel);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return artikelliste;
	}
	
	public void addImageToDB(String encodedImage, int artikelId) {
		String sql = "INSERT INTO bild (bild, ar_id) VALUES (?,?)";
		try {
			PreparedStatement pstm = this.getConnection().prepareStatement(sql);
			pstm.setString(1, encodedImage);
			pstm.setInt(2, artikelId);
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	


}
