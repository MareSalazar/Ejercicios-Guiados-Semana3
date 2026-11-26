package Programacion2P2.CASASemana7.EmpresaSoftware;

public class Proyecto {
    private String codigo;
    private String nombre;
    private double presupuesto;

    public Proyecto(String codigo, String nombre, double presupuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - Presupuesto: $%.2f", codigo, nombre, presupuesto);
    }
}