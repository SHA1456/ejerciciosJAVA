package com;
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float  numero;
		float redondeado;
		
		System.out.println("Introduzca un número decimal: ");
		numero=sc.nextFloat();
		
		redondeado=Math.round(numero);
		
		System.out.println("El número redondeado es: " + redondeado);
		
		sc.close();
		
		

	}

}
