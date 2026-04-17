package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(2,4,5,6,7,8,9));
		
		numeros.stream().map(n->n*n).forEach(System.out::println);

	}

}
