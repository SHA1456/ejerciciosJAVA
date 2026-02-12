package es.iescamas.programacion.ej1;

import java.util.Arrays;

public class Ej1_sumaMatrices {

	public static void main (String [] args) {
		
		int [] a = {1,2,3};
		int [] b = {4,5,6};
		
		
		System.out.println(Arrays.toString(sumaMatrices(a,b)));
	}
	
	
	
	
	public static int [] sumaMatrices (int [] a, int [] b) {
		
		int [] suma = new int [a.length];
		if(a.length>b.length||b.length>a.length) {
			throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
		}else {
			
			for(int i=0;i<a.length;i++) {
				suma[i]=a[i]+b[i];
				
			}
			return suma;
			
		}
		
		
	}
	
}
