package Imprimible_Danable;

public class Enemigo implements Danable{

	private int vida;
	private String tipo;
	
	public Enemigo(int vida, String tipo) {
		super();
		this.vida = vida;
		this.tipo = tipo;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void recibirDanio(int puntos) {
		this.vida=vida-puntos;
		
		if(vida==0) {
			System.out.println("Enemigo K.O.");
		}
	}
	
	
	
}
