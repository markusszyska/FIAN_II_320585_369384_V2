package byValue_byReference;

public class Demo01 {
	public static void main(String[] args) {
		int zahl = 10;
		go(zahl);
		System.out.println("In der Main: " + zahl);
		
		
		MyObject mo = new MyObject();
		mo.name = "Markus";
		goRef(mo);
		System.out.println(mo.name); //Christian
		
		int[] arr = {1,2,3};
		doStuffWithArray(arr);
		System.out.println(arr[1]); //200
	}
	
	static void go(int param) {      // 10: I 11: I
		param++;
		System.out.println("In der Methode: " + param);
	}
	
	static void goRef(MyObject param) {
		param.name = "Christian";
	}
	
	static void doStuffWithArray(int[] param) {
		param[1] = 200;
	}
}

class MyObject{
	String name;
}
