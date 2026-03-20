package es.iescamas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))){
			
			writer.write("java");
			writer.newLine();
            writer.write("Archivos de texto");
            writer.newLine();
            writer.write("DAW y DAM");
            
            System.out.println("Archivo creado correctamente");
			
			
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
