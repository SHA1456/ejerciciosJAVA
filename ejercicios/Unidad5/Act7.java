package com;
import java.util.Arrays;
import java.util.Scanner;
public class Act7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] tabla1 = new int [6];
		int [] tabla2 = new int [6];
		
		for (int i=0;i<tabla1.length;i++) {
			System.out.println("Introduce el número: " + (i+1) + " de la tabla 1");
			tabla1[i]=sc.nextInt();
		}
		
		for(int i=0;i<tabla2.length;i++) {
			System.out.println("Introduce el número: " + (i+1) + " de la tabla 2");
			tabla2[i]=sc.nextInt();
		}
		
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
		
		int[] tabla3= new int [tabla1.length+tabla2.length];
		
		int i1=0,i2=0,i3=0;
		
		while(i3<tabla3.length) {
			
			if(i1==tabla1.length) {
				tabla3[i3++]=tabla2[i2++];
			}else if(i2==tabla2.length) {
				tabla3[i3++]=tabla1[i1++];
			}else if(tabla1[i1]<tabla2[i2]) {
				tabla3[i3++]=tabla1[i1++];
			}else {
				tabla3[i3++]=tabla2[i2++];
			}
			
			
			
			
		}
		
		System.out.println("La tabla 3 ordenada es: " + Arrays.toString(tabla3));
		
		sc.close();
		
	}

}
