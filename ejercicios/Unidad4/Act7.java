package com;

public class Act7 {

	public static void main(String[] args) {
		int numero=30;
		
		if (esPrimo(numero)) {
			System.out.println(numero + " es primo");
		}else {
			System.out.println(numero + " no es primo");
		}

	}

	public static boolean esPrimo (int numero) {
		
		if (numero<1) {
			return false;
		}
		
		int i=2;
		double raiz=Math.sqrt(numero);
		while(i<=raiz) {
			if (numero%i==0) {
				return false;
			}
			i++;
			
			
		}
		return true;
		
		
		
	}
}
