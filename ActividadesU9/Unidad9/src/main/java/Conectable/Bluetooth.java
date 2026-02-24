package Conectable;

public class Bluetooth implements Conectable{

	private boolean encendido;

	
	
	public Bluetooth() {
		super();
		this.encendido = false;
	}

	@Override
	public void conectar() {
		
		this.encendido = true;
		
	}

	@Override
	public void desconectar() {
		this.encendido=false;
	}

	@Override
	public boolean estaConectado() {
		if (this.encendido==true) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
