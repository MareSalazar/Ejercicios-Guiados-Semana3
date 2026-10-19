package PracticaCASAS4.ejercicio3;

public class Main {

    public static void main(String[] args) {

        System.out.println("ESTADO INICIAL ");
        System.out.println("Total: " + Servidor.getTotalServidores());
        System.out.println("Activos: " + Servidor.getServidoresActivos());

        Servidor servidor1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor servidor2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor servidor3 = new Servidor("ServidorBackup", "192.168.1.22");

        System.out.println("\n SERVIDORES CREADOS");
        System.out.println("Total: " + Servidor.getTotalServidores());
        System.out.println("Activos: " + Servidor.getServidoresActivos());

        System.out.println("Servidor 1: ID " + servidor1.getId()
                + " - " + servidor1.getNombre());
        System.out.println("Servidor 2: ID " + servidor2.getId()
                + " - " + servidor2.getNombre());
        System.out.println("Servidor 3: ID " + servidor3.getId()
                + " - " + servidor3.getNombre());

        // ACTIVAR DOS SERVIDORES
        System.out.println("\n ACTIVAR SERVIDORES ");
        servidor1.activar();
        servidor2.activar();

        System.out.println("Activos: " + Servidor.getServidoresActivos());

        System.out.println("\n ACTIVACION REPETIDA ");
        servidor1.activar();

        System.out.println("Activos: " + Servidor.getServidoresActivos());

        System.out.println("\nDESACTIVAR SERVIDOR 1 ");
        servidor1.desactivar();

        System.out.println("Activos: " + Servidor.getServidoresActivos());

        System.out.println("\nDESACTIVACION REPETIDA ");
        servidor1.desactivar();

        System.out.println("Activos: " + Servidor.getServidoresActivos());

        System.out.println("\nRESULTADO FINAL ");
        System.out.println("Total de servidores: "
                + Servidor.getTotalServidores());
        System.out.println("Servidores activos: "
                + Servidor.getServidoresActivos());

    }
}

