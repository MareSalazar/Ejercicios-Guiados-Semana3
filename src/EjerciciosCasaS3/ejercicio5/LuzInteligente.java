package EjerciciosCasaS3.ejercicio5;

public class LuzInteligente {

    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;

    //Constructor
    public LuzInteligente(String idLuz){
        this.idLuz= idLuz;
        this.nivelBrillo=0;
        this.encendida=false;
    }
    public void encender(){
        this.encendida=true;
    }
    public void apagar(){
        this.encendida=false;
    }
    public void ajustarBrillo(int nuevoNivel){
        if(!encendida){
            System.out.println("No se puede ajustar, la luz esta apagada");
        }else if(nuevoNivel>=0 && nuevoNivel<=100){
            this.nivelBrillo=nuevoNivel;
            System.out.println("Brillo ajustado a: "+ nivelBrillo+"%");
        }else{
            System.out.println("Error el brillo debe estar entre 0 y 100");
        }
    }
    public void mostrarEstado(){
        System.out.println("ID de luz: " + idLuz);
        System.out.println("Nivel de brillo: " + nivelBrillo + "%");

        if (encendida) {
            System.out.println("Estado: ENCENDIDA");
        } else {
            System.out.println("Estado: APAGADA");
        }    }
}
