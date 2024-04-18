package clases;

import java.util.ArrayList;
import java.util.Queue;

public class Administrador extends Usuario{

	private Queue<Chofer> colaChofer ;
	private static Administrador _instancia = null;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	private Administrador() { //crear clase sistema y hacerla singleton
		this.nombre = "Admin";
		this.contrasena = "Admin1";
		this.nombreReal = null;
		
	}
    
	public static Administrador getInstancia()
	{
		if (_instancia == null)
			_instancia = new Administrador();
		return _instancia;
	}
}

