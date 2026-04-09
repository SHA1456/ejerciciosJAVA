package es.programacion.U11.ejemplos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("texto.dat"));

        dos.writeUTF("Hola mundo");
        dos.writeUTF("Java binario");

        dos.close();

	}

}
