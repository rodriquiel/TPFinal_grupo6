package clases;

public class VehiculoFactory {
    
	public Vehiculo crear(String tipo, String patente) {
        switch (tipo) {
            case "Moto":
                return new Moto(patente,false,false,1);
            case "Automovil":
                return new Automovil(patente,true,true,4);
            case "Combi":
                return new Combi(patente,false,false,10);
            default:
                return null;
        }
    }
}
