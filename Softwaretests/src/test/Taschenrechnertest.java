package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.Taschenrechner;

class Taschenrechnertest {
	
	private Taschenrechner taschenrechner;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initialisiere Taschenrechner");
		this.taschenrechner = new Taschenrechner();
	}

	@Test
	void test() {
		assertEquals(20, taschenrechner.multipliziere(4, 5),"Normales Multiplizieren muss klappen");
		assertEquals(4, taschenrechner.multipliziere(2, 2),"Normales Multiplizieren muss klappen");
		assertEquals(32, taschenrechner.multipliziere(4, 8),"Normales Multiplizieren muss klappen");
		assertEquals(25, taschenrechner.multipliziere(5, 5),"Normales Multiplizieren muss klappen");
		
	}
	
	

}
