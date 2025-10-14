package com;
import java.util.Scanner;
public class Act13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota,numnota=1,aprobado=0,cond=0,suspenso=0;
		
		while(numnota<7) {
			
			System.out.println("Introduzca la nota: ");
			nota=sc.nextInt();
			
			numnota++;
			
			if(nota<0||nota>10) {
				System.err.println("Número no válido");
				break;
			}
			
			if(nota<4&&nota>0) {
				suspenso++;
			}
			if(nota==4) {
				cond++;
			}
			if (nota>=5) {
				aprobado++;
			}
			
		}
		System.out.println("Hay " + aprobado + " aprobados, " + cond + " condicionados y " + suspenso + " suspensos");
		sc.close();
	}

}
