package clases;

public abstract class Usuario {
	private String Nombre;  // no se puede repetir un nombre de usuario
	private String Contrasena;
	private String NombreReal;
	
	public Usuario(String nombre, String contrasena, String nombreReal) {
		Nombre = nombre;
		Contrasena = contrasena;
		NombreReal = nombreReal;
	}

	public String getNombre() {
		return Nombre;
	}
	public String getNombreReal() {
		return NombreReal;
	}

	
}
