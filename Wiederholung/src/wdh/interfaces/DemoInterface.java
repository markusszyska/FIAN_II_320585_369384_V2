package wdh.interfaces;

public class DemoInterface {

}

interface I{
	/*
	 * Attribute in einem Interface sind immer public static und final
	 */
	String attr = "";
	public String attr2 = "";
	final String attr3 = "";
	static final String attr4 = "";
	public static final String attr5 = "";
	
	/*
	 * Methoden in einem Interface sind immer public abstract
	 */
	void go(String passwort);
	public void go2(String passwort);
	public abstract void go3(String passwort);
	abstract void go4(String passwort);
	
	/*
	 * Default Methoden sind Methoden in Interfaces, die einen Koerper haben.
	 * Sie werden an implementierende Klassen vererbt.
	 */
	public default void goDef() {
		
	}	
	
	public static void staticGo() {
		int erg = privateStaticGo(10, 20);
	}
	
	private static int privateStaticGo(int i , int i1) {
		return i+i1;
	}
}
interface I1{
	public default void goDef() {
		
	}	
}
class A implements I, I1{

	@Override
	public void go(String passwort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go2(String passwort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go3(String passwort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go4(String passwort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goDef() {
		System.out.println("Eigene Logik");
//		I.super.goDef();
	}
	
}
