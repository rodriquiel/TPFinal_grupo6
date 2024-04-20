package clases;

import java.util.ArrayList;
import java.util.Queue;

public class Administrador extends Usuario{

	private ColaChofer colaChofer;
	private ColaVehiculos colaVehiculos;
	
	public Administrador(String nombre, String contrasena, String nombreReal) {  //crear clase sistema y hacerla singleton
			super(nombre,contrasena,nombreReal);
			this.colaChofer = ColaChofer();
			this.colaVehiculos = ColaVehiculos();
	}
  

}

