package com;

public class SintonizadorFM {

	private double frecuencia;
	
	public SintonizadorFM () {
		this.frecuencia=80;
	}
	
	
	public void up () {
		if(frecuencia>=80&&frecuencia<=108) {
			
			frecuencia=frecuencia+0.5;
			
			if(frecuencia>108) {
				frecuencia=80;
			}
	}
		}
	
	public void down () {
		if(frecuencia>=80&&frecuencia<=108) {
			
			frecuencia=frecuencia-0.5;
			
			if(frecuencia<80) {
				frecuencia=108;
			}
		}
	}
	
	public void display () {
		System.out.println(frecuencia);
	}
	
	
}
