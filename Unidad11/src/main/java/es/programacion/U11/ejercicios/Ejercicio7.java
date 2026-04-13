package es.programacion.U11.ejercicios;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String FICHERO="frase.dat";
		String frase;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO))){
		
		System.out.println("Introduce una frase: ");
		frase=sc.nextLine();
		
		dos.writeUTF(frase);
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))){
			
			frase=dis.readUTF();
			System.out.println("Frase leída: " + frase);
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
