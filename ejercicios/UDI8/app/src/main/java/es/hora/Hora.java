package es.hora;

public class Hora {

	protected int hora;
	protected int minutos;
	
	public Hora (int hora,int minutos) {
		this.hora=hora;
		this.minutos=minutos;
	}
	/**
	 * Asigna valor a la hora si tiene sentido
	 * @param hora
	 */
	public boolean setHora(int hora) {
		if(hora<0||hora>23) {
			return false;
		}else {
			this.hora=hora;
			return true;
		}
	}
	
	/**
	 * Asigna un valor si tiene sentido a los minutos
	 * @param minutos
	 */
	
	public void setMinutos(int minutos) {
		if(minutos<0||minutos>59) {
			throw new IllegalArgumentException("Minutos inválidos");
		}else {
			this.minutos=minutos;
		}
	}
	
	public void inc() {
		this.minutos++;
		if(this.minutos == 60) {
			this.minutos = 0;
			this.hora++;
			if(this.hora == 24) {
				this.minutos = 0;
				this.hora = 0;
			}
		}
	}
	
	public String toString () {
		return String.format("%02d:%02d",hora,minutos);
	}
	
}
