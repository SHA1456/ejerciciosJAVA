package es.pago;

public class Tarjeta implements MetodoPago{

	private double saldo;
	private double limite;
	
	
	
	public Tarjeta(double saldo, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}



	@Override
	public boolean pagar(double importe) {
		return false;
	}
	
	
	
}
