package Programacion2P2.Guiados.Semana8.EJGuiado;

import java.util.ArrayList;

public class SistemaUsuarios {
    // Paso 5: la lista usa el tipo padre para aceptar cualquiera de sus subtipos.
    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    // El objeto se crea en Main y el sistema recibe su referencia.
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // La guía pide buscar por username. Devolvemos null si no hay coincidencia.
    public Usuario buscarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }

    // Reutilizamos la búsqueda para localizar el objeto que se va a eliminar.
    public boolean eliminarUsuario(String username) {
        Usuario encontrado = buscarUsuario(username);
        return encontrado != null && usuarios.remove(encontrado);
    }

    // Paso 6: cada objeto ejecuta su propia versión de mostrarInformacion().
    public String mostrarUsuarios() {
        String listado = "";
        for (Usuario usuario : usuarios) {
            listado += usuario.mostrarInformacion() + "\n";
        }
        return listado;
    }
}