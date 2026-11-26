package Programacion2P2.GuiadoSemana7;

public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor("S01", "Temperatura", 24.5, true);
        Sensor s2 = new Sensor("S02", "Presión", 1.8, true);
        Sensor s3 = new Sensor("S03", "Caudal", 12.4, false);
        Sensor s4 = new Sensor("S04", "Humedad", 65.0, true);

        SistemaControl sistema = new SistemaControl();
        System.out.println(sistema.mostrarSensores());

        sistema.agregarSensor(s1);
        sistema.agregarSensor(s2);
        sistema.agregarSensor(s3);
        sistema.agregarSensor(s4);

        Sensor bOk = sistema.buscarSensor("S03");
        Sensor bNo = sistema.buscarSensor("S99");
        System.out.println("\nBuscar S03: " + (bOk != null ? bOk.mostrarInformacion() : "No existe"));
        System.out.println("Buscar S99: " + (bNo != null ? bNo.mostrarInformacion() : "No existe"));

        System.out.println("\nEliminar S02: " + sistema.eliminarSensor("S02"));
        System.out.println("Eliminar S99: " + sistema.eliminarSensor("S99"));

        System.out.printf("Promedio lecturas: %.2f%n", sistema.calcularPromedioLecturas());
        System.out.println("Sensores activos: " + sistema.contarSensoresActivos());

        Sensor mayor = sistema.obtenerMayorLectura();
        System.out.println("Mayor lectura: " + (mayor != null ? mayor.mostrarInformacion() : "Ninguno"));
        System.out.println("\n" + sistema.mostrarSensores());
    }
}
