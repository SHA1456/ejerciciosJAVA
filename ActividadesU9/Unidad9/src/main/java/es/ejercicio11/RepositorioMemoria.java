package es.ejercicio11;

import java.util.Arrays;

public class RepositorioMemoria <T extends Identificable> implements Repositorio<T> {
	private Identificable[] datos;
	private int contador;
	
	
	
	public RepositorioMemoria() {
		
		this.datos = new Identificable[10];
		this.contador = 0;
	}

	@Override
	public void add(T item) {
		if(contador==datos.length) {
			ampliarArray();
		}
		datos[contador]=item;
		contador++;
		
	}

	public void ampliarArray() {
		Identificable [] nuevo = Arrays.copyOf(datos,datos.length * 2);
		datos=nuevo;
	}
	
	@Override
	public boolean remove(T item) {
		if(item==null) {
			return false;
		}
		
		for(int i=0;i<contador;i++) {
			if(datos[i].getId().equals(item.getId())) {
				for(int j=0;j<contador-1;j++) {
					datos[j]=datos[j+1];
				}
			}
		}
		datos[contador-1]=null;
		contador--;
		return true;
	}

	@Override
	public T findById(String id) {
		if(id==null) {
			return null;
		}
		
		for(int i=0;i<contador;i++) {
			if(datos[i].getId().equals(id)) {
				
			}
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
}
