package es.iescamas.estructura;

import java.util.Arrays;

public class ListaArray {

	private Integer [] tabla;
	
	private int numElementos;
	
	public ListaArray() {
		super();
		tabla=new Integer [0];
		this.numElementos=0;
	}
	
	public int size() {
		return numElementos;
	}
	
	public void addFinal(Integer n) {
		if (numElementos >= tabla.length) { 
			tabla=Arrays.copyOf(tabla, tabla.length+1);
        }else {
        	tabla[numElementos]=n;
        	numElementos++;
        }
		
		
	}
	
	@Override
	public String toString() {
		Integer[] tabla_a_imprimir = new Integer[numElementos];
		for(int i=0; i<numElementos; i++) {
			tabla_a_imprimir[i] = tabla[i];
		}
		return Arrays.toString(tabla_a_imprimir);
	}
	
	
	public Integer remove (int index) {
	
		 if (index < 0 || index >= numElementos) {
	           throw new IllegalArgumentException("Fuera de rango");
	        }

	        Integer valorEliminado = tabla[index];

	        for (int i = index; i < numElementos - 1; i++) {
	            tabla[i] = tabla[i + 1];
	        }

	        tabla[numElementos - 1] = null;
	        numElementos--;

	        return valorEliminado;
		
	}
	
	public Integer get (int index) {
		
		if(index<0||index>=numElementos) {
			throw new IllegalArgumentException("Fuera de rango");
		}
		
		return tabla[index];
	}
	
	public int indexOf(Integer n) {
		if(n<0||n>=numElementos) {
			throw new IllegalArgumentException("Fuera de rango");
		}
		
		for (int i = 0; i < numElementos; i++) {
            if (tabla[i].equals(n)) {
                return i;
            }
        }
        return -1;
	}

	public Integer[] getTabla() {
		return tabla;
	}
	
	
	
}
