package Programacion2P2.GuiadoSemana7;

public class Sensor {
    private String codigo;
    private String tipo;
    private double lectura;
    private boolean activo;

    public Sensor(String codigo, String tipo, double lectura, boolean activo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.lectura = lectura;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getLectura() {
        return lectura;
    }

    public boolean isActivo() {
        return activo;
    }

    public String mostrarInformacion() {
        String estado = activo ? "ACTIVO" : "INACTIVO";
        return String.format("[%s] %s | Lectura: %.2f | Estado: %s",
                codigo, tipo, lectura, estado);
    }
}
