package Programacion2P2.CASA.Semana8.notificaciones;

// Este canal añade aplicacion como dato propio.
public class NotificacionPush extends Notificacion {
    private String aplicacion;

    public NotificacionPush(String destinatario, String mensaje, String aplicacion) {
        super(destinatario, mensaje);
        this.aplicacion = aplicacion;
    }

    // La guía pide sobrescribir generarMensaje() para producir el formato del canal.
    @Override
    public String generarMensaje() {
        return "[PUSH de " + aplicacion + "] " + getDestinatario() + ", " + getMensaje();
    }
}
