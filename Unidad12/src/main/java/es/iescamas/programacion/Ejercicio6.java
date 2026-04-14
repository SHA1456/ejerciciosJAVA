package es.iescamas.programacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio6 {

	public static void main(String[] args) {
		Integer[] numeros2 = {1,2,4};
		List<Integer> numeros = new ArrayList<Integer>(List.of(1,10,4,5,-6,19,20,12));
	
		numeros.add(50);
		Iterator<Integer> it =numeros.iterator();
		
		while(it.hasNext()) {
			
			Integer num = it.next();
			if(num%2==0) {
				it.remove();
			}
			
		}
		System.out.println(numeros);

	}
	
	public static class Persona {
		private String nombre;
		public Persona (String nombre) {
			this.nombre=nombre;
		}
		
	}

}
