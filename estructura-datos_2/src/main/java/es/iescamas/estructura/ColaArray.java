package es.iescamas.estructura;

public class ColaArray extends ListaArray{

	public ColaArray() {
		super();
	}
	
	public void enqueue(Integer n) {
		super.addFinal(n);
	}
	
	public Integer dequeue() {
		return super.remove(0);
	}
	
	public Integer first() {
		return super.get(0);
	}
	
	public Boolean isEmpty() {
		if(super.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	
}
