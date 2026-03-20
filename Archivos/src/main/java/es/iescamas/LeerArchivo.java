package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;

public class LeerArchivo {

	public static void main (String [] args) {
		
		try {
			Path ruta = Path.of("Salida.txt");
		String texto=Files.readString(ruta);
		System.out.println(texto);
			
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}finally {
			
		}
		
		
		
		
		
		
		
		
	}
	
}
