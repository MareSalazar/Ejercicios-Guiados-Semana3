package Programacion2P2.CASASemana9.CatalogoProductos;

public class Producto {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("%s | $%.2f", nombre, precio);
    }
}
