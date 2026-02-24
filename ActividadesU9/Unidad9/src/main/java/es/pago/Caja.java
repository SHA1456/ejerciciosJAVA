package es.pago;

public class Caja {

	public double cobrar (MetodoPago mp, double importe) {
		
		mp.pagar(importe);
		System.out.println(mp.pagar(importe));
		return importe;
		
	}
	
}
