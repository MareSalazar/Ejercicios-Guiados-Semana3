package Programacion2P2.CASASemana7.ProyectoDesarrolladores;

public class Main {
    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("D01", "Ana", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D02", "Luis", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D03", "Sofía", "QA", 25);

        Proyecto proyecto = new Proyecto("Sistema de ventas");
        System.out.println(proyecto.mostrarEquipo());

        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        Desarrollador buscadoOk = proyecto.buscarDesarrollador("D02");
        Desarrollador buscadoNo = proyecto.buscarDesarrollador("D99");
        System.out.println("\nBuscar D02: " + (buscadoOk != null ? buscadoOk.mostrarInformacion() : "No encontrado"));
        System.out.println("Buscar D99: " + (buscadoNo != null ? buscadoNo.mostrarInformacion() : "No encontrado"));

        System.out.println("\nEliminar D02: " + proyecto.eliminarDesarrollador("D02"));
        System.out.println("Total horas asignadas: " + proyecto.calcularTotalHoras());

        Desarrollador mayorCarga = proyecto.obtenerMayorCarga();
        System.out.println("Mayor carga: " + (mayorCarga != null ? mayorCarga.mostrarInformacion() : "Ninguno"));
        System.out.println("\n" + proyecto.mostrarEquipo());
    }
}