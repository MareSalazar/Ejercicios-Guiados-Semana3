package Programacion2P2.CASA.Semana8.notificaciones;

// Punto de entrada. Crea los objetos y demuestra el funcionamiento.
public class Main {
    public static void main(String[] args) {
        // La guía pide crear los objetos fuera de la colección.
        String mensaje = "Tu solicitud fue aprobada.";
        Notificacion email = new NotificacionEmail("ana@demo.com", mensaje, "Estado de la solicitud");
        Notificacion sms = new NotificacionSMS("0991234567", mensaje);
        Notificacion push = new NotificacionPush("ana", mensaje, "Portal");

        GestorNotificaciones gestor = new GestorNotificaciones();
        // El administrador del ejercicio recibe objetos ya creados.
        gestor.agregarNotificacion(email);
        gestor.agregarNotificacion(sms);
        gestor.agregarNotificacion(push);

        // Pruebas mínimas de la guía. Solo Main imprime los resultados.
        // Los tres canales usan el mismo texto para comparar los formatos.
        System.out.print(gestor.mostrarNotificaciones());

        // Desafío de la guía. Usa el nuevo subtipo con la misma colección.
        gestor.agregarNotificacion(new NotificacionSlack("#solicitudes", mensaje, "Equipo"));
        System.out.print(gestor.mostrarNotificaciones());
    }
}
