package com;
import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int numero;
		
		System.out.println("¿Cuántos números desea introducir?");
		n=sc.nextInt();
		int tabla[] = new int [n];
		for (int i=0;i<n;i++) {
			
			System.out.println("Introduzca un número: ");
			tabla[i]=sc.nextInt();
			
			
			
		}
		System.out.println("Números en orden inverso: ");
		for(int i=n-1;i>=0;i--) {
			
			System.out.println(tabla[i]);
			
			
		}
		
		
	}
	

}
