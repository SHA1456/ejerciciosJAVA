package com;
import java.util.Arrays;
public class Act8 {

	public static void main(String[] args) {
		
		int [] tabla = {1,2,3,4,4,6,7,8,8,9,10,10};
		
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
		

	}
	
	public static boolean contiene (int tabla [] , int valor) {
		
		boolean ret=false;
		
		for (int i=0;i<tabla.length;i++) {
			
			if(tabla[i] == valor) {
				return true;
			}
			
		}
		return false;
	}
	
	public static int [] insertar (int tabla [] , int valor) {
		
		int [] nuevatabla = Arrays.copyOf(tabla, tabla.length+1);
		nuevatabla[nuevatabla.length-1]=valor;
		return nuevatabla;
	}
	
	
	public static int [] sinRepetidos (int [] tabla) {
		
		int [] res = Arrays.copyOf(tabla, 1);
		
		for (int i=0;i<tabla.length;i++) {
			
			if(!contiene(res, tabla[i])) {
				
				res=insertar(res, tabla[i]);
				
			}
			
		}
		return res;
		
		
		
		
	}

}
