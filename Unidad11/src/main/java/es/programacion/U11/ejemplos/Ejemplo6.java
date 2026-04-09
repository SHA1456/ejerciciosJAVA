package es.programacion.U11.ejemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo6 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("origen.jpg");
        FileOutputStream fos = new FileOutputStream("destino.jpg");

        int dato;
        while((dato = fis.read()) != -1){
            fos.write(dato);
        }

        fis.close();
        fos.close();

	}

}
