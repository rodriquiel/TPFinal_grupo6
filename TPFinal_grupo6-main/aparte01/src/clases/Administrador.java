package clases;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Administrador extends Usuario{

	private LinkedList<Chofer> colaChofer = new LinkedList<>();
	private PriorityQueue<Vehiculo> colaVehiculos = new PriorityQueue<>();
	
	public Administrador(String nombre, String contrasena, String nombreReal) {  //crear clase sistema y hacerla singleton
			super(nombre,contrasena,nombreReal);
	}
  
	public void AgregarChofer(Chofer chofer){
		this.colaChofer.add(chofer);
	}
	public Chofer SacarChofer(){
		return this.colaChofer.poll();
	}
	
	public void agregaVehiculo(Vehiculo vehiculo) 
	{
		this.colaVehiculos.add(vehiculo);
	}
}

