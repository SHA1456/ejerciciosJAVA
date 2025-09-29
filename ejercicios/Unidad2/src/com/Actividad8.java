package com;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,ecuacionp,ecuacionn,discriminante;
		
		System.out.println("Introduzca el coeficiente a : ");
		a=sc.nextDouble();
		
		System.out.println("Introduzca el coeficiente b : ");
		b=sc.nextDouble();
		
		System.out.println("Introduzca el coeficiente c : ");
		c=sc.nextDouble();
		
		discriminante=(b*b)-(4*a*c);
		ecuacionp=(-b+Math.sqrt(discriminante))/(2*a);
		ecuacionn=(-b-Math.sqrt(discriminante))/(2*a);
		if (a==0) {
			System.out.println("No existe la ecuación");
		}else {
			System.out.println("La solución positiva es: " + ecuacionp);
			System.out.println("La solución negativa es: " + ecuacionn);
		}

	}

}
