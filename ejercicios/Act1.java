package com;
import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		
		double t [] = new double[5];
		
		System.out.println("Introduce 5 números decimales: ");
		for(int i = 0; i<t.length;i++) {
			t[i]=sc.nextDouble();
			
		
		}
		
		System.out.println("Los números son: ");
		for(int i =0;i<t.length;i++) {
			
			System.out.println(t [i]);
		}
		

	}

}
