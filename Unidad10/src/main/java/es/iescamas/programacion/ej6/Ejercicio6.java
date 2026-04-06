package es.iescamas.programacion.ej6;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (
				BufferedReader br = new BufferedReader(new FileReader("firmas.txt"))){
			String linea;
			
			while ((linea = br.readLine()) != null) {
                System.out.println("Firmas: \n" + linea);
                String[] nombres = new String [linea.length()];
            }
			
			System.out.println("Añade una nueva firma: ");
			String firma=sc.nextLine();
		
			
			
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
