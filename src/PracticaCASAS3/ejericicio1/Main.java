package PracticaCASAS3.ejericicio1;

public class Main {
    public static void main(String[] args) {

        // CREAR UN OBJETO
        Username usuario1 = new Username();

        usuario1.setUsername("mare123");
        usuario1.setCorreo("mare@ejemplo.com");
        usuario1.setNivel(5);
        usuario1.activar();


        System.out.println("DATOS INICIALES\n ");
        System.out.println("Username: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Nivel: " + usuario1.getNivel());
        System.out.println("Activo: " + usuario1.isActivo());

        System.out.println("\n VALIDACIONES ");

        usuario1.setUsername("");
        usuario1.setCorreo("");
        usuario1.setNivel(-2);

        System.out.println("\n DATOS DESPUES DE VALIDAR ");
        System.out.println("Username: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Nivel: " + usuario1.getNivel());

        // Desactivar usuario
        usuario1.desactivar();

        System.out.println("\n ESTADO FINAL ");
        System.out.println("Activo: " + usuario1.isActivo());
    }
}
