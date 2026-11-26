package Programacion2P2.CASASemana9.SistemaCursos;

import java.util.ArrayList;

public class Curso {
    private final String nombre;
    private final ArrayList<Unidad> unidades;

    // Composición: el constructor recibe títulos y crea sus propias unidades.
    public Curso(String nombre, String... titulosUnidades) {
        this.nombre = nombre;
        this.unidades = new ArrayList<>();

        for (int i = 0; i < titulosUnidades.length; i++) {
            unidades.add(new Unidad(i + 1, titulosUnidades[i]));
        }
    }

    public String mostrarCurso() {
        StringBuilder detalle = new StringBuilder("Curso: ").append(nombre);
        for (Unidad unidad : unidades) {
            detalle.append(System.lineSeparator()).append(unidad);
        }
        return detalle.toString();
    }
}
