package Programacion2P2.CASASemana7.SprintTareas;

public class Main {
    public static void main(String[] args) {
        Sprint sprint1 = new Sprint("Sprint 1 - Módulo Auth");

        sprint1.crearTarea("T-01", "Diseñar login", 4.0);
        sprint1.crearTarea("T-02", "Configurar JWT", 6.5);
        sprint1.crearTarea("T-03", "Crear pruebas unitarias", 3.0);
        sprint1.crearTarea("T-04", "Documentar endpoints", 2.5);
        sprint1.crearTarea("T-05", "Revisar seguridad", 5.0);

        sprint1.crearTarea("T-01", "Tarea duplicada", 2.0);

        sprint1.completarTarea("T-01");
        sprint1.completarTarea("T-03");

        System.out.println("Buscar T-02: " + sprint1.buscarTarea("T-02"));
        System.out.println("Completadas: " + sprint1.contarCompletadas());
        System.out.println("Horas pendientes: " + sprint1.calcularHorasPendientes());
        sprint1.mostrarTareas();
    }
}