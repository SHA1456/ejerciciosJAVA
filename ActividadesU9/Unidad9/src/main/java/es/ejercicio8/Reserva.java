package es.ejercicio8;

import es.ejercicio7.Mostrable;

public class Reserva implements Validable,Mostrable{

	private String fecha;
	
	private int numPersonas;

	@Override
	public String mostrar() {
		return "Fecha: " + fecha + " numPersonas: " + numPersonas;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if(numPersonas<=0) {
			throw new IllegalArgumentException("El numero de personas no puede ser 0 o negativo");
		}
		System.out.println("Validado correctamente");
	}

	@Override
	public String toString() {
		return mostrar();
	}

	public Reserva(String fecha, int numPersonas) {
		this.fecha = fecha;
		this.numPersonas = numPersonas;
	}
	
	
	
	
}
