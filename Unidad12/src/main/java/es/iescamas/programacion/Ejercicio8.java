package es.iescamas.programacion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio8 {
	
	/*Simula un carrito:

	Productos con nombre y precio
	Lista de productos
	Total de compra
	Pista 🔍
	Recorre la lista sumando precios.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Set<Producto> productos = new HashSet<Producto>();

		Producto p1 = new Producto ("Pan",1.0);
		Producto p2 = new Producto ("Aceite",5.0);
		Producto p3 = new Producto ("Huevo",3.0);
		
		Map<Producto,Integer> carro = new HashMap <Producto,Integer>();
		carro.put(p1, 3);
		carro.put(p2, 1);
		carro.put(p3, 1);
		double total=0.0;
		
		for(Map.Entry<Producto,Integer> elemento:carro.entrySet()) {
			Producto p = elemento.getKey();
			Integer cantidad = elemento.getValue();
			Double subtotal = p.getPrecio()*cantidad;
			System.out.println(p.getNombre() + "x" + cantidad + "=" + subtotal);
			total+=subtotal;
			
			System.out.println(p + " @ -> " + cantidad);
		}
		
		System.out.println("Total a pagar: " + total);
		
		
	}
	

}
