package es.iescamas.programacion.ej2;

public class Libro implements Catalogable{

	private String titulo;
	
	private String autor;
	
	private int anyo;
	
	private double precio;
	
	
	
	public Libro (String titulo,String autor,int anyo, double precio) {
		this.titulo=titulo;
		this.autor=autor;
		this.anyo=anyo;
		this.precio=precio;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarFicha() {
		System.out.println("[" +  anyo + "]" + titulo + "-" + autor + "(" + precio + ")");
	}

	@Override
	public String getCodigo() {
		return "LIB-" + anyo + " " +titulo.substring(0, 3).toUpperCase();
	}

	@Override
	public void mostrarEnCatalogo() {
		mostrarFicha(); 
		System.out.println("[" + getCodigo() + "]");;
		
	}
	
}
