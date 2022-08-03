package app;

import java.awt.EventQueue;

import controller.MainController;
import model.data.Artikel;

public class App {
	public static void main(String[] args) {
		
		Artikel a = new Artikel();
		Artikel b = a.clone();
		
		boolean ergebnis = a.equals(b);

		System.out.println(ergebnis);
				
		EventQueue.invokeLater(new Runnable() {			
			@Override
			public void run() {
				 new MainController();				
			}
		});
	}
}
