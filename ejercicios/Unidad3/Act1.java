package com;
import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Inicialización de variables
		int numero=1,cuadrado;
		boolean espar,positivo;
		
		while(numero!=0){
			
			System.out.println("Introduzca un número: ");
			numero=sc.nextInt();
			
			espar=numero%2==0;
			positivo=numero>0;
			cuadrado=numero*numero;
			
			System.out.println("¿Es par? " + espar + "\n¿Es positivo? "+ positivo + "\nSu cuadrado es: " + cuadrado);
			
		}
		
		
		
		

	}

}
