package es.iescamas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4 {

	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("tareas.txt"))){
			String linea;
			
			while((linea=reader.readLine())!=null) {
				String [] partes = linea.split(";");
				int id = Integer.parseInt(partes[0]);
				String titulo = partes[1];
				String modulo = partes[2];
				String estado = partes[3];
				
				Ejemplo3_Tareas tareas = new Ejemplo3_Tareas(id, titulo, modulo, estado);
				
				 	System.out.println("ID: " + tareas.getId());
	                System.out.println("Título: " + tareas.getTitulo());
	                System.out.println("Módulo: " + tareas.getModulo());
	                System.out.println("Estado: " + tareas.getEstado());
	                System.out.println("--------------------------");
			}
			
		}catch (IOException e) {
			
			System.err.println(e.getMessage());
		}

	}

}
