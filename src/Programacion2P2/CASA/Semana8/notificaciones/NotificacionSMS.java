package Programacion2P2.CASA.Semana8.notificaciones;

// Para SMS, el teléfono ya se guarda como destinatario.
public class NotificacionSMS extends Notificacion {
    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    // La guía pide sobrescribir generarMensaje() para producir el formato del canal.
    @Override
    public String generarMensaje() {
        return "[SMS a " + getDestinatario() + "] " + getMensaje();
    }
}
