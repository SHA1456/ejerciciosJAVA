package es.iescamas.programacion.ej2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nombre: ");
		String nombre=sc.nextLine();
		
		System.out.println("Introduce una edad: ");
		int edad=sc.nextInt();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt",false))){
			bw.write("Nombre: " + nombre);
			bw.newLine();
			bw.write("Edad: " + edad);
			
			System.out.println("Datos guardados correctamente");
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
