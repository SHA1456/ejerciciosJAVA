package com;
import java.util.Random;
import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numerosecreto=random.nextInt(100)+1;
		int intento=0;
		
		System.out.println("Adivina el número secreto entre 1 y 100");
		System.out.println("Introduce -1 para rendirte");
		
		while (true) {
			
			System.out.println("Escriba un número: ");
			intento=sc.nextInt();
			
			if(intento==-1) {
				System.out.println("Te has rendido");
				break;
			}
			
			if (intento==numerosecreto) {
				System.out.println("¡Has acertado!");
				break;
				
			}else if(intento>numerosecreto) {
				
				System.out.println("Menor");
			}else if(intento<numerosecreto) {
				
				System.out.println("Mayor");
				
			}
			
		}

	}

}
