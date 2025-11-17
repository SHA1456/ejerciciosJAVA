package com;
import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña;
		String intento;
		
		System.out.println("Introduzca la contraseña: ");
		contraseña=sc.nextLine();
		
		System.out.println("Las pistas son las siguientes: ");
		System.out.println("La longitud de la palabra es de " + contraseña.length() + " caracteres");
		System.out.println("El primer caracter es: " + contraseña.charAt(0));
		System.out.println("El último caracter es: " + contraseña.charAt(contraseña.length()-1));
		
		do {
			System.out.println("Intenta adivinar la contraseña: ");
			intento=sc.nextLine();
			
			if(!intento.equals(contraseña)) {
				System.out.println("Contraseña incorrecta, intentalo de nuevo");
			}
			
			
		}while(!intento.equals(contraseña));
		System.out.println("¡Contraseña correcta!");
		sc.close();
		
	}

}
