package Programacion2P2.GuiadoSemana9;

public class Dispositivos {
    // Paso 1: los datos comunes se guardan una sola vez en la superclase.
    private String codigo;
    private String marca;
    private boolean encendido;

    public Dispositivos(String codigo, String marca, boolean encendido) {
        this.codigo = codigo;
        this.marca = marca;
        this.encendido = encendido;
    }

    // Paso 2: las hijas consultan el estado mediante un método protected.
    // El atributo encendido se mantiene private.
    protected boolean estaEncendido() {
        return encendido;
    }

    // Esta descripción general se puede reutilizar en las clases hijas.
    public String mostrarInformacion() {
        String estado = encendido ? "Encendido" : "Apagado";
        return "Código: " + codigo + " | Marca: " + marca + " | Estado: " + estado;
    }
}
