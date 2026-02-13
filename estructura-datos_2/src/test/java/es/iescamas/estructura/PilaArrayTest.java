package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArrayTest {
	PilaArray pila;
	@BeforeEach
	void setUp() throws Exception {
		pila=new PilaArray();
	}

	@Test
	void testIsEmpty() {
		assertTrue(pila.isEmpty());	
	}
	
	@Test
	void testPush() {
		pila.push(3);
		
		int totalEsperado=1;
		int total=pila.size();
		assertEquals(totalEsperado, total);
		
		pila.push(6);
		totalEsperado=2;
		total=pila.size();
		assertEquals(totalEsperado, total);
		
		pila.push(null);
		totalEsperado=2;
		total=pila.size();
		assertEquals(totalEsperado, total);
		
	}
	
	@Test
	void testPop() {
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		int resultado=pila.pop();
		int resultadoEsperado=3;
		
		assertEquals(resultadoEsperado, resultado);
		
		pila.pop();
		pila.pop();
		assertFalse(pila.isEmpty());
		
		
	}

}
