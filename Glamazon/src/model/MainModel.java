package model;

import model.crud.DataLoader;
import model.crud.SQLiteConnection;

public class MainModel {
	
	
	
	public MainModel() {
		
		
	}
	
	public void ladeSortiment() {
//		DataLoader dl = new DataLoader(new SQLiteConnection());
//		dl.getDataFromDatabase();
	}
	
	
	public static void main(String[] args) {
		MainModel m = new MainModel();
		m.ladeSortiment();
	}
}
