package com;
import java.util.Arrays;
import java.util.Scanner;
public class Act4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int pos;
		int [] tabla= {2,4,6,8,10};
		
		do {
			
			System.out.println("La tabla actual es: " + Arrays.toString(tabla));
			System.out.println("Introduce el índice a eliminar: ");
			pos=sc.nextInt();
			
			if(pos>=0) {
			if (pos>tabla.length) {
				System.err.println("Índice introducido inválido");
			}else {
				tabla=eliminarNumero(tabla,pos);
				System.out.println("Elemento eliminado");
			}
		}
		}while(pos>=0&&tabla.length>0);
		 System.out.println("Programa terminado. Tabla final: " + Arrays.toString(tabla));
	}
	
	public static int[] eliminarNumero (int [] t, int pos) {
		
		int aux=t[pos];
		t[pos]=t[t.length-1];
		t[t.length-1]=aux;
		return Arrays.copyOf(t,t.length-1);
		
	}

}
