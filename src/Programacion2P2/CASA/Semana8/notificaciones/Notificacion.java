package Programacion2P2.CASA.Semana8.notificaciones;

// SW-H2: define el destinatario y el mensaje comunes a todos los canales.
public class Notificacion {
    private String destinatario;
    private String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    // La guía pide un método común para que cada canal defina su formato.
    public String generarMensaje() {
        return "Para " + destinatario + ": " + mensaje;
    }
}
