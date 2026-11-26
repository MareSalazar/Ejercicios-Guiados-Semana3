package Programacion2P2.CASASemana7.ProyectoDesarrolladores;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador desarrollador) {
        if (desarrollador != null) {
            desarrolladores.add(desarrollador);
        }
    }

    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador encontrado = buscarDesarrollador(identificacion);
        if (encontrado != null) {
            return desarrolladores.remove(encontrado);
        }
        return false;
    }

    public double calcularTotalHoras() {
        double total = 0.0;
        for (Desarrollador d : desarrolladores) {
            total += d.getHorasAsignadas();
        }
        return total;
    }

    public String mostrarEquipo() {
        if (desarrolladores.isEmpty()) {
            return "Proyecto '" + nombre + "' sin desarrolladores asignados.";
        }
        StringBuilder sb = new StringBuilder("=== Equipo de " + nombre + " ===\n");
        for (Desarrollador d : desarrolladores) {
            sb.append(d.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }

    // Desafío adicional
    public Desarrollador obtenerMayorCarga() {
        if (desarrolladores.isEmpty()) {
            return null;
        }
        Desarrollador mayor = desarrolladores.get(0);
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasAsignadas() > mayor.getHorasAsignadas()) {
                mayor = d;
            }
        }
        return mayor;
    }
}