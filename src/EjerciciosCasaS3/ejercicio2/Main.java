package EjerciciosCasaS3.ejercicio2;

public class Main {
    public static void main (String[] args){

        RegistroIP registroIP1= new RegistroIP(
                "170.23/007", "08:30",
                true);

        RegistroIP registroIP2= new RegistroIP("123.07.08",
                "10:45", false);

        //Mostrar resultados
        System.out.println("Registro 1\n");
        registroIP1.mostrarEstado();
        System.out.println();
        System.out.println("Registro 2\n");
        registroIP2.mostrarEstado();

    }
}
