package wdh;

public class Standardwerte {
	public static void main(String[] args) {
		AClass a = new AClass();
		System.out.println(a.zahl); //0
		System.out.println(a.d);	//0.0
		System.out.println(a.b);	//false
		System.out.println(a.o);	//null
		
	}
}

class AClass{
	int zahl;
	double d;
	boolean b;
	Object o;	
}
