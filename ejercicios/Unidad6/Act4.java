package com;
import java.util.Scanner;
public class Act4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Introduzca una frase: ");
		frase=sc.nextLine();
		
		int contadorespacios=0;
		
		for(int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)== ' ') {
				contadorespacios++;
			}
		}
		
		System.out.println("La frase tiene " + contadorespacios + " espacios en blanco");
		
	}

}
