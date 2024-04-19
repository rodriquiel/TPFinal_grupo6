package clases;

import java.util.ArrayList;
import java.util.Queue;

public class Administrador extends Usuario{

	private Queue<Chofer> colaChofer ;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Administrador(String nombre, String contrasena, String nombreReal) {  //crear clase sistema y hacerla singleton
			super(nombre,contrasena,nombreReal);
		
	}
  

}

