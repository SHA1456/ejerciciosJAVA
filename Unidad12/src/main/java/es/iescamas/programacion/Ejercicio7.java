package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio7 {
	
	/*Ordena alumnos por nota:

Crea lista de objetos
Ordena por nota ascendente
Pista 🔍
Usa Comparator.comparing(Alumno::getNota).
	 */

	public static void main(String[] args) {
		
		List<Alumno>alumnos = new ArrayList<Alumno>(List.of(new Alumno (7,"Sergio"), new Alumno (4,"Pepe"), new Alumno(6,"Luis"))); 
		alumnos.add(new Alumno (7,"Sergio"));
		alumnos.add(new Alumno (4,"Pepe"));
		alumnos.add(new Alumno (6,"Luis"));
		
		System.out.println(alumnos.size());
		System.out.println(alumnos);
		alumnos.sort(Comparator.comparing(Alumno::getNota).thenComparing(Alumno::getNombre).reversed());
		System.out.println(alumnos);
		
		
	}

}
