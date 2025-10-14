package com;
import java.util.Scanner;
public class Act15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un número primo: ");
		numero=sc.nextInt();
		
		if(numero/numero==1&&numero/1==numero) {
			
		
		
		for (int i=2;numero<i;numero--) {
			
			System.out.println(numero);
			
		}
		
	}else {
		System.out.println("No es un número primo");
	}
		
}

}
