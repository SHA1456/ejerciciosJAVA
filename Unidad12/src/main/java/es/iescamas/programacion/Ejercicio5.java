package es.iescamas.programacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio5 {

	public static void main(String[] args) {
		Map <String, Integer> mapa =  new HashMap <>();

		try (BufferedReader br = new BufferedReader(new FileReader("fichero.txt"))){
			String linea;
			
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
			
			
			String[] palabras = linea.split("\\s+");
			
			for (String palabra:palabras) {
				if(!palabra.isEmpty()) {
					mapa.put(palabra,mapa.getOrDefault(palabra, 0)+1);
				}
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
