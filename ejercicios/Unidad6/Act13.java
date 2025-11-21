package com;
import java.util.Scanner;
public class Act13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introduzca una frase: ");
		frase=sc.nextLine();
		
		frase=frase.toLowerCase().trim();
		
		int [] contadores = new int [26];
		
		for(int i=0;i<frase.length();i++) {
			
			char c = frase.charAt(i);
			
			if(c>='a'&& c<='z') {
				
				contadores[c-'a']++;
				
			}
			
		}
		
		System.out.println("Resultado: ");
		for(int i=0;i<26;i++) {
			
			if(contadores[i]>0) {
				
				char letra= (char) (i+'a');
				int veces=contadores[i];
				
				System.out.println(letra + " : " + veces + (veces == 1 ? " vez" : " veces"));
			}
			
			
			
		}
		
				
	}

}
