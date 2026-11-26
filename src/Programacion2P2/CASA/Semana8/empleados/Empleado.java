package Programacion2P2.CASA.Semana8.empleados;

// SW-H1: guarda identificación, nombre y salario base en Empleado.
public class Empleado {
    private String identificacion;
    private String nombre;
    private double salarioBase;

    public Empleado(String identificacion, String nombre, double salarioBase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // El padre declara el método que cada rol sobrescribe.
    public double calcularBono() {
        return 0.0;
    }

    public String mostrarInformacion() {
        return "ID: " + identificacion + " | Nombre: " + nombre
                + String.format(" | Salario base: USD %.2f", salarioBase);
    }
}
