package com;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		boolean esmayor;
		
		System.out.println("Qué edad tienes: ");
		edad = sc.nextInt();
		//Calculamos la edad
		esmayor=edad>=18;
		
		System.out.println("¿Es mayor: " + esmayor);
		
		
		
		
		

	}

}
