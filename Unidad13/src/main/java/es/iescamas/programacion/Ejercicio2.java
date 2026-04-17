package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(2,4,5,6,7,8,9));
		
		numeros.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
