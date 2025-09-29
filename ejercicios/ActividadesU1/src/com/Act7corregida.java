package com;
import java.util.Scanner;

public class Act7corregida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio, longitud, area;
		final double PI = Math.PI;
		//final porque es constante
		System.out.println("Dime el radio");
		radio=sc.nextFloat();
		//Calculamos
		
		longitud = 2 *PI *radio;
		area= PI* Math.pow(radio, 2);
		System.out.println("La longitud de radio" + radio + "es" + longitud);
		System.out.println("El área de radio" + radio + "es" + area);

	}

}
