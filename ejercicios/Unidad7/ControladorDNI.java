package es.dni;
import java.util.Random;
public class ControladorDNI {
Random random = new Random();
	//Atributos
	
	private final char [] letras= {'T','R','W','A','G','M','Y','F','P','D','X','B', 'N','J','Z','S','Q','V','H','L','C','K','E'
};
	
	private final int DIVISOR_DNI=23;
	
	private final int LONGITUD_NUMERO_DNI=8;
	
	private final int DNI_COMPLETO=9;

	
	//Metodos
	
	public  char[] getLetras() {
		return letras;
	}
	
	private char calcularLetra (String numeroDni) {
		if(numeroDni==null) {
			System.err.println("El número es incorrecto");
		}
		
			int numero=Integer.parseInt(numeroDni); //Con parseInt convertimos un String en un entero
			return letras [numero%DIVISOR_DNI];
		
	}
	
	public boolean esValido (String dniCompleto) throws Exception {
		if(dniCompleto==null)return false;
		
		if(dniCompleto.length()<DNI_COMPLETO)
			
			throw new Exception("La longitud no es correcta");
		
		
		char letra=dniCompleto.charAt(8);
		
		String dnisinletra=dniCompleto.substring(0,7);
		
		System.out.println(letra + " " + dnisinletra);
		
		return calcularLetra(dnisinletra) == Character.toUpperCase(letra);
		
	}
	
	public String generarAleatorioDNI();

	int numeroDNIRandom = random.nextInt(100_000_000);
	String numero=String.format("%08d", numeroDNIRandom);
    char letra = calcularLetra(numero);
    return numero+letra;
	
	
}}
