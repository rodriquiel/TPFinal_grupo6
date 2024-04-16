package clases;

public class ChoferPermanente extends Chofer {
	private double Sueldobasico;
	private int Antiguedad;
	private int Hijos;
	private int Aportes;
	private String FechaIngreso;

	public ChoferPermanente(String dNI, String nombre, double sueldobasico, int antiguedad, int hijos, int aportes,
			String fechaIngreso) {
		super(dNI, nombre);
		Sueldobasico = sueldobasico;
		Antiguedad = antiguedad;
		Hijos = hijos;
		Aportes = aportes;
		FechaIngreso = fechaIngreso;
	}

	@Override
	public double getSueldoBruto() {
		return this.Sueldobasico*(1.0 + this.Antiguedad/100.0 + this.Hijos/100.0);
	}

	@Override
	public double getSueldoNeto() {
		return this.getSueldoBruto()*( 1.0 - this.Aportes/100.0);
	}

}
