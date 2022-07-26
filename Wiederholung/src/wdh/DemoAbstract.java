package wdh;

public class DemoAbstract {
	public static void main(String[] args) {
		Tier t = new Schwein();
		t.machLaut();
//		Tier t1 = new Tier();
		Tier t2 = new Kuh();
		t2.machLaut();
		
		A a1 = new B();
		B b1 = (B)a1;
		
		
		A a2 = new D();
		C c1 = new D();
		
		
//		A a = (A)new Object();
		
		Ferkel f = (Ferkel)new Schwein();
		
		Schwein s = new Ferkel();
		Ferkel f1 = (Ferkel)s;
	}

}

abstract class A extends Object {
	abstract void go();
}

class B extends A {
	@Override
	void go() {				
	}
}
abstract class C extends B{
	abstract void go();
}
class D extends C{
	@Override
	void go() {		
	}	
}


abstract class Tier {
	public abstract void machLaut();
}

class Schwein extends Tier {
	public void machLaut() {
		System.out.println("Oink");
	}
}
class Ferkel extends Schwein{
	
}

class Kuh extends Tier {
	@Override
	public void machLaut() {

	}

}




