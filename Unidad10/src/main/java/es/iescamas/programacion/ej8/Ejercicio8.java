package es.iescamas.programacion.ej8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("perso1.txt")); 
			BufferedReader br2 = new BufferedReader(new FileReader("perso2.txt"))){
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
			
			while ((linea = br2.readLine()) != null) {
                System.out.println(linea);
            }
			
		}catch (IOException e) {
			
		}

	}

}
