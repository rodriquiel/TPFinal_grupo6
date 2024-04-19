package clases;

public class ChoferContratado extends Chofer {
	private double GananciaViaje;
	
	public ChoferContratado(String dNI, String nombre, double gananciaViaje) {
		super(dNI, nombre);
		GananciaViaje = gananciaViaje;
	}

	@Override
	public double calculaSueldo() {
		return this.GananciaViaje;
	}

}