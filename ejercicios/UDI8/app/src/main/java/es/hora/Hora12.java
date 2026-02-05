package es.hora;

public class Hora12 extends Hora{

	protected Periodo periodo;
	
	public Hora12(int hora, int minutos,Periodo periodo) {
		super(hora, minutos);
		this.periodo=periodo;
	}

	
	public void inc() {
		super.minutos++;
		if(super.minutos>59) {
			super.minutos=0;
			super.hora++;
			if(super.hora>11) {
				super.hora=0;
				if(periodo.equals(Periodo.AM)) {
					periodo=Periodo.PM;
				}else {
					periodo=Periodo.AM;
				}
			}
			
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d",hora,minutos)+periodo;
	}
	
	public boolean setHora(int valor) {
		
		
	}
	
	
}
