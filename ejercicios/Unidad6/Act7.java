package com;
import java.util.Scanner;
public class Act7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador=0;
		int indice=0;
		String frase;
		String palabra;
		
		System.out.println("Escribe una frase: ");
		frase=sc.nextLine();
		
		System.out.println("Introduce una palabra: ");
		palabra=sc.nextLine();
		
		frase.toLowerCase();
		palabra.toLowerCase();
		
		
		while(indice<frase.length()) {
			indice=frase.indexOf(palabra,indice);
			
			if(indice==-1) {
				break;
			}
			
			contador++;
			indice=indice+palabra.length();
			
		}
		
		System.out.println("La palabra " + palabra + " aparece " + contador + " veces en la frase");
			
			
			
		}
		
		
	}


