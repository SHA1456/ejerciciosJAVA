package es.programacion.U11.ejercicios;
import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums;
        final String FICHERO = "numeros2.dat";
        
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        
        nums = new double[num];
        
        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            nums[i] = sc.nextDouble();
        }
        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO))) {
            for (int i = 0; i < num; i++) {
                dos.writeDouble(nums[i]);  
            }
            System.out.println("Los números se han guardado correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))) {
            for (int i = 0; i < num; i++) {
                double numLeido = dis.readDouble();
                System.out.println("Número " + (i + 1) + ": " + numLeido);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}