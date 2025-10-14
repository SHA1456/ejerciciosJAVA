package com;
import java.util.Scanner;
public class Act11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero=1;
		
		do {
			
			for(int i=1;i<=10;i++) {
				
				System.out.println(numero + " x " + i + " = " + (numero*i));
				
			}
			
			numero++;
			
			
		}while(numero<=10);
		
		
		sc.close();
		
		
		
		

	}

}
