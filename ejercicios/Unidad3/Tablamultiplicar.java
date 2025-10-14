package com;
import java.util.Scanner;
public class Tablamultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Dime un número del 1 al 10 y escribiré su tabla de multiplicar: ");
		numero=sc.nextInt();
		
		for (int i=0;i<=10;i++) {
			
			System.out.println(numero + "x" + i + "=" +(numero*i));
			
		}
		

	}

}
