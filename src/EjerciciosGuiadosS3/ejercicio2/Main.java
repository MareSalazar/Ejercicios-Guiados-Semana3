package EjerciciosGuiadosS3.ejercicio2;

public class Main {
    public static void main(String[] args){

        System.out.println("Total inicial: "+
                DispositivoConstructores.getTotalCreados());

        DispositivoConstructores dispositivo1= new DispositivoConstructores(
                "Laptop", "Computadora");

        System.out.println("Despues de uno: " +
                DispositivoConstructores.getTotalCreados());

        DispositivoConstructores dispositivo2= new DispositivoConstructores(
                "Celular", "Movil");

        DispositivoConstructores dispositivo3= new DispositivoConstructores(
                "Tablet", "Tablet");

        System.out.println("Despues de tres: " +
                DispositivoConstructores.getTotalCreados());

        //Mostrar todos los datos
        System.out.println("\nDispositivo 1:");
        System.out.println("ID:"+ dispositivo1.getId());
        System.out.println("Nombre:"+ dispositivo1.getNombre());
        System.out.println("Tipo: " + dispositivo1.getTipo());

        System.out.println("\nDispositivo 2 ");
        System.out.println("ID: " + dispositivo2.getId());
        System.out.println("Nombre: " + dispositivo2.getNombre());
        System.out.println("Tipo: " + dispositivo2.getTipo());

        System.out.println("\nDispositivo 3 ");
        System.out.println("ID: " + dispositivo3.getId());
        System.out.println("Nombre: " + dispositivo3.getNombre());
        System.out.println("Tipo: " + dispositivo3.getTipo());
    }
}
