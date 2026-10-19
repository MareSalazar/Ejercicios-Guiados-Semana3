package EjerciciosCasaS3.ejercicio1;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    //Metodos
    //Getter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }
    public String getContrasena(){
        return contrasena;
    }
    //Setter

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setCorreo(String correo){
        this.correo= correo;
    }
    public void setContrasena(String contrasena){
        if(contrasena !=null && contrasena.length()>=8){
            this.contrasena=contrasena;
        }else{
            System.out.println("Advertencia: La contraseña " +
                    "debe tener al menos 8 caracteres.");
        }
    }
    //Metodo
    public void mostrarDatos(){
        System.out.println("Nombre de usuario: "+ nombreUsuario);
        System.out.println("Correo: "+correo);
    }
}
