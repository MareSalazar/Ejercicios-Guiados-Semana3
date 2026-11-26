package Programacion2P2.Guiados.Semana8.EJGuiado;

// Desafío de la guía: añadir otro subtipo que la lista de Usuario ya puede recibir.
public class Soporte extends Usuario {
    public Soporte(String username, String correo) {
        super(username, correo);
    }

    @Override
    public String obtenerPermisos() {
        return "Revisar y resolver incidencias";
    }

    @Override
    public String mostrarInformacion() {
        return "Soporte | " + super.mostrarInformacion()
                + " | Permisos: " + obtenerPermisos();
    }
}