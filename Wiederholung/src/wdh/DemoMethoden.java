package wdh;

public class DemoMethoden {
	
	public static void main(String[] args) {
		int zahl = 10;
		int zahl2 = 20;
		int ergebnis;
		
		ergebnis = berechne(zahl, zahl2);
		
		
		System.out.println(ergebnis);
	}
	
	public static int berechne(int param1 , int param2) {
		int erg = param1 + param2;
		System.out.println(erg);
		return erg;
	}
}
