package Programacion2P2.CASA.Semana8.empleados;

import java.util.ArrayList;

// La guía pide agrupar objetos ya creados en un ArrayList<Empleado>.
public class EmpresaSoftware {
    private ArrayList<Empleado> empleados;

    public EmpresaSoftware() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado elemento) {
        empleados.add(elemento);
    }

    // La guía pide listar desde la colección llamando al método de cada objeto.
    public String mostrarEmpleados() {
        String listado = "";
        for (Empleado elemento : empleados) {
            listado += elemento.mostrarInformacion() + "\n";
        }
        return listado;
    }

    // La prueba de la guía pide sumar el resultado que devuelve cada subtipo.
    public double calcularTotalBonos() {
        double total = 0.0;
        for (Empleado elemento : empleados) {
            total += elemento.calcularBono();
        }
        return total;
    }
}
