package com;
import java.util.Scanner;
public class Act6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String caracteres;
			
		System.out.println("Introduzca una cadena de caracteres: ");
		caracteres=sc.nextLine();
		
		StringBuilder reves = new StringBuilder(caracteres);
		
		reves.reverse();
		
		System.out.println(reves.toString());
		
		sc.close();
	}

}
