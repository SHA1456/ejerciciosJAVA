package com;
import java.util.Scanner;
public class Act10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;

		
		System.out.println("Introduzca un número del 0 al 9999: ");
		numero=sc.nextInt();
		
		int unidades=numero%10;
		int decenas=numero/10;
		int centenas=numero/100;
		int millares=numero/1000;
		if (numero<10) {
			
			System.out.println("No es capicúa");
			
		}else if(numero<100&&numero>10&&unidades==decenas) {
			
			System.out.println("Es capicúa");
		
		
		}else if (numero<1000&&numero>100&&unidades==centenas) {
			System.out.println("Es capicúa");
			
		}else if (numero>1000&&numero<10000&&unidades==millares) {
			
			System.out.println("Es capicúa");
			
		}else if(numero<0||numero>9999) {
			System.out.println("Número no válido");
		}else {
			System.out.println("No es capicúa");
		}
		
		sc.close();
	}
	





}
