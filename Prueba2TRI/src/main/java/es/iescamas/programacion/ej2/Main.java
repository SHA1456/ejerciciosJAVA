package es.iescamas.programacion.ej2;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro ("Libro1","Autor1",1990,25.0);
		
		LibroDigital libd = new LibroDigital ("Libro2","Autor2",1980,26.50,"EPUB");
		
		Catalogable [] catalogable = {libro1,libd};
		
		for (Catalogable catalog:catalogable) {
			
			catalog.mostrarEnCatalogo();	
		}
		
		
	}

}
