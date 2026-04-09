package es.programacion.U11.ejemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo7 {

	public static void main(String[] args) throws IOException {
		
		 BufferedInputStream bis = new BufferedInputStream(new FileInputStream("audio.mp3"));
	        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copia.mp3"));

	        int dato;
	        while((dato = bis.read()) != -1){
	            bos.write(dato);
	        }

	        bis.close();
	        bos.close();

	}

}
