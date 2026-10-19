package EjerciciosGuiadosS3.ejercicio1;

public class Dispositivo {

   //Pasamos a privados
    private String nombre;
    private String tipo;
    private boolean activo;

    // Setter nombre y validacion
    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio");
        }
    }

    // Getter nombre
    public String getNombre() {
        return nombre;
    }

    // Setter tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter tipo
    public String getTipo() {
        return tipo;
    }

    // Setter Estado
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Getter del estado
    public boolean isActivo() {
        return activo;
    }

    // Desafio: ACTIVAR
    public void activar() {
        this.activo = true;
        System.out.println("Dispositivo activado");
    }

    // Desafio: Desactivar
    public void desactivar() {
        this.activo = false;
        System.out.println("Dispositivo desactivado");
    }
}
