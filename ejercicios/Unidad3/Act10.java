package com;
import java.util.Scanner;
public class Act10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un número: ");
		numero=sc.nextInt();
		

		
		for(int i=1;i<=10;i++) {
			
			if(numero<0||numero>10) {
				System.err.println("Número no válido");
				break;
			}
			
			System.out.println(numero + " x " + i + " = " + (numero*i));
			
		}
	}

}
