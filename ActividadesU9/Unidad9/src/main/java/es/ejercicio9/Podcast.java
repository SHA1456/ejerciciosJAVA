package es.ejercicio9;

import es.ejercicio7.Mostrable;

public class Podcast implements Reproducible,Mostrable{

	private String nombre;
	private double duracion;
	private Estado estado;
	
	
	
	public Podcast(String nombre, double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}

	@Override
	public String mostrar() {
		return "Nombre: " + nombre + " Duración: " + duracion + " Estado: " + estado;
		
	}

	@Override
	public void play() {
		estado=Estado.REPRODUCIENDOSE;
		System.out.println("Podcast " + nombre + " reproduciéndose");
		
	}

	@Override
	public void pause() {
		estado=Estado.PAUSADO;
		System.out.println("Podcast " + nombre + " en pausa");
		
	}

	@Override
	public void stop() {
		estado=Estado.DETENIDO;
		System.out.println("Podcast " + nombre + " detenido");
		
	}

}
