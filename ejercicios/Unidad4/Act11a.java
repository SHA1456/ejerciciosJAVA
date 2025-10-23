package com;

public class Act11a {

	public static void main(String[] args) {
		
		System.out.println(Iterativo(5,4));
		
		
	}
	
	public static double Iterativo (double a, int n) {
		double resultado=1.0;
		for(int i =1;i<=n;i++) {
			resultado=resultado*a;
				
		}
		return resultado;
		
		
		
	}

}
