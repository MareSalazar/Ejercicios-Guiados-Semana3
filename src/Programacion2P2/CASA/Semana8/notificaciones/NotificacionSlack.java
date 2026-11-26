package Programacion2P2.CASA.Semana8.notificaciones;

// Desafío de la guía: agrega el canal Slack.
public class NotificacionSlack extends Notificacion {
    private String espacioTrabajo;

    public NotificacionSlack(String destinatario, String mensaje, String espacioTrabajo) {
        super(destinatario, mensaje);
        this.espacioTrabajo = espacioTrabajo;
    }

    // La guía pide sobrescribir generarMensaje() para producir el formato del canal.
    @Override
    public String generarMensaje() {
        return "[SLACK · " + espacioTrabajo + "] " + getDestinatario() + " → " + getMensaje();
    }
}
