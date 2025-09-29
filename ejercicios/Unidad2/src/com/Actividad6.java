package com;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1,numero2;
		//Leer los números
		System.out.println("Introduzca un número: ");
		numero1=sc.nextInt();
		System.out.println("Introduzca otro número: ");
		numero2=sc.nextInt();
		
		if (numero1>numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}else {
			System.out.println(numero2 + " es mayor que " + numero1);
		}
		
		sc.close();
		

	}

}
