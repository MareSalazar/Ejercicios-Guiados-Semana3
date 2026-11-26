package Programacion2P2.CASA.Semana8.notificaciones;

import java.util.ArrayList;

// La guía pide agrupar objetos ya creados en un ArrayList<Notificacion>.
public class GestorNotificaciones {
    private ArrayList<Notificacion> notificaciones;

    public GestorNotificaciones() {
        notificaciones = new ArrayList<>();
    }

    public void agregarNotificacion(Notificacion elemento) {
        notificaciones.add(elemento);
    }

    // La guía pide listar desde la colección llamando al método de cada objeto.
    public String mostrarNotificaciones() {
        String listado = "";
        for (Notificacion elemento : notificaciones) {
            listado += elemento.generarMensaje() + "\n";
        }
        return listado;
    }
}
