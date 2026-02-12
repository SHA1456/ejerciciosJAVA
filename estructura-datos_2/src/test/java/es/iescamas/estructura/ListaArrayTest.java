package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaArrayTest {
	
	private ListaArray lista;
	@BeforeEach
	void setUp() throws Exception {
		lista=new ListaArray();
	}

	@Test
	void testConstructor() {
		int resultadoEsperado=0;
		int resultado=lista.size();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testAddFinal() {
		
		Integer[] resultadoEsperado= {1};
		lista.addFinal(1);
		Integer[] resultado = lista.getTabla();
		
		assertEquals(resultadoEsperado, resultado);
		
		lista.addFinal(2);
		
		resultadoEsperado=new Integer[] {1,2};
		
		assertArrayEquals(resultadoEsperado, lista.getTabla());
	}
	
	@Test
	void testGetIndex() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()->{lista.get(0);});
		String mensajeEsperado = "Fuera de rango";
		String mensaje = ex.getMessage().toString();
		assertEquals(mensajeEsperado, mensaje);
		
		//Obtener index -1
		
		ex=assertThrows(IllegalArgumentException.class, ()->{lista.get(-1);});
		mensaje=ex.getMessage().toString();
		assertEquals(mensajeEsperado, mensaje);
		
		lista.addFinal(-1);
		Integer[] tablaEsperada = {1};
		int numElementoEsperado=1;
		assertArrayEquals(tablaEsperada, lista.getTabla());
		assertEquals(numElementoEsperado, lista.size());
	}
	
	@Test
	void testRemove() {
		// [5,8]
		lista.addFinal(5);
		lista.addFinal(8);
		
		lista.remove(0);
		Integer[] resultadoEsperado= {8};
		
		Integer[] resultado=lista.getTabla();
		
		assertEquals(resultadoEsperado, resultado);
		
		
	}

}
