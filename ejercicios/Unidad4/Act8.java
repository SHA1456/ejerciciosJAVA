package com;

public class Act8 {

	public static void main(String[] args) {
		System.out.println(divisoresPrimos(4));
		System.out.println(divisoresPrimos(10));
		System.out.println(divisoresPrimos(30));

	}

	
	public static int divisoresPrimos(int num) {
		int contador=0;
		for (int i=2;i<num;i++) {
			if(Act7.esPrimo(i)&& num%i==0) {
				contador++;
			}
		}
		return contador;
		
	}
	
	
}
