/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author maria
 */
public class Administrador1 extends Persona{

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    String estado;    

    public Administrador1(String cedula, String nombres, String apellidos, String direccion, String email, String celular, String contrasena) {
        super(cedula, nombres, apellidos, direccion, email, celular, contrasena);
    }
    
    
}
