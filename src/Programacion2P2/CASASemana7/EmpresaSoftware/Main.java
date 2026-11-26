package Programacion2P2.CASASemana7.EmpresaSoftware;

public class Main {
    public static void main(String[] args) {
        // 1. Crear 4 proyectos antes de agregarlos
        Proyecto p1 = new Proyecto("P-01", "Sistema de Facturación", 18000.0);
        Proyecto p2 = new Proyecto("P-02", "App de Reparto", 35000.0);
        Proyecto p3 = new Proyecto("P-03", "Portal Académico", 22500.0);
        Proyecto p4 = new Proyecto("P-04", "Dashboard de Métricas", 29000.0);

        EmpresaSoftware empresa = new EmpresaSoftware("QuitoTech");

        // 2. Agregar proyectos
        empresa.agregarProyecto(p1);
        empresa.agregarProyecto(p2);
        empresa.agregarProyecto(p3);
        empresa.agregarProyecto(p4);

        // 3. Buscar
        System.out.println("Buscar P-02: " + empresa.buscarProyecto("P-02"));

        // 4. Presupuesto total y desafío (mayor presupuesto)
        System.out.printf("Presupuesto total: $%.2f%n", empresa.calcularPresupuestoTotal());
        System.out.println("Mayor presupuesto: " + empresa.obtenerProyectoMayorPresupuesto());

        // 5. Eliminar y mostrar
        empresa.eliminarProyecto("P-03");
        empresa.mostrarProyectos();
    }
}
