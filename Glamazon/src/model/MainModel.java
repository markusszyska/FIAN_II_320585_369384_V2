package model;

import model.crud.DataLoader;
import model.data.Sortiment;

public class MainModel {
	
	public MainModel() {
			
	}
	
	public Sortiment ladeSortiment() {
		DataLoader dl = new DataLoader();
		Sortiment s = dl.getArtikelFromDataBase();
		return s;
	}
	

}
