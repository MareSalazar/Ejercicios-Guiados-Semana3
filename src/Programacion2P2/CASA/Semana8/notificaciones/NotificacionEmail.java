package Programacion2P2.CASA.Semana8.notificaciones;

// Este canal añade asunto como dato propio.
public class NotificacionEmail extends Notificacion {
    private String asunto;

    public NotificacionEmail(String destinatario, String mensaje, String asunto) {
        super(destinatario, mensaje);
        this.asunto = asunto;
    }

    // La guía pide sobrescribir generarMensaje() para producir el formato del canal.
    @Override
    public String generarMensaje() {
        return "[EMAIL] Para: " + getDestinatario()
                + " | Asunto: " + asunto + " | Cuerpo: " + getMensaje();
    }
}
