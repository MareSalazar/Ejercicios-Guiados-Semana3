package Programacion2P2.CASA.Semana8.archivos;

// Desafío de la guía: incorpora ArchivoAudio.
public class ArchivoAudio extends Archivo {
    public ArchivoAudio(String nombre, double tamanoMB) {
        // super inicializa los atributos comunes que pide la guía.
        super(nombre, tamanoMB);
    }

    // Sobrescribe el cálculo con la regla de ejemplo de este tipo.
    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 0.60;
    }

    // La guía pide una descripción propia. Conservamos la información del padre.
    @Override
    public String mostrarInformacion() {
        return "Audio | " + super.mostrarInformacion()
                + String.format(" | Procesado: %.2f MB", calcularEspacioProcesado());
    }
}
