package PracticaCASAS3.ejericicio1;

public class Username {

    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

        // GETTERS Y SETTERS
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            if ( !username.isEmpty()) {
                this.username = username;
            } else {
                System.out.println("Error: el username no puede estar vacio.");
            }
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            if (!correo.isEmpty()) {
                this.correo = correo;
            } else {
                System.out.println("Error: el correo no puede estar vacio.");
            }
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            if (nivel >= 0) {
                this.nivel = nivel;
            } else {
                System.out.println("Error: el nivel no puede ser negativo.");
            }
        }

        public boolean isActivo() {
            return activo;
        }

        public void setActivo(boolean activo) {
            this.activo = activo;
        }

        // Metodos cambiar estado
        public void activar() {
            this.activo = true;
        }

        public void desactivar() {
            this.activo = false;
        }
    }


