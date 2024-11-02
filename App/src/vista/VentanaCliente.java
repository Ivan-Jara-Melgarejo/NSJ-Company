package vista;

import java.sql.SQLIntegrityConstraintViolationException;
import ConexionBD.Conexion;
import Controlador.ControladorCliente;
import Controlador.FormatearRut;
import Modelo.Cliente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaCliente extends javax.swing.JDialog {

    public static Conexion conexion = new Conexion();
    ControladorCliente con_cliente = new ControladorCliente();

    public VentanaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btn_actualizar.setVisible(false);
        btn_eliminar.setVisible(false);
        txt_id.setEditable(false);
        setLocationRelativeTo(null);
        cargarTabla();
        txt_rut.addKeyListener(new FormatearRut(txt_rut));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_rut = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        volverAMenu = new javax.swing.JButton();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_clientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 69, 722, 470));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("RUT:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 101, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("NOMBRE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 101, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("N. TELEFONO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 182, 140, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("DIRECCION:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 266, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("CORREO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 224, 101, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("APELLIDO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 101, 30));

        btn_agregar.setBackground(new java.awt.Color(0, 204, 0));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR CLIENTE");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 348, 220, 50));

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, 30));

        txt_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, 30));

        txt_rut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, 30));

        txt_direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 189, 30));

        txt_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 189, 32));

        txt_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 189, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 51, 204));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("ACTUALIZAR DATOS");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 416, 220, 50));

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_limpiar.setText("LIMPIAR DATOS");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 484, 220, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 109, 350, 550));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GESTOR CLIENTES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 370, 49));

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR CLIENTE");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 680, 220, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID CLIENTE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 689, 160, 35));

        txt_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 687, 200, 40));

        volverAMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        volverAMenu.setText("ir a Menu");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(volverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_clientes.jpg"))); // NOI18N
        jPanel1.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAMenuActionPerformed
        dispose();
    }//GEN-LAST:event_volverAMenuActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String rut = txt_rut.getText();

        if (txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_rut.getText().equals("") || txt_telefono.getText().equals("") || txt_correo.getText().equals("") || txt_direccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");
        } else {
            if (con_cliente.validarRUT(rut)) {

                String nombre = txt_nombre.getText();
                String apellido = txt_apellido.getText();
                int telefono = Integer.parseInt(txt_telefono.getText());
                String correo = txt_correo.getText();
                String direccion = txt_direccion.getText();

                Cliente cliente = new Cliente(nombre, apellido, rut, telefono, correo, direccion);

                try {
                    con_cliente.insertar(cliente);
                    limpiar();
                    cargarTabla();
                } catch (SQLIntegrityConstraintViolationException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: RUT DUPLICADO", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaCliente.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "HAY UN ERROR", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN RUT VALIDO");
                cargarTabla();
            }
            cargarTabla();
        }

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String nombre, apellido, rut, correo, direccion;
        int telefono, id;

        nombre = txt_nombre.getText();
        apellido = txt_apellido.getText();
        rut = txt_rut.getText();
        telefono = Integer.parseInt(txt_telefono.getText());
        correo = txt_correo.getText();
        direccion = txt_direccion.getText();
        id = Integer.parseInt(txt_id.getText());

        Cliente cliente = new Cliente(id, nombre, apellido, rut, telefono, correo, direccion);
        ControladorCliente con_cliente = new ControladorCliente();
        con_cliente.modificar(cliente);

        limpiar();
        cargarTabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int valor;

        valor = Integer.parseInt(txt_id.getText());
        ControladorCliente eliminar = new ControladorCliente();
        Cliente eliminarCliente = new Cliente(valor);
        if (eliminar.eliminar(eliminarCliente)) {
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
        }


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked
        ResultSet rs = null;

        if (tabla_clientes.getSelectedRow() >= 0) {
            String registro = String.valueOf(tabla_clientes.getModel().getValueAt(tabla_clientes.getSelectedRow(), 0));

            try {
                Connection con = conexion.getconectar();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente Where idCliente=" + registro);
                rs = ps.executeQuery();
                btn_actualizar.setVisible(true);
                btn_eliminar.setVisible(true);
                btn_agregar.setVisible(false);

                if (rs.next()) {
                    txt_nombre.setText(rs.getString("nombre"));
                    txt_apellido.setText(rs.getString("apellido"));
                    txt_rut.setText(rs.getString("rut"));
                    txt_telefono.setText(rs.getString("telefono"));
                    txt_correo.setText(rs.getString("correo"));
                    txt_direccion.setText(rs.getString("direccion"));
                    txt_id.setText(rs.getString("idCliente"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR " + ex);
            }
        }
        cargarTabla();
    }//GEN-LAST:event_tabla_clientesMouseClicked

    public void limpiar() {
        btn_eliminar.setVisible(false);
        btn_agregar.setVisible(true);
        btn_actualizar.setVisible(false);
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_rut.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
        txt_direccion.setText("");
        txt_id.setText("");
    }

    public void cargarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla_clientes.setModel(modeloTabla);
        modeloTabla.addColumn("idCliente");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Rut");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Direccion");
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection con = conexion.getconectar();

            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente");
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCliente dialog = new VentanaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rut;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JButton volverAMenu;
    // End of variables declaration//GEN-END:variables
}
