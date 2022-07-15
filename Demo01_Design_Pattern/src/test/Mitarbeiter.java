package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Object Relational Mapping
public class Mitarbeiter {
	int id = 10;
	String vorname;
	String nachname;
	
	
	public static void main(String[] args) {
		Field[] attribute = Mitarbeiter.class.getDeclaredFields();
		System.out.println(attribute.length);
		
		Mitarbeiter m1 = new Mitarbeiter();
		try {
			System.out.println(attribute[0].getInt(m1));
		} catch (Exception e) {			
			e.printStackTrace();
		} 
		
		Class<?> classObject = A.class;
		Method[] methods = classObject.getDeclaredMethods();
		Method m = methods[0];
		try {
			m.setAccessible(true);
			m.invoke(new A());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class A{
	private void hierkommtkeinerran() {
		System.out.println("Hier darf keiner ran");
	}
}

