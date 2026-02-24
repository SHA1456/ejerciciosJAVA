package Conectable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CableTest {
	Cable c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Cable();
	}

	@Test
	void testConectar() {
		c.conectar();
		assertTrue(c.estaConectado());
	}
	
	@Test
	void testDesconectar() {
		c.desconectar();
		assertFalse(c.estaConectado());
	}

}
