package es.dni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControladorDNITest {

	ControladorDNI controlador;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("beforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("AfterAll");
	}
	

	@BeforeEach
	void setUp() throws Exception {
		controlador=new ControladorDNI();
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void testCalcularLetra() {
		
	}

}
