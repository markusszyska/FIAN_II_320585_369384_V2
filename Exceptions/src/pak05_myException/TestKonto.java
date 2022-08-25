package pak05_myException;

public class TestKonto {
	public static void main(String[] args) {
		try {
			Konto k = new Konto(100);
			double betrag = k.geldAbheben(150);
			System.out.println("Betrag im Geldbeutel: " + betrag);			
		}catch(Exception e) {
			System.out.println("Catch");
		}
		
	}
}
