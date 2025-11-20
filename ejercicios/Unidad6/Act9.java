package com;
import java.util.Scanner;
public class Act9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String javalandia = "Javalín, javalón";
		String dialecto = "javalén, len, len";
		String frase;
		String mensaje;
		
		System.out.println("Introduzca una frase: ");
		frase=sc.nextLine();
		
		if (frase.contains(javalandia)) {
			mensaje = frase.substring(javalandia.length()).trim();
			System.out.println("Esta frase está escrita en el idioma de javalandia.");
			System.out.println("La frase traducida es: " + mensaje);
			
		}else if (frase.endsWith(dialecto)){
			mensaje=frase.substring(dialecto.length()).trim();
			System.out.println("La frase traducida es: " + mensaje);
			
		}else {
			System.out.println("La frase no está escrita en el idioma de javalandia");
		}
		
		

	}

}
