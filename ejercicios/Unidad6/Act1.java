package com;
import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1,palabra2;
		
		System.out.println("Introduzca una palabra: ");
		palabra1=sc.nextLine();
		System.out.println("Introduzca otra palabra: ");
		palabra2=sc.nextLine();
		
		if (palabra1.length()>palabra2.length()) {
			System.out.println("La palabra más larga es: " + palabra1);
			
		}else if(palabra1.length()==palabra2.length()) {
		
			System.out.println("Las dos palabras son iguales");
			
		}else {
			System.out.println("La palabra más larga es: " + palabra2);
		}
		
		sc.close();
	}

}
