package wdh;

public class DemoGrundlagen {
	public static void main(String[] args) {
		String vorname = "Markus";
		String nachname = "Szyska";
		int alter = 45;

		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		System.out.println("Alter: " + alter);

		String vorname2 = "Max";
		String nachname2 = "Mustermann";
		int alter2 = 45;

		System.out.println("Vorname: " + vorname2);
		System.out.println("Nachname: " + nachname2);
		System.out.println("Alter: " + alter2);

		Person p = new Person();
		p.vorname = "Markus";
		p.nachname = "Szyska";
		p.alter = 45;

		Person p1 = new Person();
		p1.vorname = "Max";
		p1.nachname = "Mustermann";
		p1.alter = 45;

		Person p2 = new Person("Christa", "Musterfrau", 45);

		p.sayHello();
		p1.sayHello();
	}

	public static void meeting() {
//		Person p = new Person();
//		p.vorname = "Markus";
//		p.nachname = "Szyska";
//		p.alter = 45;
//
//		Person p1 = new Person();
//		p1.vorname = "Max";
//		p1.nachname = "Mustermann";
//		p1.alter = 45;

//		System.out.println(p + " sagt hallo zu " + p1);
		// Markus soll zu Max Hallo sagen
	}

}

class Person {
	// Attribute
	// Informationen, die ein Objekt aufnehmen kann
	String vorname;
	String nachname;
	int alter;

	// Konstruktoren
	// Dienen der Erzeugung der Objekte
	Person() {

	}

	Person(String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	// Methoden
	// Was ein Objekt tun kann
	public void sayHello() {
		System.out.println(vorname + " " + nachname + " " + alter + " sagt Hallo");
	}

}
