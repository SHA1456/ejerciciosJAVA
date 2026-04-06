package es.iescamas.programacion.ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int contadorlineas=0,caracteres=0,palabras=0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("carta.txt"))){
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contadorlineas++;
                caracteres=caracteres+linea.length();
                
                if(!linea.trim().isEmpty()) {
                	String [] palabrasLineas=linea.split(" ");
                	palabras+=palabrasLineas.length;
                }
            }
			System.out.println("El total de líneas es: " + contadorlineas);
			System.out.println("El total de caracteres es: " + caracteres);
			System.out.println("El total de palabras es: " + palabras);
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
