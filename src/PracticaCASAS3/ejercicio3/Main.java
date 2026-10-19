package PracticaCASAS3.ejercicio3;


public class Main {

    public static void main(String[] args) {

        Servicio servicio1 = new Servicio();

        servicio1.setNombre("Servidor Web");
        servicio1.setPuerto(8080);
        servicio1.setCantidadPeticiones(0);

        System.out.println(" ESTADO INICIAL ");
        System.out.println("Nombre: " + servicio1.getNombre());
        System.out.println("Puerto: " + servicio1.getPuerto());
        System.out.println("Activo: " + servicio1.isActivo());
        System.out.println("Peticiones: " + servicio1.getCantidadPeticiones());

        System.out.println("\n SERVICIO DETENIDO");
        servicio1.registrarPeticion();

        System.out.println("\nINICIAR SERVICIO");
        servicio1.iniciar();

        servicio1.registrarPeticion();
        servicio1.registrarPeticion();
        servicio1.registrarPeticion();

        System.out.println("\n ESTADO ACTUAL ");
        System.out.println("Activo: " + servicio1.isActivo());
        System.out.println("Peticiones: " + servicio1.getCantidadPeticiones());

        System.out.println("\nVALIDACION ");
        servicio1.setCantidadPeticiones(-5);

        System.out.println("Peticiones despues de validar: "
                + servicio1.getCantidadPeticiones());

        System.out.println("\nDETENER SERVICIO ");
        servicio1.detener();

        System.out.println("Activo: " + servicio1.isActivo());

    }
}
