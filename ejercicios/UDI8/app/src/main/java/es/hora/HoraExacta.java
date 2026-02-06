package es.hora;

public class HoraExacta extends Hora{

	private int segundos;
	
	public HoraExacta (int hora, int minutos, int segundos) {
		super(hora,minutos);
		if(segundos>60||segundos<0) throw new IllegalArgumentException("Los segundos no son correctos");
		this.segundos=segundos;
		
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora,minutos,segundos);
	}

	public boolean setSegundos(int valor) {
		if(valor<0 || valor>60) {
			return false;
		}
		this.segundos=valor;
		return true;
	}
	@Override
	public void inc() {
		segundos++;
		if(this.segundos>=60) {
			
		}
		
		
	}
	
	
	
}
