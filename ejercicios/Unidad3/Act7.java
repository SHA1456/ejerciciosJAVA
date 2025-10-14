package com;
public class Act7 {

	public static void main(String[] args) {
		
		int numero=1,producto=1,contador=0;
		
		do {
			
			producto=producto*numero; //Multiplicamos el producto por el número, en este caso está en 1
			contador++; //Sumamos uno al contador
			numero=numero+2; //Sumamos dos al número (que es 1 al principio) para tener los impares
			
		}while(contador<10);
		System.out.println("El producto de los 10 primeros impares es: " + producto);
		
	}

}
