package wdh;

public class DemoDynamischeKonstruktoren {

	public static void main(String[] args) {
//		BodyBuilder bb = new BodyBuilder(); //"Ich weiss es noch nicht"
		
		Bouncer b = new Bouncer();//null
		b.whoAmI();
	}

}

class BodyBuilder{
	public BodyBuilder() {
//		System.out.println("Konstruktor von BodyBuilder");
		this.whoAmI();
	}
	
	void whoAmI() {
		System.out.println("Ich weiss es noch nicht");
	}
}

class Bouncer extends BodyBuilder{
	String who = "Ich bin ein Bouncer";

	public Bouncer() {
		//--------------------
		
//		System.out.println("Konstruktor von Bouncer");
	}
	void whoAmI() {
		System.out.println(who);
	}
}