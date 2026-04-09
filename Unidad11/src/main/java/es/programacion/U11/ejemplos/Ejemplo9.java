package es.programacion.U11.ejemplos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejemplo9 {

	 public static void main(String[] args) throws Exception {
	        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

	        try{
	            while(true){
	                Alumno a = (Alumno) ois.readObject();
	                System.out.println(a.id + " " + a.nombre + " " + a.nota);
	            }
	        } catch(EOFException e){
	            System.out.println("Fin");
	        }

	        ois.close();
	    }

}
