package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import application.Taschenrechner;

@RunWith(Parameterized.class)
public class ParameterTestJUnit4 {
	
	@Parameter(0)
	public int p1;
	@Parameter(1)
	public int p2;
	@Parameter(2)
	public int result;
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {{1,2,2},{5,3,15},{3,4,12}};
		return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		var tester = new Taschenrechner();
		assertEquals(result, tester.multipliziere(p2, p1));		
	}

}
