package annotations;

enum MyEnum{
	A,B
}
@interface Anno02{
	//primitive DT
	int i() default 9;
	double d();
	//...
	//Nur wenige Referenzdatentypen
	String s();
	Class<?> c();
	MyEnum e();
	PlugInVersion a();
	
//	Object o();
	//Arrays der angegebenen Datentypen
	String[] arr();
	
	int i1 = 10;	
}

@interface Anno03{
	int value();
	int i() default 5;
}

@Anno03(value = 10, i = 5)
public class Demo02_Unterstuetzte_Datentypen {

}
