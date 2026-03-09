package es.ejercicio7;

import java.util.Comparator;

public class ComparadoresProducto {

	public final static Comparator<Producto> PRECIO_DESCENDENTE = Comparator.comparing(Producto::getPrecio).reversed();
	public final static Comparator<Producto> CODIGO_AZ=Comparator.comparing(Producto::getNombre).thenComparing(Producto::getPrecio);
	
	
}
