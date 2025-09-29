package com;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Todas las preguntas tienen que ser respondidas con true/false");
		boolean lloviendo,biblioteca,tareas,salir;
		
		System.out.println("¿Está lloviendo?");
		lloviendo=sc.nextBoolean();
		
		System.out.println("¿Has terminado las tareas?");
		tareas=sc.nextBoolean();
		
		System.out.println("¿Tienes que ir a la biblioteca?");
		biblioteca=sc.nextBoolean();
		
				
		salir= (!lloviendo&&tareas) || (biblioteca);
		System.out.println("¿podrá salir?" + salir);
	}

}
