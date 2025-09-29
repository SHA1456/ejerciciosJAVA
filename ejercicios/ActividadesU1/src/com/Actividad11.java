package com;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float ventamanzana1,ventapera1,ventamanzana2,ventapera2;
		double totalmanzanas,totalperas,total;
		
		System.out.println("Escribe los kilos de venta de manzanas del primer semestre");
		ventamanzana1=sc.nextFloat();
		
		System.out.println("Escribe los kilos de venta de peras del primer semestre");
		ventapera1=sc.nextFloat();
		
		System.out.println("Escribe los kilos de venta de manzanas del segundo semestre");
		ventamanzana2=sc.nextFloat();
		
		System.out.println("Escribe los kilos de venta de pera del segundo semestre");
		ventapera2=sc.nextFloat();
		
		totalmanzanas=(2.35*ventamanzana1)+(2.35*ventamanzana2);
		totalperas=(1.95*ventapera1)+(1.95*ventapera2);
		total=totalmanzanas+totalperas;
		
		System.out.println("El importe de manzanas es: " + totalmanzanas + " El importe de peras es: " + totalperas + " El importe total es: " + total);
		
		sc.close();

	}

}
