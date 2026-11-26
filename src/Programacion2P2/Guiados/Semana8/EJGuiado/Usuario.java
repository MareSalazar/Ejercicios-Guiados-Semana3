package Programacion2P2.Guiados.Semana8.EJGuiado;

// Paso 1 de la guía: reúne los datos y métodos comunes a todos los roles.
public class Usuario {
    private String username;
    private String correo;

    //Constructor
    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    // El sistema usa este dato para buscar y eliminar usuarios.
    public String getUsername() {
        return username;
    }

    public String obtenerPermisos() {
        return "Consultar su perfil";
    }

    public String mostrarInformacion() {
        return "Usuario: " + username + " | Correo: " + correo;
    }
}
