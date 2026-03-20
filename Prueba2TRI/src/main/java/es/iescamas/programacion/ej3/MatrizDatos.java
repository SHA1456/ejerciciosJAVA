package es.iescamas.programacion.ej3;

import java.util.Arrays;

public class MatrizDatos implements OperableMatriz{

	private int[][] datos;
	
	
	public MatrizDatos(int[][] datos) {
		this.datos = datos;
	}

	public int[][] getDatos() {
		return datos;
	}

	public void setDatos(int[][] datos) {
		this.datos = datos;
	}

	@Override
	public int[][] sumar(int[][] otra) {
		if(otra==null) {
			throw new IllegalArgumentException("La matriz no puede ser null");
		}
		
		if(otra.length!=datos.length) {
			throw new IllegalArgumentException("La longitud de las matrices debe ser igual");
		}
		
		int [][] suma= {};
		for(int i=0;i<datos.length;i++) {
			for(int j=0;j<otra.length;j++) {
				
				suma [i][j] = datos[i][j]+otra[i][j];
			}
		}
		return suma;
	}

	@Override
	public void mostrarResultado() {
		System.out.println(Arrays.deepToString(datos));
		
	}

}
