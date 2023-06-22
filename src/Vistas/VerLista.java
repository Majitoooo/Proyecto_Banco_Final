
package Vistas;

import Clases.Administrador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class VerLista extends javax.swing.JFrame {
    
    Administrador administrador = new Administrador("", "", "", "", "", "", "");

    
    Conexion con = new Conexion();
    Connection cn;
    
    // Variables de consulta
    Statement st;
    ResultSet rs;
    private DefaultTableModel model;
    

    public VerLista() {
        initComponents();
    }
    
       void mostrar()       {
        String query = "SELECT * FROM persona";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(query);
            //Los datos que devuelve el query, se almacenaran en un Object y posteriormente se mostraran en una tabla
            Object[] obj_banco = new Object[8];
            model = (DefaultTableModel) Visor.getModel();
            while (rs.next()) {
                obj_banco[0] = rs.getInt("cedula");
                obj_banco[1] = rs.getString("nombres");
                obj_banco[2] = rs.getString("apellidos");
                obj_banco[3] = rs.getString("direccion");
                obj_banco[4] = rs.getString("email");
                obj_banco[5] = rs.getString("celular");
                obj_banco[6] = rs.getString("contrasena");
                
                model.addRow(obj_banco);
            }
            Visor.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en la consulta");
        }
    }

  /*public void mostrar(String tabla) throws SQLException {
    String sql = "SELECT * FROM `persona`" + tabla;
    Conexion con = new Conexion();
    Connection cn = con.getConnection();  // Obtener la conexión desde la clase Conexion
    Statement st;
    ResultSet rs;
    System.out.println(sql);

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Cédula");
    model.addColumn("Nombres");
    model.addColumn("Apellidos");
    model.addColumn("Dirección");
    model.addColumn("Email");
    model.addColumn("Celular");
    model.addColumn("Contraseña");
    model.addColumn("Estado");
    Visor.setModel(model);

    String[] datos = new String[8];
    try {
        st = cn.createStatement();  
        rs = st.executeQuery(sql);
        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            model.addRow(datos);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error" + e.toString());
    }
}*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visor = new javax.swing.JTable();
        Dueños = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnInactivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Dirección", "Email", "Celular", "Contraseña", "", "Estado"
            }
        ));
        Visor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Visor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 920, 200));

        Dueños.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Dueños.setText("Presiona para ver la lista de Usuarios:");
        Dueños.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dueños.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Dueños.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Dueños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DueñosActionPerformed(evt);
            }
        });
        jPanel1.add(Dueños, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 500, 40));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, 120, 50));

        jLabel1.setText("Estado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel2.setText("Cédula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        txtEstado.setText("-");
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 240, 40));

        txtCedula.setText("-");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 240, 40));

        txtNombre.setText("-");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, 40));

        txtApellidos.setText("-");
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 240, 40));

        txtDireccion.setText("-");
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 240, 40));

        txtEmail.setText("-");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 240, 40));

        txtCelular.setText("-");
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 240, 40));

        txtContraseña.setText("-");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 240, 40));

        btnInactivar.setText("Inactivar");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DueñosActionPerformed

        mostrar();
        /* try {
        mostrar("Dueño");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }*/
        
    }//GEN-LAST:event_DueñosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String cedula = txtCedula.getText();
        String nombres = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String direccion = txtDireccion.getText();
        String email = txtEstado.getText();
        String celular = txtCelular.getText();
        String contrasena = txtContraseña.getText();
        String estado = txtEstado.getText();
        
        administrador.editarRegistro(cedula, nombres, apellidos, direccion, email, celular, contrasena, estado);
        
        
        
       /** int filaSeleccionada = Visor.getSelectedRow();
        
        if (filaSeleccionada >= 0) {
            String cedula = Visor.getValueAt(filaSeleccionada, 0).toString();
            String nombres = Visor.getValueAt(filaSeleccionada, 1).toString();
            String apellidos = Visor.getValueAt(filaSeleccionada, 2).toString();
            String direccion = Visor.getValueAt(filaSeleccionada, 3).toString();
            String email = Visor.getValueAt(filaSeleccionada, 4).toString();
            String celular = Visor.getValueAt(filaSeleccionada, 5).toString();
            String contrasena = Visor.getValueAt(filaSeleccionada, 6).toString();

            String sql = "UPDATE persona SET cedula = '"+ cedula +"', nombres = '" + nombres + "', apellidos = '"+ apellidos +"',  direccion = '" + direccion + "', email = '" + email + "', celular = '" + celular + "', contrasena = '" + contrasena + "' WHERE cedula = '" + cedula + "'";            
            
            Conexion con = new Conexion();
            Connection cn = con.getConnection();
            
            try{
            Statement st = cn.createStatement();
            int filasActualizadas = st.executeUpdate(sql);
                if (filasActualizadas == 1) {
                    JOptionPane.showMessageDialog(null, "Usuario modificado correctamente");   
                    
                    //mostrar("Dueño");

                }else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el usuario");
                }
            
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error al modificar el usuario: " + e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes seleccionar un usuario de la tabla");
        }**/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void VisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisorMouseClicked

        int row = Visor.getSelectedRow();
        System.out.println(row);
        
        if(row < 0){
            JOptionPane.showMessageDialog(this, "No has seleccionado un registro de la tabla");
        }else{            
            String cedula = Visor.getValueAt(row, 0).toString();
            String nombres = Visor.getValueAt(row, 1).toString();
            String apellidos = Visor.getValueAt(row, 2).toString();
            String direccion = Visor.getValueAt(row, 3).toString();
            String email = Visor.getValueAt(row, 4).toString();
            String celular = Visor.getValueAt(row, 5).toString();
            String contraseña = Visor.getValueAt(row,6).toString();
            String estado = Visor.getValueAt(row, 2).toString();


                        
            System.out.println( "-" + nombres + "-" + cedula);
            txtCedula.setText(cedula);
            txtNombre.setText(nombres);
            txtApellidos.setText(apellidos);
            txtDireccion.setText(direccion);
            txtEmail.setText(email);
            txtCelular.setText(celular);
            txtContraseña.setText(contraseña);
            txtEstado.setText(estado);
             
            //txtNombres.setText(nombres);
            //txtCedula.setText(cedula);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_VisorMouseClicked

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
    eliminar_Favorito();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnInactivarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerLista().setVisible(true);
            }
        });
    }
    
    void eliminar_Favorito() {
    int rowFavorito = Visor.getSelectedRow();
    if (rowFavorito < 0) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar el registro que deseas eliminar");
    } else {
        Conexion con = new Conexion();
        Connection connection = null;
        PreparedStatement statement = null;
        
        String cedula = txtCedula.getText();
        
        try {
            connection = con.getConnection();
            String consulta = "DELETE FROM persona WHERE cedula = ?";
            
            statement = connection.prepareStatement(consulta);
            statement.setString(1, cedula);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(this, "El registro se ha eliminado con Exito");
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR: El registro no se pudo eliminar\n" + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Dueños;
    public javax.swing.JTable Visor;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
