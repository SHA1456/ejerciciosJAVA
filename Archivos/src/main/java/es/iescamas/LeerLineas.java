package es.iescamas;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeerLineas {

	public static void main (String [] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))){
			String linea;
			while((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
			
		}finally {
			System.out.println("FIN");
			
		}
		
		
		
		
		
		
	}
}
