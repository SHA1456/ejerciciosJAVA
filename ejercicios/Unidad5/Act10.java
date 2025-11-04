package com;
import java.util.Scanner;
public class Act10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduzca un número: ");
		n=sc.nextInt();
		
		int [] tabla = new int [n];
		
		for (int i=0;i<tabla.length;i++) {
		
		System.out.println("Introduzca un número para la tabla: ");
		tabla[i]=sc.nextInt();
		}
		
		int cuentapares=0;
		for(int i=0;i<tabla.length;i++) {
			if(tabla[i]%2==0) {
				cuentapares++;
			}
			
		}
		
		int [] tablapares= new int [cuentapares];
		int [] tablaimpares = new int [n-cuentapares];
		
		int indicepar=0,indiceimpar=0;
		
		for(int i=0;i<tabla.length;i++) {
			
			if(tabla[i]%2==0) {
				tablapares[indicepar]=tabla[i];
				indicepar++;
			}else {
				tablaimpares[indiceimpar]=tabla[i];
				indiceimpar++;
			}
			
			
		}
		System.out.println("Tabla de pares: ");
		for(int i=0;i<tablapares.length;i++) {
			System.out.println(tablapares[i]);
		}
		System.out.println("Tabla de impares: ");
		for(int i=0;i<tablaimpares.length;i++) {
			System.out.println(tablaimpares[i]);
		}
		sc.close();
	}

}
