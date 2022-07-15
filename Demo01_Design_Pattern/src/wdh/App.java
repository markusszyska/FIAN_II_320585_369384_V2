package wdh;

public class App {
	public static void main(String[] args) {
		// Deklaration
		int zahl;
		// Initialisierung
		zahl = 10;

		// Instanzierung
//		new Person();

		/*
		 * Die lokale Variable p wird deklariert und auf den Typ Person typisiert.
		 */
		Person pers;
		/*
		 * Der Konstruktor der Klasse Person wird aufgerufen. Der Konstruktor
		 * instanziert das Objekt auf dem Heap und gibt die Speicheradresse des
		 * erzeugten Objektes zurück.
		 * 
		 * Die lokale Variable p wird initialisiert und bekommt als Inhalt die
		 * Referenz/Speicheradresse des erzeugten Objektes.
		 */
		pers = new Person();
		System.out.println(pers);
		
		pers.p = pers;
		
		System.out.println(pers.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p == pers);//true
		
		System.out.println(pers.name);
		System.out.println(pers.p.name);
		
		sayYourName(pers);
	}
	
	public static void sayYourName(Person param) {
		System.out.println(param.name);
		
	}
}

class Person {
	Person p;
	String name = "Markus";
	Hund hund;
	static Hund staticHund;

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	void doStuff(int param) {
		int zahl = 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Person() {
		System.out.println(this);
	}

	public void go() {
		System.out.println("Go");
	}
}

class Hund {

}
