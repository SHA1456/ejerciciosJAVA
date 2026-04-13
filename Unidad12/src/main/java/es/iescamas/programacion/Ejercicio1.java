package es.iescamas.programacion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lista =  new ArrayList<>();
		Integer num_aux;
		
		//Solicita los números
		for(int i=0;i<10;i++) {
			System.out.println("Dime un número: ");
			num_aux=sc.nextInt();
			lista.add(num_aux);
		}
		
		mostrar_valores(lista);
		int total=suma(lista);
		double media=media(lista);
		
		System.out.println("Total: " + total + ", Media: " + media);
		
		
	}
	
	private static double media (List<Integer> lista) {
		double media=(double) suma(lista)/lista.size();
		return media;
	}
	
	private static void mostrar_valores (List<Integer>lista) {
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}
	
	private static int suma (List<Integer>lista) {
		Integer suma=0;
		for(Integer num:lista) {
			suma+=num;
		}
		return suma;
	}

}
