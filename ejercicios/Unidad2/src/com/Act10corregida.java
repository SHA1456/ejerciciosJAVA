package com;
import java.util.Scanner;
public class Act10corregida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String CAPICUA="Capicúa";
		final String NOCAPICUA="No es capicúa";
		int numero,unidad,decena,centena,millar;
		//Defino las variables
		
		System.out.println("Introduce un numero 2-4 cifras");
		numero=sc.nextInt();
		
		if(numero<10) {
			
			System.out.println(NOCAPICUA);
		}else if(numero<100) {
			
			unidad=numero%10;
			decena=numero/10;
			
			if(unidad==decena) {
				System.out.println(CAPICUA);
			}else {
				System.out.println(NOCAPICUA);
			}
			
		}else if(numero<1000) {
			
			unidad=numero%10;
			centena=numero/100;
			
			if(unidad==centena) {
				System.out.println(CAPICUA);
			}else {
				System.out.println(NOCAPICUA);
			}
			
		}else if(numero<10000) {
			
			unidad=numero&10;
			decena=(numero/10)%10;
			centena=(numero/100)%10;		
			millar=(numero/1000);
			
			if(unidad==millar&&decena==centena) {
				System.out.println(CAPICUA);
			}else {
				System.out.println(NOCAPICUA);
			}
			
		}else {
			System.out.println("Numero demasiado grande");
		}

	}

}
