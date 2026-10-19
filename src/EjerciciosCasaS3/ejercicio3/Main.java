package EjerciciosCasaS3.ejercicio3;

public class Main {
    public static void main(String[] args){
        SistemaSeguridad sistemaSeguridad1= new SistemaSeguridad(
                "Sistema Bancario");
        //Estado incial
        System.out.println("Estado Inicial:");
        sistemaSeguridad1.mostrarEstado();

        //Pimer intento Fallido
        sistemaSeguridad1.registrarIntentosFallidos();

        System.out.println("\nPrimer intento\n");
        sistemaSeguridad1.mostrarEstado();

        sistemaSeguridad1.registrarIntentosFallidos();

        System.out.println("\nSegundo intento\n");
        sistemaSeguridad1.mostrarEstado();

        sistemaSeguridad1.registrarIntentosFallidos();

        System.out.println("\nTercer intento\n");
        sistemaSeguridad1.mostrarEstado();
        // REINICIAR CONTADOR
        sistemaSeguridad1.reiniciarContador();

        System.out.println("\n----- CONTADOR REINICIADO -----");
        sistemaSeguridad1.mostrarEstado();
    }
}
