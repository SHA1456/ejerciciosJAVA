package es.radio;

public class Sintonizador {

	private double frecuencia;
	
	private final double max_frecuencia = 108.0;
	private final double min_frecuencia = 80.0;
	private final double salto = 0.5;
	
	
	
	public Sintonizador() {
		frecuencia=80.0;
	}
	
	public double getFrecuencia() {
		return frecuencia;
	}
	
	public void setFrecuencia(double frecuencia) {
		this.frecuencia=frecuencia;
	}
	
	public void up () {
		if(frecuencia+salto>max_frecuencia) {
			frecuencia=min_frecuencia;
		}else {
			frecuencia=frecuencia+salto;
		}
	}
	
	public void down () {
		if(frecuencia-salto<min_frecuencia) {
			frecuencia=max_frecuencia;
		}else {
			frecuencia=frecuencia-salto;
		}
	}
	
	public double display() {
		System.out.println("Sintonizado: " + this.frecuencia + "MHz");
		return frecuencia;
	}
}
