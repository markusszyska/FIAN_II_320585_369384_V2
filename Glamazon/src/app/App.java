package app;

import java.awt.EventQueue;

import controller.MainController;

public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			@Override
			public void run() {
				 new MainController();				
			}
		});
	}
}
