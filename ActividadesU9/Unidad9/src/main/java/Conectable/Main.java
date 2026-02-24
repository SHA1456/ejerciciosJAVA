package Conectable;

public class Main {

	public static void main(String[] args) {
		
		Bluetooth bl = new Bluetooth();
		
		Conectable [] con = new Conectable [3];
		Cable c = new Cable();
		con [0] = c;
		WiFi w = new WiFi();
		con[1]=w;
		con[2]= bl;
		
		for(int i=0;i<con.length;i++) {
			con[i].conectar();
			System.out.println(con[i].estaConectado());
			con[i].desconectar();
			System.out.println(con[i].estaConectado());
			
		}
		
		
	}

}
