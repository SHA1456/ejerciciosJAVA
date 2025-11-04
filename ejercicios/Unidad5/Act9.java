package com;
import java.util.Scanner;
public class Act9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] [] notas = new int [5][3];
		System.out.println(notas.length);
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduzca las notas del alumno " + (i+1) );
	
			for(int j=0;j<3;j++) {
				System.out.println("Introduzca la nota del " + (j+1)+"º trimestre");
				notas[i][j]=sc.nextInt();
			}
		}
		
		
		for(int j=0;j<3;j++) {
			int sumatrimestre=0;
			for(int i=0;i<notas.length;i++) {
				sumatrimestre=sumatrimestre+notas[i][j];
			}
			double mediatrimestre=sumatrimestre/5;
			System.out.println("La media del trimestre : "+ (j+1)+ " es: " + mediatrimestre);
		}
		
			
			
		System.out.println("Introduce la posición del alumno (1 a 5) para saber su media: ");
		int pos=sc.nextInt()-1;
		
		if(pos>0&&pos<6) {
			int sumalumno=0;
			for(int j=0;j<3;j++) {
				sumalumno=sumalumno+notas[pos][j];
			}
			double medialumno=sumalumno/3;
			System.out.println("La media del alumno " + (pos+1) + " es:" + medialumno);
		}else {
			System.out.println("La posición introducida es inválida");
		}
		sc.close();
	}

}
