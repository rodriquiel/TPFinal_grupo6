package clases;
import java.time.LocalDateTime;

public class Pedido {
    private LocalDateTime fecha;
    private String tipoServicio;
    private String zona;
    private boolean mascotas;
    private String equipaje;
    private int cantidadPasajeros;
    private Cliente cliente;

    public Pedido(LocalDateTime fecha, String tipoServicio, String zona, boolean mascotas, String equipaje, int cantidadPasajeros, Cliente cliente) {
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
        this.zona = zona;
        this.mascotas = mascotas;
        this.equipaje = equipaje;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cliente = cliente;
    }

}