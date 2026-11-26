package Programacion2P2.GuiadoSemana9;

import Programacion2P2.CASASemana9.Vehiculos.Propietario;
import Programacion2P2.CASASemana9.Vehiculos.Vehiculo;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int anio, Propietario propietario, int numeroPuertas) {
        super(marca, modelo, anio, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String obtenerDatosCompletos() {
        return "Automóvil - " + super.obtenerDatosCompletos() + " | Puertas: " + numeroPuertas;
    }
}