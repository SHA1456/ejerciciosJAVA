package com;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1,nota2,nota3,media;
		double mediadecimal;
		
		System.out.println("Introduzca la primera nota: ");
		nota1=sc.nextInt();
		
		System.out.println("Introduzca la segunda nota: ");
		nota2=sc.nextInt();
		
		System.out.println("Introduzca la tercera nota: ");
		nota3=sc.nextInt();
		
		media=(nota1+nota2+nota3)/3;
		mediadecimal=(nota1+nota2+nota3)/3.0;
		
		System.out.println("La media del boletín es: " + media);
		
		System.out.println("La media del expediente es: " + mediadecimal);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
