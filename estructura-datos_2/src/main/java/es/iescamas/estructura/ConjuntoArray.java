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
	
	
	public boolean contains (Integer n) {
		return super.indexOf(n)>=0;
	}
	
	public boolean removeValue(Integer n) {
		if(contains(n)) {
			for(int i=0;i<super.size();i++) {
				Integer elemento_pos = super.get(i);
				if(elemento_pos==n) {
					super.remove(i);
					return true;
				}
				
			}
			
		}
		return false;
	}
	
}