package es.iescamas.market;

import es.iescamas.market.interfaces.Descuentable;
import es.iescamas.market.interfaces.Enviable;

/**
 * Representa un producto del catálogo de la aplicación Market.
*/
public class Producto implements Descuentable,Enviable{

	private String sku;
	private String nombre;
	private String categoria;
	private double precio;
	private double rating;
	private int stock;
	private int ventas;
	private double porcentajeDescuento;
	private double pesoKg;

    /**
     * Construye un producto con todos sus datos.
     *
     * @param sku código único del producto (SKU)
     * @param nombre nombre comercial del producto
     * @param categoria categoría del producto (puede ser {@code null})
     * @param precio precio base del producto (sin descuentos aplicados)
     * @param rating valoración media del producto (p.ej., 0.0..5.0)
     * @param stock unidades disponibles en almacén
     * @param ventas unidades vendidas (para ordenar por “popularidad”)
     * @param porcentajeDescuento descuento en tanto por uno (0.0..1.0)
     * @param pesoKg peso en kilogramos (0.0 si no es enviable; para envío debe ser &gt; 0)
     */
    public Producto(
            String sku,
            String nombre,
            String categoria,
            double precio,
            double rating,
            int stock,
            int ventas,
            double porcentajeDescuento,
            double pesoKg
    ) {
        this.sku=sku;
        this.nombre=nombre;
        this.categoria=categoria;
        this.precio=precio;
        this.rating=rating;
        this.stock=stock;
        this.ventas=ventas;
        this.porcentajeDescuento=porcentajeDescuento;
        this.pesoKg=pesoKg;
    }

	public double getPrecio() {
		return precio;
	}

	@Override
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	
	@Override
	public double getPesoKg() {
		return pesoKg;
	}
	
	

	public String getSku() {
		return sku;
	}

	public String getNombre() {
		return nombre;
	}

	public double getRating() {
		return rating;
	}

	public int getVentas() {
		return ventas;
	}
	

	public String getCategoria() {
		return categoria;
	}

	public int compareTo(Producto p) {
		
		int comparacionVentas=Integer.compare(p.ventas, this.ventas);
		
		if(comparacionVentas!=0) {
			return comparacionVentas;
		}
		
		int comparacionRating=Double.compare(p.rating, this.rating);
		
		if(comparacionRating!=0) {
			return comparacionRating;
		}
		
		int comparacionNombre=this.nombre.compareToIgnoreCase(p.nombre);
		if(comparacionNombre!=0) {
			return comparacionNombre;
		}
		
		return this.sku.compareTo(p.sku);
	}

	
	
	
}
