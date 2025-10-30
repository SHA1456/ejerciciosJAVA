package com;
import java.util.Scanner;
import java.util.Random;
public class Act5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int longitud;
		
		System.out.println("Introduce la longitud de la combinación: ");
		longitud=sc.nextInt();
		
		int [] combinacion= new int [longitud];
		
		for(int i=0;i<longitud;i++) {
			
			combinacion[i]=random.nextInt(5)+1;
			
		}
		int fallos;
		int intento[]=new int[longitud];
		
		System.out.println("Intenta adivinar la combinación secreta: ");
		
		do {
			
			fallos=0;
			
			System.out.println("Introduce un número: ");
			
			for(int i=0;i<longitud;i++) {
				System.out.println("Posición: " + (i+1) + ":");
				intento[i]=sc.nextInt();
				
			}
			
			for(int i=0;i<longitud;i++) {
				
				if(intento[i]<combinacion[i]) {
					System.out.println("Posición " + (i+1) + ": Tu número es menor");
					fallos++;
					
				}else if(intento[i]>combinacion[i]) {
					System.out.println("Posición " + (i+1) + ": Tu número es mayor");
					fallos++;
					
				}else {
					System.out.println("Posición " + (i+1) + ": Número correcto");
				}
				
			}
			
		}while(fallos!=0);
		
		System.out.println("¡Has abierto la cámara secreta!");
		sc.close();
	}

}
