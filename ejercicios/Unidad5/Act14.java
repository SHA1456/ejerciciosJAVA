package com;

public class Act14 {

	public static void main(String[] args) {
		
		int [] apuesta = {1,3,6,9,14,21};
		int [] ganador = {1,4,6,8,16,21};
		
		System.out.println("El número de aciertos es de: " + Primitiva(apuesta,ganador));

	}

		public static int Primitiva (int [] apuesta, int [] ganador) {
			
			int aciertos = 0;
			
			for (int i=0;i<apuesta.length;i++) {
				
				int numero=apuesta[i];
				
				for(int j=0;j<ganador.length;j++) {
					
					if(numero==ganador[j]) {
						aciertos++;
					}
					
				}
				
			}
			
			return aciertos;
			
			
		}
}
