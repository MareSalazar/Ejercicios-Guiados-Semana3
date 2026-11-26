package Programacion2P2.GuiadoSemana9;

// Paso 3: la cámara hereda los datos comunes y agrega su resolución.
public class CamaraSeguridad extends Dispositivos {
    private String resolucion;

    public CamaraSeguridad(String codigo, String marca, boolean encendido, String resolucion) {
        super(codigo, marca, encendido);
        this.resolucion = resolucion;
    }

    // Grabar video es un comportamiento propio de la cámara.
    public String grabarVideo() {
        if (!estaEncendido()) {
            return "No se puede grabar video: la cámara está apagada.";
        }

        return "Grabando video en " + resolucion + ".";
    }

    // Paso 4: reutilizamos la descripción general y añadimos la resolución.
    @Override
    public String mostrarInformacion() {
        return "Cámara de seguridad | " + super.mostrarInformacion()
                + " | Resolución: " + resolucion;
    }
}