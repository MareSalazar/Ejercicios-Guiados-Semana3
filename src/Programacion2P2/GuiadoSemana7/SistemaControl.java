package Programacion2P2.GuiadoSemana7;

import java.util.ArrayList;

public class SistemaControl {
    private ArrayList<Sensor> sensores;

    public SistemaControl() {
        sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor sensor) {
        if (sensor != null) {
            sensores.add(sensor);
        }
    }

    public Sensor buscarSensor(String codigo) {
        for (Sensor s : sensores) {
            if (s.getCodigo().equals(codigo)) {
                return s;
            }
        }
        return null;
    }

    public boolean eliminarSensor(String codigo) {
        Sensor encontrado = buscarSensor(codigo);
        if (encontrado != null) {
            return sensores.remove(encontrado);
        }
        return false;
    }

    public double calcularPromedioLecturas() {
        if (sensores.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Sensor s : sensores) {
            suma += s.getLectura();
        }
        return suma / sensores.size();
    }

    public int contarSensoresActivos() {
        int activos = 0;
        for (Sensor s : sensores) {
            if (s.isActivo()) {
                activos++;
            }
        }
        return activos;
    }

    public String mostrarSensores() {
        if (sensores.isEmpty()) {
            return "Sistema sin sensores registrados.";
        }
        StringBuilder sb = new StringBuilder("=== Sensores en Sistema ===\n");
        for (Sensor s : sensores) {
            sb.append(s.mostrarInformacion()).append("\n");
        }
        return sb.toString().trim();
    }

    // Desafío adicional
    public Sensor obtenerMayorLectura() {
        if (sensores.isEmpty()) {
            return null;
        }
        Sensor mayor = sensores.get(0);
        for (Sensor s : sensores) {
            if (s.getLectura() > mayor.getLectura()) {
                mayor = s;
            }
        }
        return mayor;
    }
}
