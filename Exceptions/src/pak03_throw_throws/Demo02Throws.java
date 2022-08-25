package pak03_throw_throws;

public class Demo02Throws {
	/*
	 * throws
	 * 
	 * throws wird benutzt, um an einer Methode den Hinweis anzuhaengen,
	 * dass eine Exception auftreten koennte, bzw. um das Abfangen des Fehlers
	 * an die aufrufende Stelle weiterzuleiten.
	 * 
	 * Checked Exceptions verlangen eine Behandlung entwerder per try/catch 
	 * oder ueber das Delegieren an die naechst hoehere Stelle.
	 * 
	 */
	public static void main(String[] args){
		
		dividierenMitTryCatch(1, 1);
		
		try {
			dividierenOhneTryCatch(1, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			weiterleiter(1, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static double dividierenMitTryCatch(double zahl1, double zahl2) throws ArrayIndexOutOfBoundsException {
		double result = 0;
		/*
		 * Im Fehlerfall wird direkt in den Catchblock gesprungen,
		 * der Rest vom Try Block wird nicht mehr abgearbeitet.
		 */
		try {
			if(zahl2 == 0) {
				throw new Exception("Teiler war 0");
			}
			System.out.println("Teiler war nicht 0");
			result = zahl1/zahl2;
		}catch(Exception ae) {
			ae.printStackTrace();
		}
		return result;

	}
	public static double dividierenOhneTryCatch(double zahl1, double zahl2)throws Exception {
		double result = 0;
		/*
		 * Im Fehlerfall wird das Programm abgebrochen
		 * und das Ende der Methode nicht mehr erreicht.
		 */
		if(zahl2 == 0) {
			throw new Exception("Teiler war 0");
		}
		System.out.println("Teiler war nicht 0");
		result = zahl1/zahl2;
		return result;		
	}
	
	public static double weiterleiter(double zahl1, double zahl2) throws Exception {
		System.out.println("weiterleiter");
		return dividierenOhneTryCatch(zahl1, zahl2);
	}
}
