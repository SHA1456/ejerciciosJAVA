package es.calculadora;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora (5,8);
		
		System.out.println(calc.sumar());
		
		System.out.println(calc.dividir());
		
		System.out.println(calc.restar());
		
		System.out.println(calc.multiplicar());

	}

}
