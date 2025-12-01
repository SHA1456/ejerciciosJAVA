package com;

public class Persona {
	public static String prueba = "EsEstatico";
	
	//atributos
	private String nombre;
	private Integer edad;
	//metodos
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void saluda() {
		
		System.out.println("Hola " + nombre);
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return  nombre;
	}
	
	
	
}
