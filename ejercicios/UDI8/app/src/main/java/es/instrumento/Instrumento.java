package es.instrumento;

public abstract class Instrumento {

	protected int Max=100;
	
	protected int numNotas;
	
	protected Notas[] melodia; 
	
	public void interpretar() {
		melodia.toString();
	}
	
	public boolean add(Notas nota) {
		if(numNotas>Max) {
			return false;
		}else {
			melodia[numNotas]=nota;
			numNotas++;
			return true;
		}
	}
	
	
}
