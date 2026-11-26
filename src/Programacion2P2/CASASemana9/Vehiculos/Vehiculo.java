package Programacion2P2.CASASemana9.Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private Propietario propietario;

    public Vehiculo(String marca, String modelo, int anio, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String obtenerDatosCompletos() {
        return String.format("%s %s (%d) | Propietario: %s",
                marca, modelo, anio, propietario.toString());
    }
}
