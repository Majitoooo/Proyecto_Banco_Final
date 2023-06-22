package Clases;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Administrador extends Persona {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    String estado;

    public Administrador(String cedula, String nombres, String apellidos, String direccion, String email, String celular, String contrasena) {
        super(cedula, nombres, apellidos, direccion, email, celular, contrasena);
    }
    
    public void editarRegistro(String cedula, String nombres, String apellidos, String direccion, String email, String celular, String contrasena, String estado){
        if (cedula.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || direccion.isEmpty() || email.isEmpty() || celular.isEmpty() || contrasena.isEmpty() || estado.isEmpty()) {
            System.out.println("Hay campos requeridos que faltan por diligenciar");
        } else {
            //String consulta = "UPDATE personas SET cedula = '" + cedula + "', nombres = '" + nombres + "', apellidos = '" + apellidos + "', direccion = '" + direccion + "', email = '" + email + "', celular = '" + celular + "', contrasena = '" + contrasena + "', estado = '" + estado + "' WHERE cedula = '" + cedula + "'";
             try {
                 
                // Establecer la conexión con la base de datos
                Connection connection = con.getConnection();

                // Actualizar el saldo en la tabla 'cuenta'
                String sql = "UPDATE persona SET cedula =  ?, nombres = ?, apellidos = ?, direccion = ?, email = ?, celular = ?, contrasena = ? WHERE cedula = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, cedula);
                statement.setString(2, nombres);
                statement.setString(3, apellidos);
                statement.setString(4, direccion);
                statement.setString(5, email);
                statement.setString(6, celular);
                statement.setString(7, contrasena);
                statement.setString(8, cedula);
                
                System.out.println("Se guardo el registro");
                
                statement.executeUpdate();
                /*cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(consulta);
                System.out.println("El registro se ha modificado con éxito");*/
            } catch (SQLException e) {
                System.out.println("Error al editar el registro: " + e.getMessage());
            } 
        }
    }
    
    
}
