package es.ejercicio11;

import java.time.LocalDate;

public class Producto implements Identificable,Mostrable{

	private String id;
	private String nombre;
	private double precio;
	private CategoriaProducto categoria;
	private LocalDate fechaCaducidad;
	
	public Producto(String id, String nombre, double precio, CategoriaProducto categoria, LocalDate fechaCaducidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public CategoriaProducto getCategoria() {
		return categoria;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria
				+ ", fechaCaducidad=" + fechaCaducidad + "]";
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
