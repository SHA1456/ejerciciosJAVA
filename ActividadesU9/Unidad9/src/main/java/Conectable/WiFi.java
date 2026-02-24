package Conectable;

public class WiFi implements Conectable{

	private boolean encendido;
	
	
	public WiFi() {
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
