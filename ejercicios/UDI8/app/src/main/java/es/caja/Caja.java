package es.caja;

public class Caja {

	private final int alto;
	
	private final int ancho;
	
	private final int fondo;
	
	private final Unidades u;
	
	
	
	public Caja(int alto,int ancho, int fondo, Unidades u) {
		this.alto=alto;
		this.ancho=ancho;
		this.fondo=fondo;
		this.u=u;
	}
	
	public double getVolumen() {
		double volumen=this.ancho*this.alto*this.fondo;
		if(this.u.equals(Unidades.cm)) {
			volumen=volumen/1_000_000.0;
		}
		return volumen;
	}

	@Override
	public String toString() {
		return "Caja [alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo + ", u=" + u + "]";
	}
	
	
	
}
