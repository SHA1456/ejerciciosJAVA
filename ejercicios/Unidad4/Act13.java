package com;

public class Act13 {

	public static void main(String[] args) {
		
		System.out.println(Factorial(5));

	}
	public static int Factorial (int numero) {
		
		if(numero<0) {
			System.err.println("Número inválido");
			return -1;
		}else if(numero==0) {
		
		return 1;
		
		}else {
			return numero*Factorial(numero-1);
		}
		
		
		
	}

}
