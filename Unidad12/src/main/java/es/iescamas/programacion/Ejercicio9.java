package es.iescamas.programacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Map <Producto, Integer> stock = new HashMap<Producto,Integer>();
		
		Producto p1 = new Producto ("Huevos" ,12.0);
		Producto p2 = new Producto ("Leche" ,2.0);
		Producto p3 = new Producto ("Pan" ,5.0);

		stock.put(p1, 12);
		stock.put(p2, 2);
		stock.put(p3, 1);
		
		Set<Entry<Producto, Integer>> def = stock.entrySet() ;
		for(Map.Entry<Producto, Integer> producto:stock.entrySet()) {
			System.out.println(producto.getKey().toString() + " Cantidad = " + producto.getValue());
		}
		
		stock.put(p1, 10);
	}

}
