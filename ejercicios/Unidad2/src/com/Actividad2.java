package com;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1,numero2;
		
		System.out.println("Introduzca un número: ");
		numero1=sc.nextInt();
		
		System.out.println("Introduzca un número: ");
		numero2=sc.nextInt();
		
		//Usamos == para comparar
		if(numero1==numero2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		sc.close();
	}

}
