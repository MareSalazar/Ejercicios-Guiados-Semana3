package Programacion2P2.CASASemana7.SprintTareas;

import java.util.ArrayList;

public class Sprint {
    private String nombre;
    private ArrayList<Tarea> tareas;

    public Sprint(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public boolean crearTarea(String codigo, String titulo, double horas) {
        if (buscarTarea(codigo) != null) {
            System.out.println("Error: ya existe una tarea con el código " + codigo);
            return false;
        }
        tareas.add(new Tarea(codigo, titulo, horas));
        return true;
    }

    public boolean completarTarea(String codigo) {
        Tarea encontrada = buscarTarea(codigo);
        if (encontrada != null) {
            encontrada.completar();
            return true;
        }
        return false;
    }

    public Tarea buscarTarea(String codigo) {
        for (Tarea t : tareas) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                return t;
            }
        }
        return null;
    }

    public int contarCompletadas() {
        int contador = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularHorasPendientes() {
        double totalHoras = 0.0;
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                totalHoras += t.getHoras();
            }
        }
        return totalHoras;
    }

    public void mostrarTareas() {
        System.out.println("--- Tareas del Sprint: " + nombre + " ---");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Tarea t : tareas) {
            System.out.println(t);
        }
    }
}