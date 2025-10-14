package com;
import java.util.Scanner;
public class Act15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean esPrimo;
		int numero,i=2,divisor;
		
		System.out.println("Introduzca un número: ");
		numero=sc.nextInt();
		
		while(i<numero) {
			
			esPrimo=true;
			divisor=2;
			
			while(divisor<1) {
				
				if(i%divisor==0) {
					esPrimo=false;
					break;
					
				}
				divisor++;
			}
			if(esPrimo&&i>=2) {
				System.out.println(i + " Es primo");
				
			}else {
				System.out.println(i + " No es primo");
			}
			i++;
			
		}
		
		sc.close();
		
}

}
