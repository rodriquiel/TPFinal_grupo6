package clases;
import java.time.LocalDateTime;

public class Pedido {
    private LocalDateTime fecha;
    private String tipoServicio;
    private String zona;
    private boolean mascotas;
    private boolean equipaje;
    private int cantidadPasajeros;
    private Cliente cliente;
	private int distancia;

    public Pedido(LocalDateTime fecha, String tipoServicio, String zona, boolean mascotas, boolean equipaje, int cantidadPasajeros, Cliente cliente,int distancia) {
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
        this.zona = zona;
        this.mascotas = mascotas;
        this.equipaje = equipaje;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cliente = cliente;
        this.distancia =  distancia;
    }

	public String getZona() {
		return this.zona;
	}

	public boolean isMascotas() {
		return this.mascotas;
	}

	public boolean isEquipaje() {
		return this.equipaje;
	}

	public int getCantidadPasajeros() {
		return this.cantidadPasajeros;
	}
	public int getDistancia() {
		return this.distancia;
	}
	public double ObtieneCosto() {
		
		double ValorBase = 1000.0;
		//preguntar si el valor base es la bajada de bandera o si el viaje arranca en 0
		double aux=0.0;
		if(this.getZona().equalsIgnoreCase("Estandar")) {
			aux += ValorBase*0.1*this.getCantidadPasajeros();
			aux += ValorBase*0.1*this.getDistancia();
		}
		else if(this.getZona().equalsIgnoreCase("Calle sin asflatar")) {
			aux += ValorBase*0.2*this.getCantidadPasajeros();
			aux += ValorBase*0.15*this.getDistancia();
		}
		else if(this.getZona().equalsIgnoreCase("Zona Peligrosa")){
			aux += ValorBase*0.1*this.getCantidadPasajeros();
			aux += ValorBase*0.2*this.getDistancia();
		}
		else {
			//throw exception;
		}
		
		if(this.isMascotas()) {
			aux += ValorBase*0.1*this.getCantidadPasajeros();
			aux += ValorBase*0.2*this.getDistancia();
		}
		
		if(this.isEquipaje()) {
			aux += ValorBase*0.1*this.getCantidadPasajeros();
			aux += ValorBase*0.05*this.getDistancia();
		}
		
		return aux;
		
	}
	
}