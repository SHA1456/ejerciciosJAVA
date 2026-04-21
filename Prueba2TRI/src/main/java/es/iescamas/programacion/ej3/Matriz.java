package com;

public class Matriz {

	private int[][] datos;
	public int[][] sumar(int[][] otra) {
		
	    if (otra == null) {
	        throw new IllegalArgumentException("La matriz no puede ser null");
	    }

	    if (otra.length != datos.length) {
	        throw new IllegalArgumentException("Las matrices deben tener el mismo número de filas");
	    }

	    for (int i = 0; i < datos.length; i++) {
	        if (otra[i].length != datos[i].length) {
	            throw new IllegalArgumentException("Las matrices deben tener el mismo número de columnas");
	        }
	    }

	    int[][] suma = new int[datos.length][datos[0].length];

	    for (int i = 0; i < datos.length; i++) {
	        for (int j = 0; j < datos[i].length; j++) {
	            suma[i][j] = datos[i][j] + otra[i][j];
	        }
	    }

	    return suma;
	}
}
