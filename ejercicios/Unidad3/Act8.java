package com;
import java.util.Scanner;
public class Act8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,factorial=1;
		
		System.out.println("Introduzca un número: ");
		numero=sc.nextInt();
		
		for(int i=1;i<=numero;i++) {
			factorial=factorial*i;
			
		}
		System.out.println("El factorial de: " + numero + " es " + factorial);

	}

}
