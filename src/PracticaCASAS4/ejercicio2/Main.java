package PracticaCASAS4.ejercicio2;

public class Main {
    public static void main(String[] args){
        System.out.println("Total inicial: " +
                Aplicacion.getTotalAplicaciones());

        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("Inventario", "2.1");
        Aplicacion app3 = new Aplicacion("Reservas", "1.5");

        System.out.println("\n APLICACIONES CREADAS ");

        System.out.println("App 1: " + app1.getId() +
                " - " + app1.getNombre() +
                " - Version: " + app1.getVersion());

        System.out.println("App 2: " + app2.getId() +
                " - " + app2.getNombre() +
                " - Version: " + app2.getVersion());

        System.out.println("App 3: " + app3.getId() +
                " - " + app3.getNombre() +
                " - Version: " + app3.getVersion());

        app1.iniciar();
        app2.iniciar();

        System.out.println("\nESTADO DE EJECUCION ");
        System.out.println("App 1 ejecutando: " + app1.isEjecutando());
        System.out.println("App 2 ejecutando: " + app2.isEjecutando());
        System.out.println("App 3 ejecutando: " + app3.isEjecutando());

        app1.cerrar();

        System.out.println("\n DESPUES DE CERRAR APP 1");
        System.out.println("App 1 ejecutando: " + app1.isEjecutando());

        System.out.println("\nTotal de aplicaciones: " +
                Aplicacion.getTotalAplicaciones());

    }

    }

