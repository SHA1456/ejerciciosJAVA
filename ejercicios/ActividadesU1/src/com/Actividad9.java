package com;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero;
	boolean par;
	System.out.println("Introduce un número: ");
	numero=sc.nextInt();
	par=numero%2==0;
	
	System.out.println("Par " + par);

	}

}
