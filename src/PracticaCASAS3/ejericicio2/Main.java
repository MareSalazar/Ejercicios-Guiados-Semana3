package PracticaCASAS3.ejericicio2;

public class Main {

    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto();

        proyecto1.setNombre("Sistema de Reservas");
        proyecto1.setResponsable("Mare");
        proyecto1.setProgreso(40);

        System.out.println("ESTADO INICIAL ");
        System.out.println("Proyecto: " + proyecto1.getNombre());
        System.out.println("Responsable: " + proyecto1.getResponsable());
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");
        System.out.println("Terminado: " + proyecto1.isTerminado());

        // Avanza 30%
        System.out.println("\n PRIMER AVANCE");
        proyecto1.avanzar(30);
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");

        //Intenta avanzar 100
        System.out.println("\n AVANCE INVALIDO ");
        proyecto1.avanzar(50);
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");

        System.out.println("\n FINALIZAR PROYECTO ");
        proyecto1.avanzar(30);
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");
        System.out.println("Terminado: " + proyecto1.isTerminado());

    }
}

