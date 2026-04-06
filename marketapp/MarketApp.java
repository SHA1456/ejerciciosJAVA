package es.iescamas.market;

import java.util.Arrays;
import java.util.Comparator;

import es.iescamas.market.interfaces.Enviable;

/**
 * MarketApp
 * ---------
 * Utilidad “de negocio” para practicar TDD con:
 *  - Interfaces (Descuentable, Enviable)
 *  - Comparable (orden natural en Producto)
 *  - Comparator (criterios alternativos)
 *  - Tablas (arrays) + ordenación manual (burbuja)
 *
 * ⚠️ Importante para la práctica:
 * - NO se usan colecciones (List/ArrayList/Streams).
 * - La mayoría de métodos devuelven una NUEVA tabla para no modificar el original.
 * - Los tests deben guiar la implementación (TDD).
 */
public class MarketApp {

	public double precioFinal(Producto p, double precio) {
		return precio * (1-p.getPorcentajeDescuento());
	}

	public double costeEnvio(Producto p) {
		
		if(p.getPesoKg()==0) {
			throw new IllegalArgumentException("peso invalido");
		}
		
		return 2.99 + (p.getPesoKg()*1.20);
	}

	public Producto[] copiar(Producto[] original) {
		return Arrays.copyOf(original, original.length);
	}

	public Producto[] ordenarNatural(Producto[] original) {

	    Producto[] copia = copiar(original);

	    for (int i = 0; i < copia.length - 1; i++) {  //for para controlar las pasadas, que en un algoritmo burbuja deben ser n-1
	        for (int j = 0; j < copia.length - 1 - i; j++) { //recorre el array y lo ordena, se pone -i para que no vuelva a revisar el anterior que ya está ordenado

	            if (copia[j].getVentas() < copia[j + 1].getVentas()) {

	                Producto temp = copia[j];
	                copia[j] = copia[j + 1];
	                copia[j + 1] = temp;
	            }
	        }
	    }

	    return copia;
	}

	public Producto[] ordenar(Producto[] t, Comparator<Producto> porPrecioAsc) {
		Producto[] copia = Arrays.copyOf(t, t.length);
		
		Arrays.sort(copia,porPrecioAsc);
		return copia;
	}

	public Producto[] filtrarPorCategoria(Producto[] t, String categoria) {

	    int contador = 0;

	    // 1. Contar coincidencias
	    for (Producto p : t) {
	        if (categoria == null) {
	            if (p.getCategoria() == null) {
	                contador++;
	            }
	        } else {
	            if (categoria.equals(p.getCategoria())) {
	                contador++;
	            }
	        }
	    }

	    // 2. Crear array resultado
	    Producto[] res = new Producto[contador];

	    // 3. Rellenar
	    int i = 0;
	    for (Producto p : t) {
	        if (categoria == null) {
	            if (p.getCategoria() == null) {
	                res[i++] = p;
	            }
	        } else {
	            if (categoria.equals(p.getCategoria())) {
	                res[i++] = p;
	            }
	        }
	    }

	    return res;

	

}

	public Producto[] topN(Producto[] t, int n, Comparator<Producto> comp) {

	    // 1. Validar n
	    if (n <= 0) {
	        throw new IllegalArgumentException("n invalido");
	    }

	    // 2. Ordenar
	    Producto[] ordenado = ordenar(t, comp);

	    // 3. Ajustar tamaño
	    int tamaño = Math.min(n, ordenado.length);

	    // 4. Devolver los primeros N
	    return Arrays.copyOf(ordenado, tamaño);
	}}
