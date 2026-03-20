package es.iescamas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))){
			
			String linea;
			
			while((linea =  reader.readLine())!=null) {
				
				System.out.println("Linea leída: " + linea);
			}
			
		}catch(IOException e) {
			System.err.println(e.getMessage());
			
			
		}

	}

}
