package com;
import java.util.Scanner;
public class Act15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número del 1 al 7: ");
		numero=sc.nextInt();
		
		if (numero==1) {
			
			System.out.println("Es lunes");
		}else if(numero==2) {
			
			System.out.println("Es martes");
		}else if (numero==3) {
			
			System.out.println("Es miércoles");
		}else if (numero==4) {
			
			System.out.println("Es jueves");
			
		}else if (numero==5) {
			
			System.out.println("Es viernes");
		}else if(numero==6) {
			
			System.out.println("Es sábado");
			
		}else if(numero==7) {
			
			System.out.println("Es domingo");
			
		}else {
			
			System.out.println("Número no válido");
		}
		
		sc.close();
		
		

	}

}
