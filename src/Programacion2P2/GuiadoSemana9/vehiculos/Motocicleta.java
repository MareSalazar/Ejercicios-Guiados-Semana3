package Programacion2P2.GuiadoSemana9.vehiculos;

public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String marca, String modelo, int anio, Propietario propietario, int cilindraje) {
        super(marca, modelo, anio, propietario);
        this.cilindraje = cilindraje;
    }

    @Override
    public String obtenerDatosCompletos() {
        return "Motocicleta - " + super.obtenerDatosCompletos() + " | Cilindraje: " + cilindraje + " cc";
    }
}
