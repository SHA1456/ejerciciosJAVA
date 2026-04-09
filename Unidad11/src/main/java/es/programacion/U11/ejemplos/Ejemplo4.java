package es.programacion.U11.ejemplos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ejemplo4 {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"));

        Persona p = new Persona("Juan", 30);
        oos.writeObject(p);

        oos.close();

	}

}

	class Persona implements Serializable {
    String nombre;
    int edad;

    Persona(String n, int e){
        nombre = n;
        edad = e;
    }
}
