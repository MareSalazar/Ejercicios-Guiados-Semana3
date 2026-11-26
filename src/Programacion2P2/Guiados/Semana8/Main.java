package Programacion2P2.Guiados.Semana8;

public class Main {
    public static void main(String[] args) {
        // La guía pide crear un objeto de cada rol fuera del sistema.
        Usuario admin = new Administrador("admin1", "admin@demo.com");
        Usuario desarrollador = new Desarrollador("dev1", "dev@demo.com");
        Usuario cliente = new Cliente("cliente1", "cliente@demo.com");

        SistemaUsuarios sistema = new SistemaUsuarios();
        sistema.agregarUsuario(admin);
        sistema.agregarUsuario(desarrollador);
        sistema.agregarUsuario(cliente);

        // Prueba 1: el listado muestra una descripción y permisos por rol.
        System.out.println("Usuarios registrados");
        System.out.print(sistema.mostrarUsuarios());

        // Prueba 2: buscar un usuario por su username.
        Usuario encontrado = sistema.buscarUsuario("dev1");
        if (encontrado != null) {
            System.out.println("\nEncontrado: " + encontrado.mostrarInformacion());
        }

        // Prueba 3: eliminar un usuario y comprobar que ya no aparece al buscarlo.
        boolean eliminado = sistema.eliminarUsuario("cliente1");
        System.out.println("¿Se eliminó cliente1? " + eliminado);
        System.out.println("¿Sigue registrado cliente1? "
                + (sistema.buscarUsuario("cliente1") != null));

        // Desafío: agregar Soporte usando el mismo método agregarUsuario().
        sistema.agregarUsuario(new Soporte("soporte1", "soporte@demo.com"));
        System.out.println("\nListado después de agregar Soporte");
        System.out.print(sistema.mostrarUsuarios());
    }
}