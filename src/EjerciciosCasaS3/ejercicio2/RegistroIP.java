package EjerciciosCasaS3.ejercicio2;

public class RegistroIP {
    private String direccionIP;
    private String horaAcceso;
    private boolean permitida;

    public RegistroIP(String direccionIP, String horaAcceso,
                      boolean permitida){
        this.direccionIP=direccionIP;
        this.horaAcceso=horaAcceso;
        this.permitida=permitida;
    }
    //Getters
    public String getDireccionIP(){
        return direccionIP;
    }
    public String getHoraPAcceso(){
        return horaAcceso;
    }
    public boolean isPermitida(){
        return permitida;
    }
    //Setter
    public void setDirecionIP(String direccionIP){
        this.direccionIP=direccionIP;
    }
    public void setHoraAcceso(String horaAcceso){
        this.horaAcceso= horaAcceso;
    }
    public void setPermitida(boolean permitida){
        this.permitida=permitida;
    }
    public void mostrarEstado(){
        System.out.println("Direccion IP: "+direccionIP);
        System.out.println("Hora de acceso: "+horaAcceso);

        if(permitida){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso Denegado");
        }
    }
}
