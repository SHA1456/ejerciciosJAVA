package es.programacion.U11.ejercicios;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linea;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("lineas.dat"))){
			
			do {
				System.out.println("Escribe una frase: ");
				linea=sc.nextLine();
				dos.writeUTF(linea);
				
			}while(!linea.isEmpty());
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("lineas.dat"))){
			
			
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
