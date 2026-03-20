package es.iescamas.programacion.ej3;

public class MatrizCuadrada extends MatrizDatos{

	public MatrizCuadrada(int[][] datos) {
		super(datos);
	}

	@Override
	public void mostrarResultado() {
		super.mostrarResultado();
		System.out.println(super.getDatos().length);
	}
	
}
