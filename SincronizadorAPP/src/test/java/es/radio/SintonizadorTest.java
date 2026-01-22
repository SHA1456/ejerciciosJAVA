package es.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SintonizadorTest {

	Sintonizador sintonizador;
	@BeforeEach
	void setUp() throws Exception {
		sintonizador = new Sintonizador();
	}

	@Test
	@DisplayName ("Prueba del constructor (si inicia correctamente a 80 MHz)")
	void testConstructor() {
		double valorEsperado=80.0;
		double valor = sintonizador.getFrecuencia();
		
		assertEquals(valorEsperado,valor,"Debería haber devuelto 80");
	}
	
	@Test
	@DisplayName("Prueba getter y setter")
	void testGetterSetter() {
		double valorEsperado=90.0;
		//Realiza cambios
		sintonizador.setFrecuencia(90.0);
		double valor = sintonizador.getFrecuencia();
		
		assertEquals(valorEsperado, valor,"Debería haber devuelto 90");
	}
	
	@Test
	@DisplayName("Prueba up")
	void testUPLimiteFinal() {
		sintonizador.setFrecuencia(108.0);
		sintonizador.up();
		
		double resultadoEsperado = 80.0;
		double resultado = sintonizador.getFrecuencia();
		
		assertEquals(resultadoEsperado, resultado,"Debería haber devuelto 80");
		
	}
	
	@Test
	@DisplayName("Prueba down")
	
	void testDownLimite() {
		sintonizador.setFrecuencia(80.0);
		sintonizador.down();
		
		double resultadoEsperado = 108.0;
		double resultado = sintonizador.getFrecuencia();
		
		assertEquals(resultadoEsperado, resultado, "Debería haber devuelto 108");
	}
}
