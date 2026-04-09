package es.programacion.U11.ejemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo1 {

	//Guardar 5 números enteros
	
	public static void main (String [] args) {
		try {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("numeros.dat"));
		
		for(int i=1;i<=5;i++) {
			dos.writeInt(i*10);
		}
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("fin");
		}
		
		
		
		
		
	}
	
}
