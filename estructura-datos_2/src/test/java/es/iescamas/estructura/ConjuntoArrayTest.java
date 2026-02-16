package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConjuntoArrayTest {

	ConjuntoArray conjunto;
	@BeforeEach
	void setUp() throws Exception {
		conjunto = new ConjuntoArray();
	}

	@Test
	void testAdd() {
		
		assertTrue(conjunto.add(3));
		assertFalse(conjunto.add(3));
		
	}
	
	@Test
	void testContains() {
		
		
		
	}

}
