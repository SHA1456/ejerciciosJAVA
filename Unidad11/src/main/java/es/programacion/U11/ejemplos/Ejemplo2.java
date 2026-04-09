package es.programacion.U11.ejemplos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		//Leer enteros
		
		try {
		DataInputStream dis = new DataInputStream(new FileInputStream("numeros.dat"));
		
		while(true) {
			System.out.println(dis.readInt());
		}
		
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
