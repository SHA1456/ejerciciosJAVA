package es.programacion.U11.ejemplos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Alumno implements Serializable {
    int id;
    String nombre;
    double nota;

    Alumno(int id, String nombre, double nota){
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
    }
}

public class Ejemplo8 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

        oos.writeObject(new Alumno(1,"Ana",7.5));
        oos.writeObject(new Alumno(2,"Luis",8.2));

        oos.close();
    }
}