package Programacion2P2.Guiados.Semana8.EJGuiado;

// Pasos 2 a 4: especializa Usuario para el rol de cliente.
public class Cliente extends Usuario {
    public Cliente(String username, String correo) {
        super(username, correo);
    }

    @Override
    public String obtenerPermisos() {
        return "Consultar y crear solicitudes";
    }

    @Override
    public String mostrarInformacion() {
        return "Cliente | " + super.mostrarInformacion()
                + " | Permisos: " + obtenerPermisos();
    }
}