package es.pago;

public class Bizum implements MetodoPago{

	private double saldo;
	private String telefono;
	
	
	
	public Bizum(double saldo, String telefono) {
		super();
		this.saldo = saldo;
		this.telefono = telefono;
	}



	@Override
	public boolean pagar(double importe) {
		return false;
	}
	
}
