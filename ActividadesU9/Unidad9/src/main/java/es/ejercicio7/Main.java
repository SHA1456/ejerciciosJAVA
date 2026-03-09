package es.ejercicio7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Producto [] productos = new Producto[5];
		
		Producto p1 = new Producto(1,"a1",20.0);
		Producto p2 = new Producto(2,"a2",25.0);
		Producto p3 = new Producto(3,"a3",21.0);
		Producto p4 = new Producto(4,"a4",15.0);
		
		productos[0]=p1;
		productos[1]=p2;
		productos[2]=p3;
		productos[3]=p4;
		
		
		Arrays.sort(productos,ComparadoresProducto.CODIGO_AZ);
		
		
	}

}
