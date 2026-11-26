package Programacion2P2.Guiados.Semana8.EJGuiado;

// Paso 2: Administrador hereda de Usuario.
public class Administrador extends Usuario {
    public Administrador(String username, String correo) {
        // El constructor de Usuario inicializa los datos comunes.
        super(username, correo);
    }

    // Paso 3: sobrescribe los permisos con la misma firma del padre.
    @Override
    public String obtenerPermisos() {
        return "Gestionar usuarios y configurar el sistema";
    }

    // Paso 4: reutiliza los datos comunes y agrega la descripción del rol.
    @Override
    public String mostrarInformacion() {
        return "Administrador | " + super.mostrarInformacion()
                + " | Permisos: " + obtenerPermisos();
    }
}