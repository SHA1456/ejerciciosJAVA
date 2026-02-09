package es.caja;

public class CajaCarton extends Caja{

	public CajaCarton(int alto, int ancho, int fondo, Unidades u) {
		super(alto, ancho, fondo, u);
	}
	@Override
	public double getVolumen() {
		return super.getVolumen()*0.8;
	}
	
	
}
