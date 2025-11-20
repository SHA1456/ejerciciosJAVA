package com;
import java.util.Arrays;
import java.util.Scanner;
public class Act12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palabra1,palabra2;
		
		System.out.println("Introduzca una palabra: ");
		palabra1=sc.nextLine();
		palabra1=palabra1.toLowerCase();
		
		System.out.println("Introduzca otra palabra: ");
		palabra2=sc.nextLine();
		palabra2=palabra2.toLowerCase();
		
		if(SonAnagramas(palabra1,palabra2)) {
			System.out.println("Las dos palabras son anagramas");
		}else {
			System.out.println("No son anagramas");
		}
		
		
	}
	
	public static boolean SonAnagramas (String palabra1,String palabra2) {
		if(palabra1.length()!=palabra2.length()) {
			return false;
		}
		
		char [] array1= palabra1.toCharArray();
		char [] array2= palabra2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
	}

}
