package com;
import java.util.Arrays;
import java.util.Scanner;
public class Act6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] puntos = new int [5];
		
		System.out.println("Introduce las puntuaciones de los programadores: ");
		for(int i=0;i<puntos.length;i++) {
			System.out.println("Programador " + (i+1) + ":");
			puntos[i]=sc.nextInt();
			
		}
		
		Arrays.sort(puntos);
		System.out.println("\nPuntuaciones ordenadas: ");
		System.out.println(Arrays.toString(puntos));
		
		for (int i=0;i<3;i++) {
			
			System.out.println("Introduce la puntuación del programador de exhibición " + (i+1) + ":");
			int nuevapuntuacion=sc.nextInt();
			
			if (nuevapuntuacion==-1) {
				break;	
			}
			
			puntos=Arrays.copyOf(puntos, puntos.length+1);
			puntos[puntos.length-1]=nuevapuntuacion;
			
			Arrays.sort(puntos);
			System.out.println("Puntuaciones actualizadas: ");
			System.out.println(Arrays.toString(puntos));
			
			
			
		}
		
		System.out.println("Puntuaciones finales: ");
		Arrays.toString(puntos);
		
		sc.close();
		
		
		
		
		
	
	}

}
