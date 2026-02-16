package es.iescamas.estructura;

public class ConjuntoArray extends ListaArray{

	public ConjuntoArray() {
		super();
	}
	
	public boolean add (Integer n) {
		
		if(!contains(n)) {
			super.addFinal(n);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removeValue(Integer n) {
		int index=super.indexOf(n);
		
		if(index>=0) {
			super.remove(index);
			return true;
		}
		return false;
	}
	
	public boolean contains (Integer n) {
		return super.indexOf(n)>=0;
	}
	
}