package es.iescamas.programacion.ej4;

import java.util.Comparator;

public class ComparadorPorAnyo {

	public static final Comparator<Libro>PorAnyo = (p1,p2) -> {
		
		int cmp = Integer.compare(p1.getAnyo(), p2.getAnyo());
		
		return cmp;
		
	};
}
