package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.StringUtility;

public class StringUtilityTest {

	@Test
	public void test() {
		var tester = new StringUtility();
		assertEquals("ollaH", tester.reverseString("Hallo"));
	}

}
