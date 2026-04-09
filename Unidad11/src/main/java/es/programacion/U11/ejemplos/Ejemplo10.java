package es.programacion.U11.ejemplos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejemplo10 {

	public static void main(String[] args) throws Exception {
		 int buscar = 2;

	        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

	        try{
	            while(true){
	                Alumno a = (Alumno) ois.readObject();
	                if(a.id == buscar){
	                    System.out.println("Encontrado: " + a.nombre);
	                }
	            }
	        } catch(EOFException e){}

	        ois.close();
	    }

	}


