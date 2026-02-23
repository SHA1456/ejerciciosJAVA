package Imprimible_Danable;

public class App {

	public static void main(String[] args) {
		
		
		Factura f = new Factura(0,"María",2.0);
		Informe im = new Informe ("Título","Autor",3);
		
		Imprimible [] imprimibles = {f, im};

		for(Imprimible imprimible:imprimibles) {
			System.out.println(imprimible);
			
		}
	
		Enemigo en = new Enemigo (20,"Tipo 1");
		Jugador jugador1 = new Jugador (40,"Jugador1");
		
		for(int i=0;i<10;i++) {
			en.recibirDanio(2);
			jugador1.recibirDanio(1);
		}
	}

}
