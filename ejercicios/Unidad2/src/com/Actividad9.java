package com;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float numero;
		
		System.out.println("Introduzca un número entre 0 y 99,999: ");
		numero=sc.nextFloat();
		
		if (numero<10&&numero>=0) {
			System.out.println("El número tiene una cifra");
		}else if (numero>10&&numero<100){
			System.out.println("El número tiene dos cifras");
		}else if (numero>100&&numero<1000) {
			System.out.println("El número tiene tres cifras");
		}else if (numero>1000&&numero<10000) {
			System.out.println("El numero tiene cuatro cifras");
		}else if (numero>10000&&numero<100000) {
			System.out.println("El numero tiene cinco cifras");
		}else if (numero<0||numero>99999) {
			System.out.println("Número no válido");
		}
		
		
		sc.close();
	}

}
