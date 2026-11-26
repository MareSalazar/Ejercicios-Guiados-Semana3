package Programacion2P2.GuiadoSemana9;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("D001", "Lenovo", true, 16);
        CamaraSeguridad camara = new CamaraSeguridad("D002", "Hikvision", true, "1080p");
        CamaraSeguridad camaraApagada = new CamaraSeguridad("D003", "Dahua", false, "720p");

        // Paso 5: una colección del tipo padre recibe objetos de ambos subtipos.
        ArrayList<Dispositivos> dispositivos = new ArrayList<>();
        dispositivos.add(computadora);
        dispositivos.add(camara);
        dispositivos.add(camaraApagada);

        // La variable es Dispositivo. El metodo ejecutado depende del objeto real.
        for (Dispositivos dispositivo : dispositivos) {
            System.out.println(dispositivo.mostrarInformacion());
        }

        // Usamos las referencias de cada hija para llamar a sus métodos propios.
        System.out.println(computadora.ejecutarPrograma("IntelliJ IDEA"));
        System.out.println(camara.grabarVideo());
        System.out.println(camaraApagada.grabarVideo());
    }
}