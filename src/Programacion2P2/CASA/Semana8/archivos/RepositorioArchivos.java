package Programacion2P2.CASA.Semana8.archivos;

import java.util.ArrayList;

// La guía pide agrupar objetos ya creados en un ArrayList<Archivo>.
public class RepositorioArchivos {
    private ArrayList<Archivo> archivos;

    public RepositorioArchivos() {
        archivos = new ArrayList<>();
    }

    public void agregarArchivo(Archivo elemento) {
        archivos.add(elemento);
    }

    // La guía pide listar desde la colección llamando al método de cada objeto.
    public String mostrarArchivos() {
        String listado = "";
        for (Archivo elemento : archivos) {
            listado += elemento.mostrarInformacion() + "\n";
        }
        return listado;
    }

    // La prueba de la guía pide sumar el resultado que devuelve cada subtipo.
    public double calcularTotalEspacioProcesado() {
        double total = 0.0;
        for (Archivo elemento : archivos) {
            total += elemento.calcularEspacioProcesado();
        }
        return total;
    }
}
