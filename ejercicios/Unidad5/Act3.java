package com;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un número: ");
		numero=sc.nextInt();
		
		int numeros[] = new int [numero];
		
		for(int i=0;i<numero;i++) {
			
			System.out.println("Introduce un número: ");
			numeros[i]=sc.nextInt();
			
		}
		
		double mediapositivos=mediaPositivos(numeros);
		double medianegativos=mediaNegativos(numeros);
		double cuentaceros=cuentaCeros(numeros);
		
		System.out.println("La media de positivos es: " + mediaPositivos(numeros));
		System.out.println("La media de negativos es: " + mediaNegativos(numeros));
		System.out.println("El número de ceros es: " + cuentaCeros(numeros));
	}
	
	public static int mediaPositivos (int [] t) {
		
		int contador=0;
		int suma=0;
		for(int i=0;i<t.length;i++) {
			if(t[i]>0) {
				contador++;
				suma=suma+t[i];
			}
		}
		
		if(contador==0) {
			return 0;
		}else {
			return suma/contador;
		}
		
	
		
	}
	
	public static int mediaNegativos (int [] t) {
		
		int contador=0;
		int suma=0;
		
		for(int i=0;i<t.length;i++) {
			
			if(t[i]<0) {
				
				contador++;
				suma=suma+t[i];
				
			}
		}
		if(contador==0) {
			return 0;
		}else {
			return suma/contador;
		}
		
	
	}
	
	public static int cuentaCeros (int [] t) {
		
		int contador=0;
		
		for(int i=0;i<t.length;i++) {
			if(t[i]==0) {
				contador++;
			}
			
			
		}
		return contador;
		
		
	}

}
