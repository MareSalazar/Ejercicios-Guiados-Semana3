package Programacion2P2.GuiadoSemana9;


// Paso 3: la computadora hereda las características de un dispositivo.
public class Computadora extends Dispositivos {
    private int memoriaRamGb;

    public Computadora(String codigo, String marca, boolean encendido, int memoriaRamGb) {
        // Primero inicializamos los datos comunes con el constructor del padre.
        super(codigo, marca, encendido);
        this.memoriaRamGb = memoriaRamGb;
    }

    // Ejecutar un programa es un comportamiento propio de la computadora.
    public String ejecutarPrograma(String nombrePrograma) {
        if (!estaEncendido()) {
            return "No se puede ejecutar " + nombrePrograma + ": la computadora está apagada.";
        }

        return "Ejecutando " + nombrePrograma + ".";
    }

    // Paso 4: mantenemos la firma del padre y agregamos la memoria RAM.
    @Override
    public String mostrarInformacion() {
        return "Computadora | " + super.mostrarInformacion()
                + " | RAM: " + memoriaRamGb + " GB";
    }
}