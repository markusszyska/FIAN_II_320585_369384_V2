package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Anno04{
	
}


public class Demo03 {
	
	@Anno04
	public static void main(String[] args) {
		
	}
	
}
