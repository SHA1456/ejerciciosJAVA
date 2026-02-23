package Imprimible_Danable;

public class Jugador implements Danable{

	private int vida;
	private String nombre;
	
	public Jugador(int vida, String nombre) {
		super();
		this.vida = vida;
		this.nombre = nombre;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void recibirDanio(int puntos) {
		this.vida=vida-puntos;
		
		if(vida==0) {
			System.out.println("Jugador K.O.");
		}
	}
	
	
	
}
