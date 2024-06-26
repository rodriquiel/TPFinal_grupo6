package clases;

public class ChoferTemporario extends Chofer {
	private double SueldoBasico;
	private int Aportes;
	private int CantViajes;
	
	public ChoferTemporario(String dNI, String nombre, double sueldoBasico, int aportes, int cantViajes) {
		super(dNI, nombre);
		SueldoBasico = sueldoBasico;
		Aportes = aportes;
		CantViajes = cantViajes;
	}

	public double getSueldoBruto() {
		if (this.CantViajes > 40)
			return this.SueldoBasico*1.1;
		return this.SueldoBasico;
	}
	
	public double getSueldoNeto() {
		return this.getSueldoBruto()*(1-this.Aportes/100.0);
	}
    
	@Override
	public double calculaSueldo()
	{
		return this.getSueldoNeto();
	}
}