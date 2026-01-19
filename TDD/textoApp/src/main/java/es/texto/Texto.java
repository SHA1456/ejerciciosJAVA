package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {

	public Texto (int maxLongitud) {
		if(maxLongitud<=0) {
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		}
		this.maxLongitud=maxLongitud;
		this.Contenido="";
	}
	
	
	
	public Texto(String Contenido, int maxLongitud) {
		if(Contenido!=null&&Contenido.length()>maxLongitud) {
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		}
		if(Contenido==null) {
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		}
		this.Contenido=Contenido;
		this.maxLongitud=maxLongitud;
	}



	private String Contenido;

	private int maxLongitud;
	
	
	
	public String getContenido() {
		return Contenido;
	}


	public int longitud() {
		if(Contenido==null) {
			
		}
		return Contenido.length();
	}
	
	public boolean anadirFinal(char c){
		if(Contenido.length()>0&&Contenido.length()<maxLongitud) {
			Contenido=Contenido+c;
			System.out.println(Contenido);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean anadirInicio(char c) {
		if(Contenido.length()>0&&Contenido.length()<maxLongitud) {
			Contenido=c+Contenido;
			System.out.println(Contenido);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean anadirInicio (String c) {
		if(Contenido.length()<maxLongitud&&Contenido.length()+c.length()<maxLongitud) {
			Contenido=c+Contenido;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean anadirFinal (String c) {
		if(Contenido.length()<maxLongitud&&Contenido.length()+c.length()<maxLongitud) {
			Contenido=Contenido+c;
			return true;
		}else {
			return false;
		}
	}
	
	public int contarVocales() {
		char [] vocales = {'a','e','i','o','u','A','E','I','O','U'};
		
		
		
	}
	
	
	
}

