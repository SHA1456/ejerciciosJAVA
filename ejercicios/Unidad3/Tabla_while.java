package com;

import java.util.Scanner;

public class Tabla_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int i = 0;

		System.out.println("Introduzca un número del 1 al 10 para saber su tabla de multiplicar: ");
		numero = sc.nextInt();

		while (i <= 10) {

			System.out.println(numero + "x" + i + "=" + (numero * i));
			i++;
		}

		sc.close();
	}

}
