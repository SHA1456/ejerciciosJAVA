package es.iescamas.programacion.ej1;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Libro1","Autor1",1990,25.50);
		Libro libro2 = new Libro("Libro2","Autor2",1975,15.20);

		if(libro1.getAnyo()>libro2.getAnyo()) {
			System.out.println(libro1.getTitulo() + " es más reciente");
		}else if(libro1.getAnyo()<libro2.getAnyo()) {
			System.out.println(libro2.getTitulo() + " es más reciente");
		}else {
			System.out.println("Misma edición");
		}
		
		double [] descuento = {0.05,0.1,0.15,0.2};
		
		for(int i=0;i<descuento.length;i++) {
			
			double desc = libro1.getPrecio()*descuento[i];
			double res=libro1.getPrecio()-desc;
			
			System.out.println("El precio del libro con descuento es: " + res);
			
		}
	}

}
