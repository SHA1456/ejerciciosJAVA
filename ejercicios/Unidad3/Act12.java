package com;
import java.util.Scanner;
public class Act12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota,numnota=1,suspenso=0;
		
		while(numnota<6) {
			
			System.out.println("Introduzca la nota: ");
			nota=sc.nextInt();
			
			numnota++;
			
			if (nota<5&&nota>=0) {
				suspenso++;
			}
			
		}
		
		if(suspenso>0) {
			System.out.println("Hay "+ suspenso + " suspensos");
		}else {
			System.out.println("No hay suspensos");
		}
		
	}

}
