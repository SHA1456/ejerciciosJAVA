package es.iescamas.programacion.ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3a {

	public static void main(String[] args) {
		
		String original="datos.txt",copia="copia.txt";

		
		try (
		BufferedReader br = new BufferedReader(new FileReader(original));
	            BufferedWriter bw = new BufferedWriter(new FileWriter(copia))
		)	
		{
			String linea;
			while((linea=br.readLine()) !=null) {
				bw.write(linea);
				bw.newLine();
				
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
