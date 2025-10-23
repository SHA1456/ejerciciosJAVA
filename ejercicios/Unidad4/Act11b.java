package com;

public class Act11b {

	public static void main(String[] args) {
		System.out.println(Recursiva(5,4));

	}
	
	public static double Recursiva (double a, int n) {
		
		if(n==0) {
			return 1.0;
			
		}else {
			return a*Recursiva(a,n-1);
			
		}
		
		
		
	}

}
