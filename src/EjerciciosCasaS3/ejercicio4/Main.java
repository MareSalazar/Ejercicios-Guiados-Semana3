package EjerciciosCasaS3.ejercicio4;

public class Main {
    public static void main(String[] args){
        SensorTemperatura sensorTemperatura1= new SensorTemperatura(
                "5001", 25.5,"C");

        SensorTemperatura sensorTemperatura2= new SensorTemperatura(
                "5002", 30.8, "C");

        System.out.println("Lectura Sensor 1\n");
        sensorTemperatura1.mostrarLectura();

        System.out.println("Lectura Sensor2\n");
        sensorTemperatura2.mostrarLectura();

        //modificar sensor
        sensorTemperatura1.setValorActual(27.2);

        System.out.println("Sensor 1 Actualizado");
        sensorTemperatura1.mostrarLectura();
    }
}
