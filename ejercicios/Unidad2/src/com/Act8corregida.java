package com;
import java.util.Scanner;
public class Act8corregida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definir las variables
		double coefA,coefB,coefC,resultado_x1,resultado_x2,delta,delta_raiz;
		
		//Pedir los coeficientes
		
		System.out.println("Dime cuánto vale a, b y c");
		coefA=sc.nextDouble();
		coefB=sc.nextDouble();
		coefC=sc.nextDouble();
		
		//Calcular dentro de la raíz
		delta=(coefB*coefB)-4*coefA*coefC;
		delta_raiz=Math.sqrt(delta);
		
		if(coefA==0) {
			
			if(coefB !=0) {
				resultado_x1=-coefC/coefB;
				System.out.println("Esto es una ecuación de primer grado.");
				System.out.println("x vale " + resultado_x1);
			}else {
				//coefA-->0; coefB-->0;
				System.out.println("0 !=" + coefC + ", es inconsistente");
				
				
			}
			}else {
				//coef !=0
				if(delta>0) {
					
					delta_raiz=Math.sqrt(delta);
					//solucion 1
					resultado_x1=((-1*coefB)+delta_raiz)/(2*coefA);
					//solucion 2
					resultado_x2=((-1*coefB)-delta_raiz)/(2*coefA);
					
					System.out.println("Hay dos resultados");
					System.out.println("resultado_x1: " + resultado_x1);
					System.out.println("resultado_x2: " + resultado_x2);
					
				}
					
				
			}

	}
}
