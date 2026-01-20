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
		this.contenido="";
	}
	
	
	
	public Texto(String Contenido, int maxLongitud) {
		if(maxLongitud<=0) {
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		}
		if(Contenido!=null&&Contenido.length()>maxLongitud) {
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		}
		if(Contenido==null) {
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		}
		this.contenido=Contenido;
		this.maxLongitud=maxLongitud;
	}



	private String contenido;

	private int maxLongitud;
	
	
	
	public String getContenido() {
		return contenido;
	}


	public int longitud() {
		if(contenido==null) {
			throw new NullPointerException("No tiene longitud un texto null");
		}
		return contenido.length();
	}
	
	public boolean anadirFinal(char c){
		
		if(contenido.length()<maxLongitud) {
			StringBuilder sb = new StringBuilder(c);
			sb.append(c);
			contenido=sb.toString();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean anadirInicio(char c) {
		StringBuilder sb = new StringBuilder();
		if(contenido.length()<maxLongitud) {
			sb.append(c);
			sb.append(contenido);
			contenido=sb.toString();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean anadirInicio (String cadena) {
		if(cadena==null)
			throw new IllegalArgumentException("cadena no puede ser null");
			if(contenido.length()+cadena.length()<=maxLongitud) {
			contenido=cadena+contenido;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean anadirFinal (String cadena) {
		if(cadena==null) {
			throw new IllegalArgumentException("cadena no puede ser null");
		}
		if(contenido.length()+cadena.length()<=maxLongitud) {
			contenido=contenido+cadena;
			return true;
		}else {
			return false;
		}
	}
	
	public int contarVocales() {
		int nvocales=0;
		char [] vocales = {'a','e','i','o','u','A','E','I','O','U','á','é','í','ó','ú','Á','É','Ó','Í','Ú'};
		for(int i=0;i<contenido.length();i++) {
			char c = contenido.charAt(i);
			
			for(int j=0;j<vocales.length;j++) {
				if(c==vocales[j]) {
					nvocales++;
					break;
				}
			}
		}
		return nvocales;
	}
	
	public String toString () {
		return contenido;
	}
	
	
	
	
}
