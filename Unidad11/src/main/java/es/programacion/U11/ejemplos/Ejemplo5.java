package es.programacion.U11.ejemplos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ejemplo5 {

	//Leer un objeto de un archivo binario
	
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"));

        Persona p = (Persona) ois.readObject();

        System.out.println(p.nombre + " - " + p.edad);

        ois.close();

	}

}
