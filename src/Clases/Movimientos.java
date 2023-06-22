import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BancoFintech {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String celular;
    private String direccion;
    private String email;

    public BancoFintech(String cedula, String nombres, String apellidos, String celular, String direccion, String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
    }

    // Métodos getter y setter para las variables

    public static void main(String[] args) {
        // Establecer la conexión con la base de datos
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Establecer la conexión con la base de datos
            String url = "jdbc:mysql://localhost:3306/nombre_base_datos";
            String username = "nombre_usuario";
            String password = "contraseña_usuario";
            connection = DriverManager.getConnection(url, username, password);

            // Ejemplo de inserción de datos en la base de datos
            String query = "INSERT INTO personas (cedula, nombres, apellidos, celular, direccion, email) VALUES (?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, cedula);
            statement.setString(2, nombres);
            statement.setString(3, apellidos);
            statement.setString(4, celular);
            statement.setString(5, direccion);
            statement.setString(6, email);
            statement.executeUpdate();

            System.out.println("Datos insertados correctamente.");

            // Ejemplo de consulta de datos desde la base de datos
            query = "SELECT * FROM personas";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String cedula = resultSet.getString("cedula");
                String nombres = resultSet.getString("nombres");
                String apellidos = resultSet.getString("apellidos");
                String celular = resultSet.getString("celular");
                String direccion = resultSet.getString("direccion");
                String email = resultSet.getString("email");

                System.out.println("Cédula: " + cedula);
                System.out.println("Nombres: " + nombres);
                System.out.println("Apellidos: " + apellidos);
                System.out.println("Celular: " + celular);
                System.out.println("Dirección: " + direccion);
                System.out.println("Email: " + email);
                System.out.println("-------------------------");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}