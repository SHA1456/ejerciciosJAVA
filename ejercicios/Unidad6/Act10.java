package com;
import java.util.Scanner;
public class Act10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char [] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		String palabra;
		StringBuilder palabracodificada = new StringBuilder();
		
		
		System.out.println("Introduce una palabra: ");
		palabra=sc.nextLine();
		
		for(int i=0;i<palabra.length();i++) {
			char c=palabra.charAt(i);
			palabracodificada.append(codifica(conjunto1,conjunto2,c));
		}
		
		System.out.println("La palabra codificada es: " + palabracodificada.toString());
		

	}
	
public static char codifica (char conjunto1 [], char conjunto2 [], char c) {
	
	c=Character.toLowerCase(c);
	
	for(int i=0;i<conjunto1.length;i++) {
		
		if (c==conjunto1[i]) {
			return conjunto2[i];
		}
		
	}
	
	return c;
	
}
}
