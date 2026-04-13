package es.programacion.U11.ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {

        try (DataInputStream dis = new DataInputStream(new FileInputStream("ejercicio1.dat"))) {

            while (true) {
                double numero = dis.readDouble();
                System.out.println(numero);
            }

        } catch (EOFException e) {
            System.out.println("Fin del archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}