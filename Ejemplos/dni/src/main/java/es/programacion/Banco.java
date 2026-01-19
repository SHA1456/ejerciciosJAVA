package es.programacion;

public class Banco {

	private String nombrebanco;
	
	public double capital;
	
	public String direccion;
	
	
	public Banco (String nombrebanco,String direccion) {
		this.nombrebanco=nombrebanco;
		capital=520000000;
		this.direccion=direccion;
	}
	
	public Banco (String nombrebanco,String direccion,double capital) {
		this.nombrebanco=nombrebanco;
		this.direccion=direccion;
		this.capital=capital;
	}
	
	
	
}