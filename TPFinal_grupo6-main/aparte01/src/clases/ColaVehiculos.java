package clases;
import java.util.PriorityQueue;

public class ColaVehiculos {
	private PriorityQueue<Vehiculo> colaPrioridades;
	
	public ColaVehiculos() 
	{
		this.colaPrioridades = new PriorityQueue<>();
	}
	
	public void agregaVehiculo(Vehiculo vehiculo) 
	{
		this.colaPrioridades.add(vehiculo);
	}
}
