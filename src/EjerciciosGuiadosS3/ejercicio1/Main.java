package EjerciciosGuiadosS3.ejercicio1;

public class Main {

    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(false);

        dispositivo2.setNombre("Celular");
        dispositivo2.setTipo("Movil");
        dispositivo2.setActivo(true);

        // Consultar datos getters
        System.out.println(" DISPOSITIVO 1");
        System.out.println("Nombre: " + dispositivo1.getNombre());
        System.out.println("Tipo: " + dispositivo1.getTipo());
        System.out.println("Activo: " + dispositivo1.isActivo());

        System.out.println("\nDISPOSITIVO 2 ");
        System.out.println("Nombre: " + dispositivo2.getNombre());
        System.out.println("Tipo: " + dispositivo2.getTipo());
        System.out.println("Activo: " + dispositivo2.isActivo());

        // Validacion de ingresar nombre incorrecto
        System.out.println("\nVALIDACION ");

        dispositivo1.setNombre("");

        System.out.println("Nombre despues de validar: "
                + dispositivo1.getNombre());

        // Activar primer dispositivo
        System.out.println("\n ACTIVAR ");

        dispositivo1.activar();

        System.out.println("Estado dispositivo 1: "
                + dispositivo1.isActivo());

        // Desactivar segundo dispositivo
        System.out.println("\nDESACTIVAR ");

        dispositivo2.desactivar();

        System.out.println("Estado dispositivo 2: "
                + dispositivo2.isActivo());
    }
}
