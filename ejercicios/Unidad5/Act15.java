package com;
import java.util.Scanner;
public class Act15 {

	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Dime el tamaño de la tabla: ");
		int tam=sc.nextInt();
		
		int [] t = new int [tam];
		
		System.out.println("El número de impares es: " + rellenaPares (t));
		
	}
	
	public static int rellenaPares (int [] t) {
		
		int impares=0;
		
		for(int i=0;i<t.length;i++) {
			
			System.out.println("Dime los números para introducir en la tabla:");
			int valor = sc.nextInt();
			
			if(valor%2==0) {
				valor=t[i];
			}else {
				impares++;
			}
		}
		
		return impares;
		
		
		
	}

}
