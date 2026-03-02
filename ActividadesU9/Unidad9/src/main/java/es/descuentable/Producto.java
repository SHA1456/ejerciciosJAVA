package es.descuentable;

public class Producto implements Descuentable{

	@Override
	public double precioBase() {
		return precio;
	}
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	

}
