package app;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import controller.MainController;
import model.crud.DataLoader;
import model.crud.FileHandler;
import model.data.Artikel;
import model.data.Sortiment;

public class App {
	
	/*
	 * Kommentar A
	 */
	
	
	public static void main(String[] args) {
		
		FileHandler fh = new FileHandler();
//		
//		String json = fh.readAsString("./DB/artikel-liste.json");
//		System.out.println(json);
//		
//		// GSON
//		Artikel artikel = new Gson().fromJson(json, Artikel.class);
//		System.out.println(artikel);
		
//		DataLoader dl = DataLoader.getInstance();
//		DataLoader dl2 = DataLoader.getInstance();
//		System.out.println(dl == dl2);
		
//		
//		Sortiment sortiment = dl.getArtikelFromDataBase();
//		
//		// Enhanced For-Loop
//		for(Artikel artikel : sortiment.getAlleArtikel()) {
//			System.out.println(artikel);
//		}
		
//		for(int i = 0; i < artikel_liste.size(); i++) {
//			System.out.println(artikel_liste.get(i));
//		}
		
//		EventQueue.invokeLater(new Runnable() {			
//			@Override
//			public void run() {
//				 new MainController();				
//			}
//		});
		
	}
}
