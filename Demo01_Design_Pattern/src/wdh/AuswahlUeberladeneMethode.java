package wdh;

public class AuswahlUeberladeneMethode {
	
	/*
	 * Referenztypen
	 * Up and Down Cast
	 * 
	 * primitive Typen
	 * Widening / Narrowing
	 */
	
	public static void main(String[] args) {
		int zahl = 10;
		long l1 = 10;
		
		//Widening
		l1 = zahl;
		//Narrowing
		//explizit Casten
		zahl = (int)l1;
		
		
		go(zahl);
		
		System.out.println("-----------------------------");
		
		short s1 = 2;
		
		go(s1);
		
		Integer i1 = 10; //Autoboxing
		i1 = new Integer(10);
		
		/*
		 * Unboxing + Widening ja
		 * Widening und Boxing nein
		 */
		long l2 = i1; 
		
//		i1 = s1;
	}
	static void go(byte param) {
		System.out.println("In byte");
	}
	
//	static void go(short param) {
//		System.out.println("In short");
//	}
	static void go(short... param) {
		System.out.println("In Vararg short");
	}
	
//	static void go(int param) {
//		System.out.println("In int");
//	}
	
//	static void go(long param) {
//		System.out.println("In long");
//	}
	
	static void go(Object i) {
		System.out.println("In Object");
		System.out.println(i.getClass().getSimpleName());
	}
	static void go(Integer i) {
		System.out.println("In Integer");
	}
	
//	static void go(Short i) {
//		System.out.println("In Short");
//	}
}




