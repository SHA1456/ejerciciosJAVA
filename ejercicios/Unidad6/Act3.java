package com;
import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder frase = new StringBuilder();
		String palabra;
		
		do {
			
			System.out.println("Introduzca las palabras: ");
			palabra=sc.nextLine().trim();
			
			if(!palabra.equalsIgnoreCase("fin")) {
				
				if(frase.length()>0) {
					frase.append(" ");
				}
				frase.append(palabra);
			}
	
		}while(!palabra.equalsIgnoreCase("fin"));
		System.out.println("La frase completa es: " + frase.toString());
		
		
		

	}

}
