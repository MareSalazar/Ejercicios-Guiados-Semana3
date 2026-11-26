package Programacion2P2.CASA.Semana8.archivos;

// SW-H3: guarda nombre y tamaño en MB en la clase padre.
public class Archivo {
    private String nombre;
    private double tamanoMB;

    public Archivo(String nombre, double tamanoMB) {
        this.nombre = nombre;
        this.tamanoMB = tamanoMB;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    // La guía pide que cada subtipo sobrescriba este cálculo.
    public double calcularEspacioProcesado() {
        return tamanoMB;
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + String.format(" | Original: %.2f MB", tamanoMB);
    }
}
