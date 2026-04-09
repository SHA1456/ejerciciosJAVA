package es.programacion.U11.ejercicios;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		double numero=sc.nextDouble();
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("ejercicio1.dat"));
			dos.writeDouble(numero);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
