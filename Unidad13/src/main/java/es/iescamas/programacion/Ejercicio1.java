package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		List <Integer> numeros = new ArrayList<Integer>(List.of(1,4,6,8,12));
	
		
		numeros.stream().forEach(System.out::println);

	}

}
