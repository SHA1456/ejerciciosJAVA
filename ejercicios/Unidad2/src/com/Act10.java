package com;
import java.util.Scanner;
public class Act10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String Capicua="Capicúa";
		final String Negacion="No";
		int numero;
		
		System.out.println("Introduzca un número del 0 al 9999: ");
		numero=sc.nextInt();
		
		int unidades=numero%10;
		int decenas=numero/10;
		int centenas=numero/100;
		
		if (numero<10) {
			
			System.out.println("No es capicúa");
			
		}else if(numero<100&&numero>10) {
			
		
		}if (unidades==decenas) {
			System.out.println("Es capicúa");
			
			
		}else {
			System.out.println("No es capicúa");
		}if (numero<=999) {
			
			
		}if (centenas==unidades) {
			
			System.out.println("Es capicua");
			
			
		}else {
			System.out.println("No es capicúa");
		}
		
		
		

	}

}
