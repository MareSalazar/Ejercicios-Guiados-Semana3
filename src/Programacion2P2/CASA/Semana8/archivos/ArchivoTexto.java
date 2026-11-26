package Programacion2P2.CASA.Semana8.archivos;

// Subtipo de Archivo solicitado en la guía.
public class ArchivoTexto extends Archivo {
    public ArchivoTexto(String nombre, double tamanoMB) {
        // super inicializa los atributos comunes que pide la guía.
        super(nombre, tamanoMB);
    }

    // Sobrescribe el cálculo con la regla de ejemplo de este tipo.
    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB();
    }

    // La guía pide una descripción propia. Conservamos la información del padre.
    @Override
    public String mostrarInformacion() {
        return "Texto | " + super.mostrarInformacion()
                + String.format(" | Procesado: %.2f MB", calcularEspacioProcesado());
    }
}
