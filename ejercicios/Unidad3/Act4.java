package com;
import java.util.Scanner;
public class Act4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un número: ");
		numero=sc.nextInt();
		
		for (int i=1;i<=numero;i++) {
			
			System.out.println(i);
			
		}
		
		
		
		sc.close();

	}

}
