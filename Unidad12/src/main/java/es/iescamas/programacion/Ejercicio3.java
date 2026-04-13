package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<>();

		Alumno a1 = new Alumno(7,"Sergio");
		Alumno a2 = new Alumno(8,"Luis");
		Alumno a3 = new Alumno(4,"María");
		Alumno a4 = new Alumno(6,"Juan");
		
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		
		//Muestra alumnos aprobados
		for(int i=0;i<alumnos.size();i++) {
			if(alumnos.get(i).getNota()>=5) {
				System.out.println(alumnos.get(i));
			}
		}
		
		double media = media(alumnos);
		System.out.println("Media: " + media);
	}
	
	private static double media (List<Alumno> alumnos) {
		double suma=0;
		for(Alumno a:alumnos) {
			suma+=a.getNota();
		}
		return suma/alumnos.size();
		
	}

}
