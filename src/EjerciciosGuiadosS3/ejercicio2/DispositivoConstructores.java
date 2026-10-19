package EjerciciosGuiadosS3.ejercicio2;

public class DispositivoConstructores {
    private String nombre;
    private String tipo;
    private boolean activo;
    private int id;

    //Contador Compartido
    private static int contador = 0;

    // Constructor no declara tipo de retorno

    public DispositivoConstructores(String nombre, String tipo){
        this.nombre= nombre;
        this.tipo= tipo;
        this.activo= false;

        contador++;
        this.id=contador;
    }
    //Metodo Static
    public static int getTotalCreados(){
        return contador;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }
    public int getId(){
        return id;
    }
    //Setters

    public void setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre=nombre;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
