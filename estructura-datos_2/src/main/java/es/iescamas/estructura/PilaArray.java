package es.iescamas.estructura;

public class PilaArray extends ListaArray{

	public PilaArray() {
		super();
	}
	
	public Boolean isEmpty() {
		if(super.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push (Integer n) {
		if(n!=null) {
			super.addFinal(n);
		}
		
		
	}
	
	public Integer pop () {
		if(isEmpty()) {
			return null;
		}else {
			return super.remove(super.size()-1);
		}
		
		
	}
	
	public Integer peek() {
		return super.get(super.size()-1);
	}
}
