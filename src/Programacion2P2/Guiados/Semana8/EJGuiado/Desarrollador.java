package Programacion2P2.Guiados.Semana8.EJGuiado;

// Pasos 2 a 4: especializa Usuario para el rol de desarrollador.
public class Desarrollador extends Usuario {
    public Desarrollador(String username, String correo) {
        super(username, correo);
    }

    @Override
    public String obtenerPermisos() {
        return "Consultar y editar proyectos asignados";
    }

    @Override
    public String mostrarInformacion() {
        return "Desarrollador | " + super.mostrarInformacion()
                + " | Permisos: " + obtenerPermisos();
    }
}