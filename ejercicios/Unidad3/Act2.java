package com;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int edad = 0, sumaedad = 0, mayoredad = 0, contador = 0;
		double media;
		
		
		while (edad >= 0) {
			
			System.out.println("Introduzca la edad del alumno");
			edad = sc.nextInt();
			
			
			if (edad<0) {
				break;
			}
			if (edad >= 18) {

				mayoredad++;
			}
			
			sumaedad = edad + sumaedad; //igual que poner +=edad
			contador++;
			
		}
		media = sumaedad / contador;
		System.out.println("La suma de todas las edades es: " + sumaedad);
		System.out.println("La media de las edades es: " + media);
		System.out.println("El número de alumnos introducido es: " + contador);
		System.out.println("El número de alumnos mayores de edad es: " + mayoredad);

		sc.close();
		
		
	}

}
