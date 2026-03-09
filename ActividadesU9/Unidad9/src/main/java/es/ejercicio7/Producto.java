package es.ejercicio7;

import es.valorable.Valorable;

public class Producto implements Valorable,Mostrable,Comparable<Producto>{

	private int codigo;
	private String nombre;
	private double precio;
	
	
	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}
	@Override
	public String getNombre() {
		return nombre;
	}


	@Override
	public String mostrar() {
		return "Producto" + nombre + " Precio: " + precio + " Código: " + codigo;
	}

	@Override
	public int compareTo(Producto otro) {
		int nombreCompare = this.nombre.compareTo(otro.nombre);
		
		if(nombreCompare!=0) {
			return nombreCompare;
		}
		
		return Double.compare(this.precio, otro.precio);
	}

	@Override
	public String toString() {
		return mostrar();
	}
	
	
	
}
