package com;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maximo, minimo, numero;

		System.out.println("Introduce el rango máximo: ");
		maximo = sc.nextInt();

		System.out.println("Introduce el rango mínimo: ");
		minimo = sc.nextInt();

		do {

			System.out.println("Introduzca un número que se encuentre en el rango: ");
			numero = sc.nextInt();

		} while (numero > maximo || numero < minimo);

		System.out.println("¡Número dentro de rango!");

		sc.close();
	}

}
