package es.pago;

public class Efectivo implements MetodoPago{

	private double dinero;
	
	public Efectivo(double dinero) {
		super();
		this.dinero = dinero;
	}


	@Override
	public boolean pagar(double importe) {
		return false;
	}
	
	
}
