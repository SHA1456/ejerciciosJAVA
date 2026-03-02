package es.valorable;

public class Producto implements Valorable{

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
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
