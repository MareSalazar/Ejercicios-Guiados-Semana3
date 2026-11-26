package Programacion2P2.CASASemana9.CatalogoProductos;

import java.util.ArrayList;

public class Catalogo {
    private final ArrayList<Producto> productos = new ArrayList<>();

    // Agregación: el catálogo recibe un producto creado fuera de él.
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public String listarProductos() {
        if (productos.isEmpty()) {
            return "El catálogo está vacío.";
        }

        StringBuilder listado = new StringBuilder();
        for (Producto producto : productos) {
            listado.append(producto).append(System.lineSeparator());
        }
        return listado.toString();
    }
}
