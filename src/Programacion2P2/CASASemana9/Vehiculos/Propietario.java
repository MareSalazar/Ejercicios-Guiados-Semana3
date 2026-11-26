package Programacion2P2.CASASemana9.Vehiculos;

public class Propietario {
    private String nombre;
    private String documento;

    public Propietario(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + documento + ")";
    }
}
