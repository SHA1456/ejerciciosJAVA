package com;

public class CuentaCorriente {

	 String DNI;
	
	public String nombre;
	
	private double saldo;
	
	private double limite;
	
	private Banco nombrebanco;
	
	
	public CuentaCorriente (String nombre, String DNI, Banco nombrebanco) {
		
		this.nombre=nombre;
		
		this.DNI=DNI;
		
		saldo=0.0;
		
		limite=-50.0;
		
		this.nombrebanco=nombrebanco;
	}
	
	public CuentaCorriente (double saldo) {
		
		this.saldo=saldo;
		
		this.limite=0.0;
	}
	
	public CuentaCorriente (String DNI, double saldo, double limite) {
		
		this.DNI=DNI;
		this.saldo=saldo;
		this.limite=limite;
	}
	
	
	public boolean sacarDinero (double cantidad) {
		
		if (this.saldo-cantidad>=this.limite) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean aumentarSaldo (double cantidad) {
		
		if(cantidad>0) {
			this.saldo+=cantidad;
			return true;
		}else {
			System.out.println("No puedes introducir esa cantidad");
			return false;
		}
	}
	
	public void mostrarInformacion () {
		System.out.println("El nombre es: " + nombre + ", el DNI es: " + DNI + ", el saldo es: " + saldo + " y el límite de descubierto es: " + limite);
	}

	public  Banco getNombrebanco() {
		return nombrebanco;
	}

	public  void setNombrebanco(Banco nombrebanco) {
		this.nombrebanco = nombrebanco;
	}


	
	
	
	
	
}
