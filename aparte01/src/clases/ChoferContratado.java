package clases;

public class ChoferContratado extends Chofer {
	private double GananciaViaje;
	
	public ChoferContratado(String dNI, String nombre, double gananciaViaje) {
		super(dNI, nombre);
		GananciaViaje = gananciaViaje;
	}

	@Override
	public double getSueldoBruto() {
		return this.GananciaViaje;
	}

	@Override
	public double getSueldoNeto() {
		return this.GananciaViaje;
	}

}
