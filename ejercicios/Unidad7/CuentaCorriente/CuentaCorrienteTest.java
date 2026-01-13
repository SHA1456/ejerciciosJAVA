package es.programacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	CuentaCorriente cc;

	@BeforeEach
	void setUp() throws Exception {
		cc=new CuentaCorriente("Sergio","12345678Z");
	}


	@Test
	@DisplayName ("Prueba del constructor")
	void testPruebaUnitariaConstructor() {
		double saldoEsperado = 0;
		double saldo = cc.getSaldo();
		
		double limitededescubiertoEsperado=-50.0;
		double limitedescubierto = cc.getLimite();
		
		String nombreesperado = "Sergio";
		String nombre = cc.getNombre();
		
		String dniEsperado = "12345678Z";
		String dni = cc.getDNI();
		
		assertEquals(saldoEsperado,saldo,"Se esperaba 0");
		assertEquals(limitededescubiertoEsperado,limitedescubierto);
		assertEquals(dniEsperado,dni);
		assertEquals(nombreesperado,nombre);
		
	}
	
}
