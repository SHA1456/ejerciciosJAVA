package com;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		int y = suma (3,2)+ 1;
		System.out.println(y);
	}
	
	public static void mostrar (String mensaje){
		
		System.out.println(mensaje);
		
	}
	public static void mostrar (int numero) {
		
		if (numero%2==0) {
			System.out.println("El número " + numero + " es par");
			
			
		}else {
			System.out.println("El número " + numero + " es impar");
		}
	}
	
	public static void mostrar (String mensaje, int veces) {
		
		while (veces>0) {
			
			System.out.println(mensaje);
			veces--;
		}
		
	}
		public static int factorial (int n) {
				
				if(n==0)
					return 1;
				else
					return n*factorial(n-1);
			}
		public static int suma (int x, int y) {
			
			int suma= x+y;
			System.out.println(suma);
			return suma;
		}
}
