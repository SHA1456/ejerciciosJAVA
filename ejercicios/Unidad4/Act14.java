package com;

public class Act14 {

	public static void main(String[] args) {
		int n=5;
		long resultado=Fibonacci(n);
		System.out.println("El término " + n + "de la serie de Fibonacci es: " + resultado);
		
	}
	
	public static long Fibonacci (int n) {
		if (n==0||n==1) {
			return 1;
		}else {
				return Fibonacci(n-1)+Fibonacci(n-2);
			
			}
	
		}
		
	}


