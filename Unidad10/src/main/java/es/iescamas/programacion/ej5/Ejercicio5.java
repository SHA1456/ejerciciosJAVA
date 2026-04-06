package es.iescamas.programacion.ej5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		try (BufferedReader br = new BufferedReader (new FileReader ("numeros.txt"))){
			String linea;
			
			
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                int numlinea=Integer.parseInt(linea);
                if(numlinea>max) {
                	max=numlinea;
                }
                
                if(numlinea<min) {
                	min=numlinea;
                }
                
                
            }
			
			System.out.println("El mayor es el: " + max);
            System.out.println("El menor es el: " + min);
			
		}catch (NumberFormatException e) {
			System.err.println("Linea no válida: " + e.getMessage());
		}

	}

}
