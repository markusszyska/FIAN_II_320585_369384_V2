package pak01_exceptions;

public class FehlerArray {

	/*
	 * Waehrend der normalen Abarbeitung einer Methode kann zur Laufzeit ein
	 * abnormales Ereignis eintreten, das die normale Ausfuehrung der Methode unterbricht.
	 *
	 * Ein solches abnormales Ereignis ist eine Exception (Ausnahme)
	 *
	 * Eine Exception stellt damit ein Laufzeitereignis dar, das zum Versagen einer Methode
	 * und damit zu einem Laufzeitfehler des Programms fuehren kann.
	 */

	public static void main(String[] args) {
		method01();
	}

	static void method01() {
		method02();
	}

	static void method02() {
		int[] zahlen = {1,2,3};
		int summe = 0;
		for (int i = 0; i <= zahlen.length; i++) {
			summe += zahlen[i];
		}
		System.out.println("summe: " + summe);
	}
}
