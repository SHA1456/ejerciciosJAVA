package es.iescamas.programacion;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1,20, 30, 100);
		System.out.println(numeros);
		numeros.stream().filter(n -> n > 10).toList();
	}

}
