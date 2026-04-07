package es.iescamas.programacion.ej7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numlinea=0;
		String res;
		try (BufferedReader br = new BufferedReader(new FileReader("ficheromore.txt"))){
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                numlinea++;
                
                if(numlinea==24) {
                	do {
                		System.out.println("Escribe s para continuar o n para parar la impresión de las líneas: ");
                    	res=sc.nextLine();
                    	
                    	if(res.equals("n")) {
                    		System.out.println("Impresión detenida");
                    		return;
                    	}
                    	
                	}while(!res.equals("s"));
                	
                	
                	
                }
            }
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
