package Programacion2P2.CASASemana9.SistemaCursos;

public class Main {
    public static void main(String[] args) {
        // Main entrega los títulos. Cada curso construye y guarda sus unidades.
        Curso curso = new Curso("Programación II",
                "Relaciones entre clases", "Colecciones", "Polimorfismo");

        System.out.println(curso.mostrarCurso());
    }
}
