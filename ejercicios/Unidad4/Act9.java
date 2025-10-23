package com;

public class Act9 {

	public static void main(String[] args) {
		
		System.out.println("Divisores primos de 220:");
		DPrimos(220);
	}
	
	public static void DPrimos (int numero) {
		
		int contador=0; //Cuenta el total de divisores primos
		
		for(int i=2;i<numero;i++) {
			
			if(Act7.esPrimo(i)&&numero%i==0) {
				
				System.out.println(i);
				contador++;
			}
			
		}
		
		System.out.println("Hay " + contador + " divisores primos");
		
		
		
	}

}
