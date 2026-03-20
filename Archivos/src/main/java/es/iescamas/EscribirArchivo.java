package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirArchivo {

	public static void main (String [] args) {
		
		try {
			Path ruta = Path.of("Salida.txt");
			Files.writeString(ruta, "Hola desde java");
			System.out.println("Guardado correctamente pulsa F5");
			
		}catch(Exception ex){
			System.err.println(ex.getMessage());
			
		}finally {
			System.out.println("FIN");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
