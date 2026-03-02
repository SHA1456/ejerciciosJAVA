package es.descuentable;

public class Main {

	public static void main(String[] args) {
		
		Descuentable [] descuentable = new Descuentable[10];
		
		Producto p = new Producto ("PC",1000);

		Servicio s = new Servicio("Reparación",1.0);
		
		descuentable[0]=p;
		descuentable[1]=s;
		
		for(Descuentable des : descuentable) {
			if(des!=null) {
			System.out.println("Base" + des.precioBase() + "Descuento" + des.precioFinal(0));
			}
		}
		
	}

}
