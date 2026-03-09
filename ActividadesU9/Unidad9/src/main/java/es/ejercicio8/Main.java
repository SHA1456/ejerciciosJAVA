package es.ejercicio8;

public class Main {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("usuario1@email.com","pass1234");
		Usuario usuario2 = new Usuario("usuario2@email.com","pass2345");
		Reserva reserva1 = new Reserva("00/00/00",4);
		Reserva reserva2 = new Reserva("00/00/00",6);
		
		Validable[] validables= new Validable[] {usuario1,usuario2,reserva1,reserva2};
		
		for(Validable v:validables) {
			try {
				v.validar();
			}catch(IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		
	}	

}
