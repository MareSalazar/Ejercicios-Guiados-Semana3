package PracticaCASAS3.ejericicio2;


public class Proyecto {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            this.terminado = (progreso == 100);
        } else {
            System.out.println("Error: el progreso debe estar entre 0 y 100.");
        }
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void avanzar(int porcentaje) {

        if (porcentaje > 0 && porcentaje <= 100 - progreso) {
            this.progreso += porcentaje;

            if (this.progreso == 100) {
                this.terminado = true;
            }

            System.out.println("Avance registrado: " + porcentaje + "%");

        } else {
            System.out.println("Error: avance invalido o supera el 100%.");
        }
    }
}
