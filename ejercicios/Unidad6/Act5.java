package com;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String vocales= "aeiouáéíóúAEIOUÁÉÍÓÚ";
		StringBuilder resultado = new StringBuilder();
		
		System.out.println("Introduce tu nombre completo: ");
		nombre=sc.nextLine();
		
		for(int i=0;i<nombre.length();i++) {
			
			char c = nombre.charAt(i);
			
			if(vocales.indexOf(c)==-1) {
				
				resultado.append(c);
				
			}
			
		}
		
		System.out.println("El nombre completo sin vocales es : " + resultado);
	}

}
