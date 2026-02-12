package es.iescamas.programacion.ej4;

import java.util.Arrays;

public class Orden_alfabetico {

	public static void main (String [] args) {
		
		String[] miArray = {"Pera", "manzana", "uva", "naranja", "kiwi"};
		
		System.out.println(Arrays.toString(ordenalf(miArray)));
		
	}
	
	
	
	public static String [] ordenalf (String [] miArray) {
		
		
		
		for(int i=0;i<miArray.length;i++) {
			
			miArray[i]=miArray[i].toLowerCase();
			
			Arrays.sort(miArray);
			
			
		}
		
		return miArray;
	}
	
}
