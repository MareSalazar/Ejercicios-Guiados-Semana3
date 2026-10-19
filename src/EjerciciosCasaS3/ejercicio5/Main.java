package EjerciciosCasaS3.ejercicio5;

public class Main {
    public static void main(String[] args){
        LuzInteligente luzInteligente1= new LuzInteligente(
                "L001");
        LuzInteligente luzInteligente2= new LuzInteligente(
                "L002");
        System.out.println("----- ESTADO INICIAL -----");
        luzInteligente1.mostrarEstado();
        luzInteligente2.mostrarEstado();

        System.out.println("\n LUZ 1 ");
        luzInteligente1.encender();
        luzInteligente2.ajustarBrillo(60);
        luzInteligente1.mostrarEstado();

        System.out.println("Validacion");
        luzInteligente1.ajustarBrillo(120);
        luzInteligente1.mostrarEstado();

        System.out.println("\n LUZ 2 ");
        luzInteligente2.ajustarBrillo(50);
        luzInteligente2.apagar();
        luzInteligente2.mostrarEstado();

    }
}
