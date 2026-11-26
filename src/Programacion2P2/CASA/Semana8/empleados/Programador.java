package Programacion2P2.CASA.Semana8.empleados;

// Subtipo de Empleado solicitado en la guía.
public class Programador extends Empleado {
    public Programador(String identificacion, String nombre, double salarioBase) {
        // super inicializa los atributos comunes que pide la guía.
        super(identificacion, nombre, salarioBase);
    }

    // Sobrescribe el cálculo con la regla de ejemplo de este tipo.
    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15;
    }

    // La guía pide una descripción propia. Conservamos la información del padre.
    @Override
    public String mostrarInformacion() {
        return "Programador | " + super.mostrarInformacion()
                + String.format(" | Bono: USD %.2f", calcularBono());
    }
}
