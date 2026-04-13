package es.iescamas.programacion;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		Integer[] numeros = {1,2,3,4};
		Map <String, String> diccionario = new HashMap <String, String>();

		diccionario.put("Hola", "Hello");
		diccionario.put("Adiós", "Bye");
		diccionario.put("Noche", "Night");
		diccionario.put("Casa", "House");
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		diccionario.put("Caballo", "Horse");
		diccionario.put("Mapa", "Map");
		diccionario.put("Puerta", "Door");
		diccionario.put("Castillo", "Castle");
		
		do {
			System.out.println("Dime una palabra a buscar: ");
			palabra=sc.nextLine();
			
			
			
		}while(true);
		
		
	}

}
