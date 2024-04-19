package clases;

public abstract class Usuario {
	protected String nombre;  // no se puede repetir un nombre de usuario
	protected String contrasena;
	protected String nombreReal;
	
	public Usuario(String nombre, String contrasena, String nombreReal) {
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.nombreReal= nombreReal;
	}

	public String getNombre() {
		return this.nombre;
	}
	public String getNombreReal() {
		return this.nombreReal;
	}

	
}
