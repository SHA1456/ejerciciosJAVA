package com;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el año actual");
	int actual = sc.nextInt();
	System.out.println("Dime tu año de nacimiento");
	int nacimiento = sc.nextInt();
	int edadusuario = actual-nacimiento;
	System.out.println("Tu edad es: " + edadusuario);
	

	}

}
