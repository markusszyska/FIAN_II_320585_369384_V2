package singleton;

import java.time.LocalDate;
import java.util.Iterator;

public class App {
	static DBConnection con1;
	static DBConnection con2;
	
	static int count = 0;
	
	public static void main(String[] args) {
		DBConnection db1 = new DBConnection();
		DBConnection db2 = new DBConnection();
		
		System.out.println(db1);
		System.out.println(db2);
		
		DBConnection dbc1 = DBConnection.getInstance();
		DBConnection dbc2 = DBConnection.getInstance();		
		System.out.println(dbc1 == dbc2);
		
		System.out.println("---------------");
		System.out.println(dbc1);
		System.out.println(dbc2);
		//Race Condition
		Thread t1 = new Thread(()->{for (int i = 0; i < 100000; i++) {
			/*
			 * 20000
			 */
			countup();
		}});
		t1.start();
		
		Thread t2 = new Thread(()->{for (int i = 0; i < 100000; i++) {
			/*
			 * 30000
			 * 
			 */
			countup();
		}});
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("count in main: " + count);

	}
	public static void countup() {
		synchronized(App.class) {
			count++;			
		}
	}
	
}
