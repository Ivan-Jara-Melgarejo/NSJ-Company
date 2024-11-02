package vista;

import ConexionBD.Conexion;
import Controlador.ControladorProveedores;
import Modelo.Proveedores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;

public class VentanaProveedores extends javax.swing.JDialog {

    public VentanaProveedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txt_id.setEditable(false);
        actualizarTabla();
        btn_actualizar.setVisible(false);
        btn_eliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proveedores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        volverAMenu = new javax.swing.JButton();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTOR PROVEEDORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 320, 50));

        tabla_proveedores.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 680, 410));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIRECCION:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 35));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE EMPRESA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N. TELEFONO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 35));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CORREO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, 35));

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 193, 35));

        txt_direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 193, 35));

        txt_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 193, 35));

        txt_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 193, 35));

        btn_actualizar.setBackground(new java.awt.Color(51, 153, 0));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("ACTUALIZAR DATOS");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 250, 50));

        btn_agregar.setBackground(new java.awt.Color(0, 51, 255));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR PROVEEDOR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 250, 50));

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_limpiar.setText("LIMPIAR DATOS");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 250, 50));

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 643, 200, 45));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID PROVEEDOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 645, 160, 45));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 646, 150, 45));

        volverAMenu.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        volverAMenu.setText("Ir a Menu");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(volverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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
        Proveedores proveedor = new Proveedores();
        ControladorProveedores ctrlProveedor = new ControladorProveedores();

        //en este condicional estamos viendo que todas las casillas esten llenas
        if (txt_nombre.getText().equals("") || txt_direccion.getText().equals("") || txt_telefono.getText().equals("") || txt_correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");
        } else {
            //en este condicional estamos viendo que en la caja de texto Email lleve @
            if (ctrlProveedor.comprobarEmail(txt_correo.getText())) {

                proveedor.setNombreEmpresa(txt_nombre.getText());
                proveedor.setDireccion(txt_direccion.getText());
                proveedor.setNumeroTelefono(Integer.parseInt(txt_telefono.getText()));
                proveedor.setCorreo(txt_correo.getText());
                if (ctrlProveedor.insertar(proveedor)) {
                    JOptionPane.showMessageDialog(null, "Registro Correcto");
                    actualizarTabla();
                    limpiarCajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar el Usuario");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El correo no es Correcto");
            }

        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiarCajas();
        btn_actualizar.setVisible(false);
        btn_eliminar.setVisible(false);
        btn_agregar.setVisible(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        Proveedores proveedor = new Proveedores();
        ControladorProveedores ctrlProveedor = new ControladorProveedores();

        proveedor.setNombreEmpresa(txt_nombre.getText());
        proveedor.setDireccion(txt_direccion.getText());
        proveedor.setNumeroTelefono(Integer.parseInt(txt_telefono.getText()));
        proveedor.setCorreo(txt_correo.getText());
        proveedor.setIdEmpresa(Integer.parseInt(txt_id.getText()));
        
        if (ctrlProveedor.modificar(proveedor)) {
            JOptionPane.showMessageDialog(null, "Registro Correcto");
            actualizarTabla();
            limpiarCajas();
            btn_actualizar.setVisible(false);
            btn_eliminar.setVisible(false);
            btn_agregar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Registro InCorrecto");
            actualizarTabla();
            limpiarCajas();
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void tabla_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proveedoresMouseClicked
        PreparedStatement ps = null; //hacer la consulta a la base de Datos
        ResultSet rs = null;// Obtener el resultado de la busqueda de la consulta

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            int fila = tabla_proveedores.getSelectedRow();
            String codigo = tabla_proveedores.getValueAt(fila, 0).toString();

            ps = conexion.prepareStatement("select idProveedores,nombre,direccion,numero,correo from proveedores where nombre=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                txt_id.setText(String.valueOf(rs.getInt("idProveedores")));
                txt_nombre.setText(rs.getString("nombre"));
                txt_direccion.setText(rs.getString("direccion"));
                txt_telefono.setText(String.valueOf(rs.getInt("numero")));
                txt_correo.setText(rs.getString("correo"));
                txt_id.setText(String.valueOf(rs.getInt("idProveedores")));

            }
            btn_actualizar.setVisible(true);
            btn_eliminar.setVisible(true);
            btn_agregar.setVisible(false);
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_tabla_proveedoresMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Proveedores proveedor = new Proveedores();
        ControladorProveedores ctrlProveedor = new ControladorProveedores();

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        proveedor.setIdEmpresa(Integer.parseInt(txt_id.getText()));

        if (opcion == JOptionPane.YES_OPTION) {
            if (ctrlProveedor.eliminar(proveedor)) {
                JOptionPane.showMessageDialog(null, "Exitoso");
                btn_actualizar.setVisible(false);
                btn_eliminar.setVisible(false);
                btn_agregar.setVisible(true);
                actualizarTabla();
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
            }
        } else if (opcion == JOptionPane.NO_OPTION) {
            // El usuario seleccionó "No"
            JOptionPane.showMessageDialog(null, "Cancelado...");
        } else if (opcion == JOptionPane.CANCEL_OPTION) {
            // El usuario seleccionó "Cancelar"
            JOptionPane.showMessageDialog(null, "Cancelado...");
            limpiarCajas();
            btn_actualizar.setVisible(false);
            btn_eliminar.setVisible(false);
            btn_agregar.setVisible(true);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public void actualizarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla_proveedores.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            ps = conexion.prepareStatement("select nombre,direccion,numero,correo from proveedores");
            rs = ps.executeQuery();

            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Direccion");
            modeloTabla.addColumn("Numero");
            modeloTabla.addColumn("Correo");

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            //Con esto estamos cambiando el ancho de nuestras columnas
            int anchos[] = {20, 20, 20, 110};
            for (int i = 0; i < cantidadColumnas; i++) {
                tabla_proveedores.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    public void limpiarCajas() {
        txt_id.setText("");
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
    }

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
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaProveedores dialog = new VentanaProveedores(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_proveedores;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JButton volverAMenu;
    // End of variables declaration//GEN-END:variables
}
