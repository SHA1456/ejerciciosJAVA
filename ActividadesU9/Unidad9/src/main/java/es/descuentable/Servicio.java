package es.descuentable;

public class Servicio implements Descuentable{

	private String descripcion;
	private double tarifa;
	
	
	
	
	public Servicio(String descripcion, double tarifa) {
		super();
		this.descripcion = descripcion;
		this.tarifa = tarifa;
	}




	@Override
	public double precioBase() {
		return tarifa;
	}
	
	
	
}
