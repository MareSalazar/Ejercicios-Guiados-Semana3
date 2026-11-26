package Programacion2P2.CASA.Semana8.empleados;

// Punto de entrada. Crea los objetos y demuestra el funcionamiento.
public class Main {
    public static void main(String[] args) {
        // La guía pide crear los objetos fuera de la colección.
        // Mismo salario base para comparar el efecto de cada porcentaje de bono.
        Empleado programador = new Programador("E01", "Ana", 1000.0);
        Empleado tester = new Tester("E02", "Luis", 1000.0);
        Empleado disenador = new Disenador("E03", "Carla", 1000.0);

        EmpresaSoftware empresa = new EmpresaSoftware();
        // El administrador del ejercicio recibe objetos ya creados.
        empresa.agregarEmpleado(programador);
        empresa.agregarEmpleado(tester);
        empresa.agregarEmpleado(disenador);

        // Pruebas mínimas de la guía. Solo Main imprime los resultados.
        System.out.print(empresa.mostrarEmpleados());
        System.out.printf("Total de bonos: USD %.2f%n", empresa.calcularTotalBonos()); // 370

        // Desafío de la guía. Usa el nuevo subtipo con la misma colección.
        empresa.agregarEmpleado(new ArquitectoSoftware("E04", "Pablo", 1000.0));
        System.out.print(empresa.mostrarEmpleados());
        System.out.printf("Nuevo total: USD %.2f%n", empresa.calcularTotalBonos()); // 570
    }
}
