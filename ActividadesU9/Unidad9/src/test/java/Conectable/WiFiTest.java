package Conectable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WiFiTest {

	private WiFi wifi;
	
	@BeforeEach
	void setUp() throws Exception {
		wifi = new WiFi();
	}

	@Test
	void testConstructor() {
		assertFalse(wifi.estaConectado());
	}
	
	@Test
	void testConectar() {
		wifi.conectar();
		assertTrue(wifi.estaConectado());
	}
	
	@Test
	void testDesconectar() {
		wifi.desconectar();
		assertFalse(wifi.estaConectado());
		
	}

}
