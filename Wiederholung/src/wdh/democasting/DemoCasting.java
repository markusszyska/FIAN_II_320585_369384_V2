package wdh.democasting;

public class DemoCasting {
	public static void main(String[] args) {
		byte b = 10;
		//Widening
		//Wertebereich wird groeßer
		//implizites Casting
		int i = b;
		//Narrowing
		//Wertebereich wird kleiner
		//explizites Casting
		b = (byte)i;
		
		A a1 = new A();
//		B b1 = (B)a1;
		String s = ((B)a1).text;
		
		A a2 = new B();
		String s2 = ((B)a2).text;
		
		//Up- und Down-Cast
		//Up-Cast
		//implizites Casting
		A a3 = new B();
		//Down-Cast
		//explizites Casting
		B b1 = (B)a3;
		
	}
}
class A{
	
}
class B extends A{
	String text = "Hallo Welt";
}
class C extends B {
	
}
