package es.iescamas.programacion.ej4;

import java.util.Comparator;

public class ComparadorPorPrecio {

	public final static Comparator<Libro> PorPrecio=(p1,p2) -> {
		
		int cmp=Double.compare(p1.getPrecio(), p2.getPrecio());
		
		return cmp;
		
	};
}
