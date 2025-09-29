package com;
import java.util.Locale; //Para poder usar puntos (aunque no deja usar comas)
import java.util.Scanner;
public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		
		double numero;
		
		System.out.println("Introduzca un número decimal: ");
		numero=sc.nextDouble();
		
		if(numero>-1 && numero<1 && numero!=0) {
			
			System.out.println("Es un número casi cero");
			
					
		}else {
			System.out.println("No es un número casi cero");
		}
		sc.close();
	}

}
