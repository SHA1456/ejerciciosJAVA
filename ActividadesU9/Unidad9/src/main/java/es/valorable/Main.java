package es.valorable;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Valorable [] val = new Valorable[4];
		
		Producto p1 = new Producto(1,"Producto1",25);
		Producto p2 = new Producto(2,"Producto2",30);
		Producto p3 = new Producto(3,"Producto3",15);
		Producto p4 = new Producto(4,"Producto4",10);
		
		val[0]=p1;
		val[1]=p2;
		val[2]=p3;
		val[3]=p4;
		
		ordenarPorPrecioAscYNombre(val);
		System.out.println(Arrays.toString(val));
		
	}
	
	//Burbuja
	public static void ordenarPorPrecioAscYNombre(Valorable [] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			  for (int j = 0; j < arr.length - 1 - i; j++) {
				  
				 if(arr[j].getPrecio()>arr[j+1].getPrecio()) {
					 Valorable aux = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=aux;
					 
				 }
				  
			  }
			  
			}
	}

}
