package com;
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio de la circunferencia");
		int radio = sc.nextInt();
		double longitud = 2*3.14*radio;
		double area = 3.14*radio*radio;
		System.out.println("La longitud es: " + longitud +  " y el área es: " + area);
		
		

	}

}
