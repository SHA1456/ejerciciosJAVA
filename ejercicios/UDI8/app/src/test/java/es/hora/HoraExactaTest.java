package es.hora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HoraExactaTest {

	private HoraExacta horaExacta;
	
	@BeforeEach
	void setUp() throws Exception {
		horaExacta = new HoraExacta (16,57,20);
	}

	@Test
	void testConstructor() {
		String resultadoEsperado="16:57:20";
		String resultado=horaExacta.toString();
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	void testConstructorParamInvalido() {
		
		
		
		String mensajeEsperado= "Tiene que ser una hora correcta";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			horaExacta = new HoraExacta(24,57,20);});
		String mensaje = exception.getMessage().toString();
		
		assertEquals(mensajeEsperado, mensaje);
		
		//Comprobar minutos invalidos
		
		String mensajeminutosEsperado = "Los minutos tienen que tener una hora correcta";
		IllegalArgumentException exceptionminutos = assertThrows(IllegalArgumentException.class, () -> {
			horaExacta = new HoraExacta(11,61,20);});
		String mensajeminutos = exception.getMessage().toString();
		assertEquals(mensajeminutosEsperado, mensajeminutos);
		//Comprobra segundos invalidos
		
		String mensajesegEsperado = "Los segundos no son correctos";
		IllegalArgumentException exceptionseg = assertThrows(IllegalArgumentException.class, () -> {
			horaExacta = new HoraExacta(11,20,-1);});
		String mensajeseg = exception.getMessage().toString();
		assertEquals(mensajesegEsperado, mensajeseg);	
	}
	@Test
	void testPruebaSetSegundos() {
		assertTrue(horaExacta.setSegundos(20));
		assertFalse(horaExacta.setSegundos(108));
		horaExacta.setSegundos(30);
		
		
		String resultadoEsperado = "16:57:30";
		String resultado=horaExacta.toString();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testIncrementoSegundos() {
		horaExacta.inc();
		String resultadoEsperado = "16:57:21";
		String resultado = horaExacta.toString();
		
		
		
	}
}
