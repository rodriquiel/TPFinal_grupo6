package clases;

public abstract class Vehiculo {
	private String Patente;
	private boolean baul; 
	private boolean petFriendly;
	private int maxPasajeros;
	
	public Vehiculo(String patente, boolean baul, boolean petFriendly, int maxPasajeros) {
		super();
		Patente = patente;
		this.baul = baul;
		this.petFriendly = petFriendly;
		this.maxPasajeros = maxPasajeros;
	}
	
	
}
