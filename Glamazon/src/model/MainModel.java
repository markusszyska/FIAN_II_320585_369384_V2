package model;

import model.crud.DataLoader;
import model.data.Sortiment;

public class MainModel {
	
	public MainModel() {
			
	}
	
	public Sortiment ladeSortiment() {
		DataLoader dl = new DataLoader();
		Sortiment s = dl.getArtikelFromDataBase();
		
//		for(int i = 0; i < s.getAlleArtikel().size(); i++){
//			System.out.println(s.getAlleArtikel().get(i));
//		}
		
		return s;
	}
}
