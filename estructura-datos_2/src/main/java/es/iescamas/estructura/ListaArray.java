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
	
	public String toString() {
		return Arrays.toString(tabla);
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
