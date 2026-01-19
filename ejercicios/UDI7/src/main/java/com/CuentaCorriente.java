package com;

public class CuentaCorriente {

		//atributos
	private double saldo;
	private double limiteDescubierto;
	private String nombre;
	private String dni;
	
	//metodos
	
	public CuentaCorriente(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=0.0;
		this.limiteDescubierto=-50.0;
	}
	
	public boolean sacarDinero (double cantidad) {
		
		if (this.saldo-cantidad>=this.limiteDescubierto) {
			
			saldo=saldo-cantidad;
			return true;
		}else {
			return false;
		}
		
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	public double ingresarDinero(double cantidad) throws Exception {
		
		if(cantidad>0) {
			
			this.saldo=this.saldo+cantidad;
			return this.saldo;
			
		}else {
			throw new Exception ("No puedes ingresar una cantidad negativa o 0");
		}
		
	}
	
	
	
	
	
}
