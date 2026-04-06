package es.iescamas.market;

import java.util.Comparator;

public class ComparadoresProducto {

	public static final Comparator<Producto> POR_PRECIO_ASC= (p1,p2) -> {
		
		int cmp=Double.compare(p1.getPrecio(), p2.getPrecio());
		
		if(cmp==0) {
			return p1.getNombre().compareTo(p2.getNombre());
		}
		
		return cmp;
		
	};
	
	public static final Comparator<Producto> POR_CATEGORIA_Y_RATING=(p1,p2) -> {
		
		 if (p1.getCategoria() == null && p2.getCategoria() == null) return 0;
	     if (p1.getCategoria() == null) return 1;
	     if (p2.getCategoria() == null) return -1;
		
		return p1.getCategoria().compareTo(p2.getCategoria());
		
		
	};
	
	public static final Comparator<Producto> POR_PRECIO_DESC = (p1, p2) -> 
    Double.compare(p2.getPrecio(), p1.getPrecio());
	
	
}
