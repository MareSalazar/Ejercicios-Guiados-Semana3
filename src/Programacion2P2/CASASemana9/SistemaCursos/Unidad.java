package Programacion2P2.CASASemana9.SistemaCursos;

public class Unidad {
    private final int numero;
    private final String titulo;

    Unidad(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Unidad " + numero + ": " + titulo;
    }
}
