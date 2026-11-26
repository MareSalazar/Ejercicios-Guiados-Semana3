package Programacion2P2.CASA.Semana8.archivos;

// Punto de entrada. Crea los objetos y demuestra el funcionamiento.
public class Main {
    public static void main(String[] args) {
        // La guía pide crear los objetos fuera de la colección.
        // La guía pide probar dos archivos de cada subtipo.
        Archivo texto1 = new ArchivoTexto("notas.txt", 4.0);
        Archivo texto2 = new ArchivoTexto("reporte.txt", 8.0);
        Archivo imagen1 = new ArchivoImagen("perfil.png", 4.0);
        Archivo imagen2 = new ArchivoImagen("portada.jpg", 8.0);
        Archivo video1 = new ArchivoVideo("demo.mp4", 4.0);
        Archivo video2 = new ArchivoVideo("tutorial.mp4", 8.0);

        RepositorioArchivos repositorio = new RepositorioArchivos();
        // El administrador del ejercicio recibe objetos ya creados.
        repositorio.agregarArchivo(texto1);
        repositorio.agregarArchivo(texto2);
        repositorio.agregarArchivo(imagen1);
        repositorio.agregarArchivo(imagen2);
        repositorio.agregarArchivo(video1);
        repositorio.agregarArchivo(video2);

        // Pruebas mínimas de la guía. Solo Main imprime los resultados.
        System.out.print(repositorio.mostrarArchivos());
        System.out.printf("Total procesado: %.2f MB%n", repositorio.calcularTotalEspacioProcesado()); // 27

        // Desafío de la guía. Usa el nuevo subtipo con la misma colección.
        repositorio.agregarArchivo(new ArchivoAudio("entrevista.mp3", 10.0));
        System.out.print(repositorio.mostrarArchivos());
        System.out.printf("Nuevo total: %.2f MB%n", repositorio.calcularTotalEspacioProcesado()); // 33
    }
}
