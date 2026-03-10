package es.ejercicio9;

public class Main {

	public static void main(String[] args) {
		
		Cancion c1 = new Cancion("Cancion1", "Autor1",3.45);
		Cancion c2 = new Cancion("Cancion2", "Autor2",4.25);
		Podcast p1 = new Podcast("Podcast1",120);		
		/*
		c1.mostrar();
		c2.mostrar();
		p1.mostrar();
	*/
		Reproductor rep = new Reproductor(c1);
		/*
		c1.play();
		c1.stop();
		c1.pause();
		*/
		Reproducible [] reprod = {c1,c2,p1,rep};
		
		for(Reproducible repro:reprod) {
			repro.play();
			repro.pause();
			repro.stop();
		}
		
	}

}
