package es.programacion.U11.ejercicios;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio1.dat"));
		try {
			while(true) {
				System.out.println(dis.readDouble());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
