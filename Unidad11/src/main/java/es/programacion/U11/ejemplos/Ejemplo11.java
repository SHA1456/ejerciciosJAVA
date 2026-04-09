package es.programacion.U11.ejemplos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejemplo11 {

	public static void main(String[] args) throws Exception{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.dat"));

        try{
            while(true){
                Alumno a = (Alumno) ois.readObject();

                if(a.id == 2){
                    a.nota = 10;
                }

                oos.writeObject(a);
            }
        } catch(EOFException e){}

        ois.close();
        oos.close();

        new File("alumnos.dat").delete();
        new File("temp.dat").renameTo(new File("alumnos.dat"));

	}

}
