package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>(List.of(2,4,5,6,7,8,9));
		
		int suma=numeros.stream().reduce(0, Integer::sum);
		
		System.out.println(suma);

	}

}
