package clases;

public abstract class Chofer {
	private String DNI;
	private String Nombre;
	
	public Chofer(String dNI, String nombre) {
		DNI = dNI;
		Nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}
	public String getNombre() {
		return Nombre;
	}
	
	public abstract double getSueldoBruto();
	public abstract double getSueldoNeto();
}
