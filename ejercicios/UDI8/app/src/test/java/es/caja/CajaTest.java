package es.caja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	Caja caja;
	@BeforeEach
	void setUp() throws Exception {
		caja=new Caja (2,2,2,Unidades.cm);
	}

	@Test
	void testGetVolumen() {
		Double resultadoEsperado=8.0;
		Double resultado=caja.getVolumen();
		assertEquals(resultadoEsperado, resultado);
	}

	
	
}
