package es.ejercicio9;

import es.ejercicio7.Mostrable;

public class Cancion implements Reproducible,Mostrable{

	private String titulo;
	private String autor;
	private double duracion;
	private Estado estado;
	
	
	
	public Cancion(String titulo, String autor, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
	}

	@Override
	public void play() {
		estado=Estado.REPRODUCIENDOSE;
		System.out.println("Canción " + titulo + " reproduciéndose");
	}

	@Override
	public void pause() {
		estado=Estado.PAUSADO;
		System.out.println("Canción " + titulo + " en pausa");
		
	}

	@Override	
	public void stop() {
		estado=Estado.DETENIDO;
		System.out.println("Canción " + titulo + " detenida");
		
	}

	@Override
	public String mostrar() {
		return "Título:" + titulo + " Autor:" + autor + " Duración" + duracion + " Estado" + estado;
		
	}

}
