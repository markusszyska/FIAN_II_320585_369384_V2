package pak04_exceptions;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class Demo01TryCatch {
	public static void main(String[] args) {
		
		String zeichenkette = "Hallo Welt";
		
		for (int i = 0; i <= zeichenkette.length(); i++) {
			try {
				System.out.println(zeichenkette.charAt(i));				
			}catch(StringIndexOutOfBoundsException sioobe) {
				sioobe.printStackTrace();
			}
		}
		
		int[] zahlen = {1,2,3,4};
		int summe = 0;
		
		for (int i = 0; i <= zahlen.length; i++) {
			try {
				summe+=zahlen[i];				
			}catch(ArrayIndexOutOfBoundsException aioobe) {
				aioobe.printStackTrace();
			}
		}
		
		/*
		 * Wenn mehrere Exceptions abgefangen werden:
		 * Die speziellere Exception muss ueber den allgemeineren stehen, 
		 * wenn sich die Exceptions im selben Hierarchiezweig befinden.
		 */
		for (int i = 0; i < 15; i++) {
			try {
			zeichenkette.charAt(i); //StringIndexOutOfBoundsException
			summe+=zahlen[i];		//ArrayIndexOutOfBoundsException
			}
		
			catch(ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("Array zu kurz");
			}	
			catch(StringIndexOutOfBoundsException sioobe) {
				System.out.println("String zu kurz");
			}
			catch(IndexOutOfBoundsException ioobe) {
				System.out.println("Index Ueberlauf");
				System.out.println(ioobe.getClass().getSimpleName());
			}
			
		}
		System.out.println("--------------------------------------\n\n");
		for (int i = 0; i < 15; i++) {
			try {
			zeichenkette.charAt(i); //StringIndexOutOfBoundsException
			summe+=zahlen[i];		//ArrayIndexOutOfBoundsException
			}catch(IndexOutOfBoundsException ioobe) {
				System.out.println("Index Ueberlauf");
				System.out.println(ioobe.getClass().getSimpleName());
			}
			
		}
		
		try {
			go();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			go();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		System.out.println("Programmende");
	}
	
	public static void go() throws FileNotFoundException, ClassNotFoundException{
		
	}
}
