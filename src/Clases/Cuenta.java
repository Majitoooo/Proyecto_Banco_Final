package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cuenta extends Persona {
    
    Conexion con = new Conexion();
    Connection cn;
    
    // Variables de consulta
    Statement st;
    ResultSet rs;
    
    private int saldo;
    private String cedula;

    public Cuenta(int saldo, String cedula, String nombres, String apellidos, String direccion, String email, String celular, String contrasena){
        super(cedula, nombres, apellidos, direccion, email, celular, contrasena);
        this.saldo = saldo;
        this.cedula = cedula;
    }

}
