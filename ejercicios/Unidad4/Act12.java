package com;
import java.util.Scanner;
public class Act12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion,n1,n2;
		
		System.out.println("Introduzca un número: ");
		n1=sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		n2=sc.nextInt();
		
		System.out.println("Elige una opción: (1) Suma, (2) Resta, (3) Multiplicación, (4) División");
		opcion=sc.nextInt();
		
		if (opcion==1||opcion==2||opcion==3||opcion==4) {
			int resultado = Calculadora(n1,n2,opcion);
			System.out.println("Resultado: " + resultado);
			
		}else {
			System.err.println("Opción inválida");
		}
		
		
	}
	
	public static int Calculadora (int n1,int n2, int opcion) {
		
		if (opcion==1) {
			return n1+n2;
		}else if(opcion==2) {
			return n1-n2;
		}else if (opcion==3) {
			return n1*n2;
		}else if (opcion==4) {
			
			if (n2!=0) {
				return n1/n2;
			}else {
				System.err.println("División no válida");
			}
		}else {
			return 0;
		}
		return opcion;
		
		
		
	}

}
