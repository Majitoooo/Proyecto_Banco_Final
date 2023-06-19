package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection connection;
    
    public Conexion(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdfintech", "root", "");
        if (connection != null){
            System.out.println("Se ha establecido conexion con la BD");
        }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudo establecer conexion con la BD");
        }
        }
    public Connection getConnection(){
        return connection;
    }
    
}
