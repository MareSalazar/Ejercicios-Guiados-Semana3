package EjerciciosCasaS3.ejercicio3;

public class SistemaSeguridad {
    private String nombreSistema;
    private int intentosFallidos;

    //Constructor
    public SistemaSeguridad(String nombreSistema){
        this.nombreSistema=nombreSistema;
        this.intentosFallidos=0;
    }
    public void registrarIntentosFallidos(){
        intentosFallidos++;
    }
    public void reiniciarContador(){
        intentosFallidos=0;
    }
    public void mostrarEstado(){
        System.out.println("Sistema: "+ nombreSistema);
        System.out.println("Intentos Fallidos: "+intentosFallidos);

        if(intentosFallidos>=3){
            System.out.println("Estado: Sistema Bloqueado");
        }else{
            System.out.println("Estado: Sistema Disponible");
        }
    }
}
