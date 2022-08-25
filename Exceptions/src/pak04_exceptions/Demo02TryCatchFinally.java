package pak04_exceptions;

import java.util.Scanner;

public class Demo02TryCatchFinally {

	public static void main(String[] args) {
		/*
		 * Finally wird zum Aufraeumen verwendet.
		 * 
		 * Finally wird immer ausgefuehrt, egal, ob ein Fehler auftritt oder nicht.
		 * 
		 */
		try {

		} catch (Exception e) {

		}finally {
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		int[] zahlen = {1,2,3};
		int summe = 0;
		
		try {
			for (int i = 0; i <= zahlen.length; i++) {
				summe += zahlen[i];				
			}			
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Catch");
		}finally {
			sc.close();
			System.out.println("Finally");
		}
		
		System.out.println("Summe: " + summe);
		
	}
}
