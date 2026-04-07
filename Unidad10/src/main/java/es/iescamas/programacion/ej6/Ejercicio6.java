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

		String[] nombres = new String [1000];
		int numlinea=0;
		try (
				BufferedReader br = new BufferedReader(new FileReader("firmas.txt"))){
			String linea;
			
			System.out.println("Firmas:");
			while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                nombres[numlinea]=linea;
                numlinea++;
            }
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Añade una nueva firma: ");
		String firma=sc.nextLine();
		
		boolean repetido=false;
		
		for(int i=0;i<numlinea;i++) {
			if(nombres[i].contains(firma)) {
				repetido=true;
				break;
			}
		}
		
		if(repetido==true) {
			System.out.println("La firma introducida es repetida");
		}else {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("firmas.txt",true))){
				bw.write(firma);
				bw.newLine();
				System.out.println("Firma añadida");
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			nombres[numlinea]=firma;
			numlinea++;
			
		}
	}

}
