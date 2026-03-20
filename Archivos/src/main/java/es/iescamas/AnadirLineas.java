package es.iescamas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AnadirLineas {

	public static void main(String[] args) {
		
		try {
			Path ruta = Path.of("salida.txt");
			Files.writeString(ruta, "test", StandardOpenOption.CREATE,
	                StandardOpenOption.APPEND);
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
			
		}finally {
			System.out.println("FIN");
			
		}

	}

}
