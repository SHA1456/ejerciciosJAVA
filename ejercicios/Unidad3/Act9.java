package com;
import java.util.Scanner;
public class Act9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura,etiqueta=0,maxaltura=0,arbolmasalto=0;
		
	
		
		do {
			
			System.out.println("Introduzca la altura del arbol " + etiqueta + " en cm: ");
			altura=sc.nextInt();
			
			if (altura>maxaltura) {
				maxaltura=altura;
				arbolmasalto=etiqueta;
			}
			
			etiqueta++;
			
			
		}while(altura!=-1);
		
		System.out.println("El árbol más alto es el árbol "+ arbolmasalto + " con " + maxaltura + " cm" );
		
		sc.close();
	}
	

}
