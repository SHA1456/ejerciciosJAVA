package es.ejercicio10;

public class Main {

	public static void main(String[] args) {
		Becario b = new Becario ("Sergio");

		Trabajador t = b;
		t.trabajar();
		
		Estudiante e = b;
		e.estudiar();
		
		Mostrable m = b;
		System.out.println(m.mostrar());
	}
	
}
