package Programacion2P2.CASASemana7.SprintTareas;

public class Tarea {
    private String codigo;
    private String titulo;
    private double horas;
    private boolean completada;

    public Tarea(String codigo, String titulo, double horas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.horas = horas;
        this.completada = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getHoras() {
        return horas;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String estado = completada ? "COMPLETADA" : "PENDIENTE";
        return String.format("[%s] %s (%.1fh) [%s]", codigo, titulo, horas, estado);
    }
}