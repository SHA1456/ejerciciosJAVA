package es.iescamas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo3_GuardarTareas {

	public static void main(String[] args) {
		
		Ejemplo3_Tareas t1 = new  Ejemplo3_Tareas(1, "Crear formulario", "Programación", "pendiente");
		Ejemplo3_Tareas t2 = new  Ejemplo3_Tareas(2, "Leer archivo", "Entornos", "hecha");
		

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"))){
			
			writer.write(t1.toLinea());
            writer.newLine();
            writer.write(t2.toLinea());
            writer.newLine();
            
            System.out.println("Tareas guardadas correctamente");
			
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
