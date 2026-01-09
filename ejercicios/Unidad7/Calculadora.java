package es.calculadora;

public class Calculadora {

	//Atributos
	private int num1;
	
	private int num2;
	
	//Metodos
	
	public Calculadora (int n1,int n2) {
		this.num1=n1;
		this.num2=n2;
	}
	
	
	public int sumar() {
		return num1+num2;
	}
	
	public int restar () {
		return num1-num2;
	}
	
	public int multiplicar () {
		return num1*num2;
	}
	
	public double dividir () {
		if(num1==0||num2==0) {
			System.err.println("La división no es posible");
			return (double) 0;
		}else {
		return (double) num1/num2;
		}
	}
}
