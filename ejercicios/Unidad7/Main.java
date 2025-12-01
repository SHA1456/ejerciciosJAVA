package es.programacion;

public class Main {

	public static void main(String[] args) throws Exception {
		
		CuentaCorriente cc = new CuentaCorriente("Maria","12345678A");
		
		cc.ingresarDinero(250);
		
		System.out.println(cc.mostrarInformacion());
		
		cc.sacarDinero(100);
		
		System.out.println(cc.mostrarInformacion());
	}

}
