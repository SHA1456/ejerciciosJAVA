package es.hora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HoraTest {
	Hora hora;
	@BeforeEach
	void setUp() throws Exception {
		hora = new Hora(10,5);
	}

	@Test
	void testtoString() {
		String horaEsperada="10:05";
		String horaCadena = hora.toString();
		assertEquals(horaEsperada,horaCadena);
		
	}
	@Test
	void setHora_validaRango() {
		
		assertFalse(hora.setHora(-1));
		assertFalse(hora.setHora(24));
		assertTrue(hora.setHora(0));
		assertTrue(hora.setHora(23));
	}
	
	@Test
	void TestInc() {
		String resultadoEsperado="10:00";
		hora.incrementar();
		String resultado=hora.toString();
		//Ejecuta
		
		
	}
	

}
