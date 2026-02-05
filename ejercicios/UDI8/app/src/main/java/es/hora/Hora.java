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
	
	public void incrementar (int minutos) {
		if(this.minutos+minutos>59) {
			this.minutos=0;
			this.hora=this.hora+1;
			if(hora>=24) {
				this.hora=0;
				this.minutos=0;
			}
		}else if(minutos<0) {
			throw new IllegalArgumentException("No se puede incrementar con números negativos");
		}else {
		this.minutos=this.minutos+minutos;
		}
	}
	
	public String toString () {
		return String.format("%02d:%02d",hora,minutos);
	}
	
}
