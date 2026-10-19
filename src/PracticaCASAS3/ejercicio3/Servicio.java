package PracticaCASAS3.ejercicio3;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    //Getter
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
        }else{
            System.out.println("Error el nombre no puede estar vaicio");
        }
    }
    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: el puerto debe ser mayor que 0.");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: las peticiones no pueden ser negativas.");
        }
    }
    public void iniciar() {
        this.activo = true;
        System.out.println("Servicio iniciado.");
    }

    public void detener() {
        this.activo = false;
        System.out.println("Servicio detenido.");
    }
    public void registrarPeticion() {

        if (activo) {
            cantidadPeticiones++;
            System.out.println("Peticion registrada correctamente.");
        } else {
            System.out.println("No se puede registrar: el servicio esta detenido.");
        }
    }
}
