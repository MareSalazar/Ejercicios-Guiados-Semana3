package Programacion2P2.CASA.Semana8.empleados;

// Desafío de la guía: incorpora ArquitectoSoftware.
public class ArquitectoSoftware extends Empleado {
    public ArquitectoSoftware(String identificacion, String nombre, double salarioBase) {
        // super inicializa los atributos comunes que pide la guía.
        super(identificacion, nombre, salarioBase);
    }

    // Sobrescribe el cálculo con la regla de ejemplo de este tipo.
    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.20;
    }

    // La guía pide una descripción propia. Conservamos la información del padre.
    @Override
    public String mostrarInformacion() {
        return "Arquitecto de software | " + super.mostrarInformacion()
                + String.format(" | Bono: USD %.2f", calcularBono());
    }
}
