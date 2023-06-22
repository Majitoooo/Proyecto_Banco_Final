package Clases;

public class Persona {
    
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String email;

    
    private String celular;
    private String contrasena; 
    
    public Persona(String cedula, String nombres, String apellidos, String direccion, String email, String celular, String contrasena) {
	this.cedula = cedula;
	this.nombres = nombres;
	this.apellidos = apellidos;
        this.direccion = direccion;
	this.email = email;
	this.celular = celular;
	this.contrasena = contrasena;
    }
    
        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

    
    
}
