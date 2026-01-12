package com;

public class Texto {
	
	private String cadena;
	
	private int tamannocadena;
	
	private char [] vocales = {'a','e','i','o','u','A','E','I','O','U'};
	
	public Texto (String cadena,int tamannocadena) {
		this.cadena=cadena;
		this.tamannocadena=tamannocadena;
	}
	
	public void caracterprincipio (char caracter) {
		
		if (cadena.length()>0&&cadena.length()<tamannocadena) {
			cadena=caracter+cadena;
			System.out.println(cadena);
		}else {
			System.out.println("La cadena está vacía");
		}
		
	}
	
	public void caracterfinal (char caracter) {
		if(cadena.length()>0&&cadena.length()<tamannocadena) {
			cadena=cadena+caracter;
			System.out.println(cadena);
		}
	}
	
	
	public void cadenaprincipio (String cadenap) {
		if(cadena.length()<tamannocadena&&cadena.length()+cadenap.length()<tamannocadena) {
			cadena=cadenap+cadena;
			System.out.println(cadena);
		}else {
			System.out.println("Longitud de cadena incorrecta");
		}
	}
	
	public void cadenafinal (String cadenaf) {
		if(cadena.length()<tamannocadena&&cadena.length()+cadenaf.length()<tamannocadena) {
			cadena=cadena+cadenaf;
			System.out.println(cadena);
		}else {
			System.out.println("Longitud de cadena incorrecta");
		}
	}
	
	public int nvocales () {
		int nvocales=0;
		char [] vocales={'a','e','i','o','u','A','E','I','O','U','á','é','í','ó','ú','Á','É','Ó','Í','Ú'};
		for(int i=0;i<cadena.length();i++) {
		
			char c = cadena.charAt(i);
			
			for(int j=0;j<vocales.length;j++) {
				if(c==vocales[j]) {
					nvocales++;
					break;
				}
			}
			
		}
		return nvocales;
		
	}
	
}
