package PracticaCASAS4.ejercicio1;

public class Main {
    public static void main(String[] args){
        System.out.println("Total inicial: "+ Usuario.getTotalUsuarios());

        Usuario usuario1 = new Usuario("mare", "mare@correo.com");
        Usuario usuario2 = new Usuario("ana", "ana@correo.com");
        Usuario usuario3 = new Usuario("juan", "juan@correo.com");
        Usuario usuario4 = new Usuario("sofia", "sofia@correo.com");

        System.out.println("Usuario 1: " +
                usuario1.getId() + " - " + usuario1.getUsername());

        System.out.println("Usuario 2: " +
                usuario2.getId() + " - " + usuario2.getUsername());

        System.out.println("Usuario 3: " +
                usuario3.getId() + " - " + usuario3.getUsername());

        System.out.println("Usuario 4: " +
                usuario4.getId() + " - " + usuario4.getUsername());

        System.out.println("Total de usuarios: " +
                Usuario.getTotalUsuarios());
    }
    }

