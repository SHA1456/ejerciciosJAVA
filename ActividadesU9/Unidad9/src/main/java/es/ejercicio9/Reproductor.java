package es.ejercicio9;

public class Reproductor implements Reproducible{

	private Reproducible pista;
	
	
	
	public Reproductor(Reproducible pista) {
		this.pista = pista;
	}

	@Override
	public void play() {
		pista.play();
		
	}

	@Override
	public void pause() {
		pista.pause();
		
	}

	@Override
	public void stop() {
		pista.stop();
		
	}

}
