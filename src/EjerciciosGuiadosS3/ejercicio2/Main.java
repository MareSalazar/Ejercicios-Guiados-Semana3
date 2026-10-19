package EjerciciosGuiadosS3.ejercicio2;

public class Main {
    public static void main(String[] args){

        System.out.println("Total inicial: "+ DispositivoConstructores.getTotalCreados());

        DispositivoConstructores dispositivo1= new DispositivoConstructores("Laptop", "Computadora");
        System.out.println("Despues de uno: " +
                DispositivoConstructores.getTotalCreados());
        DispositivoConstructores dispositivo2= new DispositivoConstructores(
                "Celular", "Movil");
        DispositivoConstructores dispositivo3= new DispositivoConstructores(
                "Tablet", "Tablet");
        System.out.println("Despues de tres: " +
                DispositivoConstructores.getTotalCreados());

    }
}
