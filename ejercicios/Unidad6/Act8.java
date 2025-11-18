package com;
import java.util.Scanner;
public class Act8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introduce una frase para saber si es palíndroma: ");
		frase=sc.nextLine();
		
		frase = frase.trim().replaceAll("\\s", "").toLowerCase();
		
		StringBuilder invertida = new StringBuilder (frase);
		invertida.reverse();
		
		if (frase.equals(invertida.toString())) {
			System.out.println("Es palíndroma");
		}else {
			System.out.println("No es palíndroma");
		}
		
		
		sc.close();
		
	}

}
