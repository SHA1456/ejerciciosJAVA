package es.iescamas.programacion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ejercicio11 {

	/*
	 * Busca claves que contengan una subcadena:

	Ej: “pe” → Pedro, Pepe
	Pista 🔍
	Itera con entrySet().
	 */
	
	public static void main(String[] args) {
		
		Map<String, Integer> nombre = new HashMap<String,Integer>();

		nombre.put("Pedro", 23);
		nombre.put("Pepe", 30);
		nombre.put("Juan", 35);
		
		Iterator<Entry<String,Integer>> it = nombre.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String,Integer>entry=it.next();
			if(entry.getKey().contains("Pe")) {
				System.out.println("Contiene " + entry.getKey());
			}
			
		}
		
		
	}

}
