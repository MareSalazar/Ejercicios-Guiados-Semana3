package Programacion2P2.CASASemana9.CatalogoProductos;

public class Main {
    public static void main(String[] args) {
        // Los productos existen antes de crear el catálogo.
        Producto teclado = new Producto("Teclado", 25.99);
        Producto mouse = new Producto("Mouse", 12.50);

        Catalogo catalogo = new Catalogo();
        System.out.println(catalogo.listarProductos());
        catalogo.agregarProducto(teclado);
        catalogo.agregarProducto(mouse);

        System.out.println("Productos del catálogo:");
        System.out.print(catalogo.listarProductos());
    }
}
