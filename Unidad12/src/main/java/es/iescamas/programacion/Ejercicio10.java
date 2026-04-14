package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio10 {

	/*
	 *Tienes dos listas de números:

		Une ambas listas
		Elimina duplicados
		Ordena resultado
		Pista 🔍
		Usa addAll() + TreeSet. 	
	 */
	
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList <Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(4);
		lista.add(45);
		
		List<Integer> lista2 = new ArrayList <Integer>(List.of(3,5,6,7));

		Set <Integer> numeros = new TreeSet();
		
		numeros.addAll(lista);
		numeros.addAll(lista2);
		
		System.out.println(numeros);
		
	}

}
