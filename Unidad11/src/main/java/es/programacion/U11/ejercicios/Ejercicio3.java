package es.programacion.U11.ejercicios;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		final String FICHERO="numenteros.dat"; 
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO))){
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			if(num>=0) {
			dos.writeInt(num);
			}
			
		}while(num>=0);
		
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))){
			while(true) {
				
			int numleido=dis.readInt();	
			System.out.println(numleido);
			}
		}catch (IOException e) {
			//System.out.println(e.getMessage());
		}

	}

}
