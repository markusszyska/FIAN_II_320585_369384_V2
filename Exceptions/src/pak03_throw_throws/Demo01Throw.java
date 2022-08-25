package pak03_throw_throws;

public class Demo01Throw {

	/*
	 * Mit throw kann eine Exception geworfen werden.
	 *
	 * Alles, was von Throwable abgeleitet ist, kann mit dem Schluesselwort throw
	 * geworfen werden.
	 */

	public static void main(String[] args){

//		throw
//		throws
		int zahl = 1;
		
		/*
		 * unchecked:
		 * eine unchecked Exception kann ohne Fehlerbehandlung geworfen werden.
		 */
		if(zahl == 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		/*
		 * checked:
		 * Bei einer checked Exception wird die Fehlerbehandlung
		 * vom Compiler erzwungen. 
		 */
		if(zahl == 1) {
			try {
				throw new Exception();				
			}catch(Exception e) {
				
			}			
		}
				
//		dividierenOhneTryCatch(1,0);
		dividierenMitTryCatch(1, 0);
		System.out.println("Programmende");
	}
	public static double dividierenMitTryCatch(double zahl1, double zahl2) {
		double result = 0;
		/*
		 * Im Fehlerfall wird direkt in den Catchblock gesprungen,
		 * der Rest vom Try Block wird nicht mehr abgearbeitet.
		 */
		try {
			if(zahl2 == 0) {
				throw new ArithmeticException("Teiler war 0");
			}
			System.out.println("Teiler war nicht 0");
			result = zahl1/zahl2;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		return result;

	}
	public static double dividierenOhneTryCatch(double zahl1, double zahl2) {
		double result = 0;
		/*
		 * Im Fehlerfall wird das Programm abgebrochen
		 * und das Ende der Methode nicht mehr erreicht.
		 */
		if(zahl2 == 0) {
			throw new ArithmeticException("Teiler war 0");
		}
		System.out.println("Teiler war nicht 0");
		result = zahl1/zahl2;
		return result;

	}
}
