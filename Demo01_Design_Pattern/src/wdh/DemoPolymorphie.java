package wdh;

public class DemoPolymorphie {
	//Polymorphie - Vielgestaltigkeit
	
	public static void main(String[] args) {
		//Kompilierzeit - Laufzeit
		A a = new B();
		//Virtual Call
		//Polymorpher Methodenaufruf
		a.go();
		
		B b = (B)a;
		
		//Aus
		a.staticGo();
		//Macht der Kompiler:
		A.staticGo();
	}
}

 class A{
	public void go() {
		System.out.println("go in A");
	}
	
	static void staticGo() {
		System.out.println("staticGo In A");
	}
}

class B extends A{
	@Override
	public void go() {
		System.out.println("go in B");
	}
	
	static void staticGo() {
		System.out.println("staticGo In B");
	}
}

class C extends A{
	@Override
	public void go() {
		System.out.println("go in C");
	}
}