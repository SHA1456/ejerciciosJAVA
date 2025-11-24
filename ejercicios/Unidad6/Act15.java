package com;
import java.util.Scanner;
import java.util.Random;
public class Act15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random ();
		String frase;
		
		System.out.println("Introduce una frase o palabra: ");
		frase=sc.nextLine();
		
		if (frase.length()==0) {
			
			System.err.println("No has introducido una frase o palabra válida");
			
		}else {
			String anagrama = Anagrama(frase);
			
			System.out.println("Anagrama generado: " + anagrama);
			
			String intento;
			do {
				
			System.out.println("Intenta adivinar la palabra original: ");
			intento=sc.nextLine();
			
			int coincidencias = comparaletras(frase,intento);
			System.out.println("Las coincidencias son: " + coincidencias);
			
			if(!intento.equalsIgnoreCase(frase)) {
				System.out.println("Incorrecto, inténtalo de nuevo");
				
			}
			
			}while (!intento.equalsIgnoreCase(frase));
			
			System.out.println("¡Enhorabuena! Has acertado");
		}
		sc.close();
		
	}
	
	public static String Anagrama (String frase) {
			
			char [] letras = frase.toCharArray();
			Random random = new Random ();
			
			for(int i=0;i<letras.length;i++) {
				
				int posicionaleatoria=random.nextInt(letras.length);
				
				//Intercambiar
				char temp = letras[i];
				letras[i]=letras[posicionaleatoria];
				letras[posicionaleatoria]=temp;
			}

		return new String (letras);
		
	}
	
	public static int comparaletras (String frase, String intento) {
		
		int coincidencias=0;
		
		for (int i=0;i<Math.min(frase.length(), intento.length());i++) {
			
			if(frase.charAt(i)==intento.charAt(i)) {
				coincidencias++;
			}
			
		}
		return coincidencias;
		
	}

}
