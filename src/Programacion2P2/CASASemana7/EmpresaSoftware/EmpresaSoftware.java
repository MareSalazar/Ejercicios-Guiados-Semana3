package Programacion2P2.CASASemana7.EmpresaSoftware;

import java.util.ArrayList;

public class EmpresaSoftware {
    private String nombre;
    private ArrayList<Proyecto> proyectos;

    public EmpresaSoftware(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            proyectos.add(proyecto);
        }
    }

    public boolean eliminarProyecto(String codigo) {
        Proyecto encontrado = buscarProyecto(codigo);
        if (encontrado != null) {
            return proyectos.remove(encontrado);
        }
        return false;
    }

    public Proyecto buscarProyecto(String codigo) {
        for (Proyecto p : proyectos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public double calcularPresupuestoTotal() {
        double total = 0.0;
        for (Proyecto p : proyectos) {
            total += p.getPresupuesto();
        }
        return total;
    }

    public void mostrarProyectos() {
        System.out.println("--- Proyectos de " + nombre + " ---");
        if (proyectos.isEmpty()) {
            System.out.println("No hay proyectos en la empresa.");
            return;
        }
        for (Proyecto p : proyectos) {
            System.out.println(p);
        }
    }

    // Desafío: retorna el proyecto de mayor presupuesto
    public Proyecto obtenerProyectoMayorPresupuesto() {
        if (proyectos.isEmpty()) {
            return null;
        }
        Proyecto mayor = proyectos.get(0);
        for (Proyecto p : proyectos) {
            if (p.getPresupuesto() > mayor.getPresupuesto()) {
                mayor = p;
            }
        }
        return mayor;
    }
}