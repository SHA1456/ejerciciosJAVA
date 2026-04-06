package es.iescamas.programacion.ej6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		

		try (
				BufferedReader br = new BufferedReader(new FileReader("firmas.txt"))){
			String linea;
			
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
			
			System.out.println("¿Quiéres añadir una nueva firma?");
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
