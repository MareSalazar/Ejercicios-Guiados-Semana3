package EjerciciosCasaS3.ejercicio1;

public class Main {
    public static void main(String[] args){
        Usuario usuario1= new Usuario();

        //Asignamos datos
        usuario1.setNombreUsuario("mare790");
        usuario1.setCorreo("mareact@gmail.com");

        //Intento con contrasena incorrecta
        usuario1.setContrasena("Mare12");

        //Intento con contrasena correcta
        usuario1.setContrasena("Mare1234");

        //Mostrar Datos
        System.out.println("Datos Usuario:\n");
        usuario1.mostrarDatos();

        //Verificar si la contrasena esta guardada
        System.out.println("Contrasena registrada: "
        +(usuario1.getContrasena()!=null));
    }
}
