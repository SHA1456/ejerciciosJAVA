package es.iescamas.programacion.ej4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Titulo1","Autor1",1977,24.90);
		
		Libro libro2 = new Libro("Titulo2","Autor2",1987,28.90);
		
		Libro libro3 = new Libro("Titulo3","Autor3",1877,14.90);

		Libro libro4 = new Libro("Titulo4","Autor4",2015,35.99);

		
		Libro[] libros = {libro1,libro2,libro3,libro4};
		
		for(Libro lib:libros) {
			Arrays.sort(libros);
			lib.mostrarFicha();
		}
		
		
		/*Comparable compara el orden natural de los objetos siguiendo un criterio único y Comparator sigue el criterio que el programador
		establezca*/
		
		
	}

}
