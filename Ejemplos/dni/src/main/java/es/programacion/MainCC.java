package es.programacion;

import com.github.javafaker.Faker;

public class MainCC {

	public static void main(String[] args) {
		
		Faker faker = new Faker();
		
		CuentaCorriente cc1= new CuentaCorriente(faker.artist().name(), "12345678Z");
		
		CuentaCorriente cc2 = new CuentaCorriente(5.0);
		
		CuentaCorriente cc3 = new CuentaCorriente ("12345678Z",5,-10);
		
		System.out.println("cc1: ");
		cc1.mostrarInformacion();
		
		cc1.sacarDinero(49);
		
		cc1.mostrarInformacion();
		
		cc1.aumentarSaldo(49);
		
		System.out.println("cc2: ");
		cc2.mostrarInformacion();
		cc2.sacarDinero(2);
		cc2.mostrarInformacion();
		cc2.aumentarSaldo(2);
		cc2.mostrarInformacion();
		
		
		
	}

}
