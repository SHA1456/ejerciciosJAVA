package com;
import java.util.Scanner;
public class Act14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduzca un número: ");
		n=sc.nextInt();
		
		for (int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
