package vista;

import ConexionBD.Conexion;
import Controlador.CifrarContraseña;
import Controlador.ControladorPersonal;
import Modelo.Personal;
import java.awt.Color;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

import java.util.Date;


public class VentanaPersonal extends javax.swing.JDialog {

    public VentanaPersonal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        actualizarTabla();
        cajaidPersona.setVisible(false);
        btn_eliminar.setVisible(false);
        btn_actualizar.setVisible(false);
        agregarRegister.setVisible(false);
    }
    
    public VentanaPersonal(){
        initComponents();
        volverAMenu.setText("Salir");
        volverAMenu.setBackground(Color.red);
        volverAMenu.setForeground(Color.white);
        setLocation(450, 10);
        cajaidPersona.setVisible(false);
        btn_eliminar.setVisible(false);
        btn_actualizar.setVisible(false);
        tablaPersonal.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        cajaSalario.setText("1");
        cajaSalario.setVisible(false);
        cajaCargo.setText("2");
        cajaCargo.setVisible(false);
        btn_agregar.setVisible(false);
        agregarRegister.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        casillaContraAntigua = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        CajaUsuario = new javax.swing.JTextField();
        cajaCorreo = new javax.swing.JTextField();
        cajaSalario = new javax.swing.JTextField();
        cajaCargo = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jlabel = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        volverAMenu = new javax.swing.JButton();
        casillaContraNueva = new javax.swing.JLabel();
        cajaContraseña = new javax.swing.JPasswordField();
        cajaConfirmarContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cajaNAtendedor = new javax.swing.JTextField();
        SeleccionarFechar = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cajaidPersona = new javax.swing.JTextField();
        agregarRegister = new javax.swing.JButton();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersonal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 29, 685, 370));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTOR PERSONAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, 45));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Usuario: </html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 40));

        casillaContraAntigua.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        casillaContraAntigua.setForeground(new java.awt.Color(255, 255, 255));
        casillaContraAntigua.setText("<html>Contraseña:</html>");
        jPanel1.add(casillaContraAntigua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CORREO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALARIO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CARGO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 85, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOMBRE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 30));

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 30));

        CajaUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(CajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 230, 30));

        cajaCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 230, 30));

        cajaSalario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 230, 30));

        cajaCargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 230, 30));

        btn_agregar.setBackground(new java.awt.Color(0, 153, 0));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR PERSONAL");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 260, 40));

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 0));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 615, 260, 40));

        btn_actualizar.setBackground(new java.awt.Color(0, 51, 204));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("ACTUALIZAR DATOS");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 260, 40));

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 260, 40));

        jlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("BUSCAR ID");
        jPanel1.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 100, 32));

        txt_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_idMouseClicked(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 618, 160, 40));

        volverAMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        volverAMenu.setText("Ir a Menu");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        jPanel1.add(volverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        casillaContraNueva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        casillaContraNueva.setForeground(new java.awt.Color(255, 255, 255));
        casillaContraNueva.setText("<html>Confirmar Contraseña:</html>");
        jPanel1.add(casillaContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 50));

        cajaContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 230, -1));

        cajaConfirmarContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 230, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° Atendedor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        cajaNAtendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cajaNAtendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, -1));

        SeleccionarFechar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(SeleccionarFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 230, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de Ingreso:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));
        jPanel1.add(cajaidPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 40, -1));

        agregarRegister.setBackground(new java.awt.Color(0, 204, 0));
        agregarRegister.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        agregarRegister.setForeground(new java.awt.Color(255, 255, 255));
        agregarRegister.setText("Registrar");
        agregarRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(agregarRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 260, 40));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_clientes.jpg"))); // NOI18N
        jPanel1.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 750));

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
        Personal personal = new Personal();
        ControladorPersonal ctlPersonal = new ControladorPersonal();

        String contraseña = new String(cajaContraseña.getPassword());
        String confirmarContraseña = new String(cajaConfirmarContraseña.getPassword());

        Date date = SeleccionarFechar.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);

        if (CajaUsuario.getText().equals("") || contraseña.equals("") || confirmarContraseña.equals("") || cajaNombre.getText().equals("") || cajaCorreo.getText().equals("") || cajaSalario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Porfavor rellene todos los campos");
        } else {
            if (contraseña.equals(confirmarContraseña)) {

                if (ctlPersonal.verificarUsuario(CajaUsuario.getText()) == 0) {

                    if (ctlPersonal.comprobarEmail(cajaCorreo.getText())) {
                        String nuevaContraseña = CifrarContraseña.md5(contraseña);
                        personal.setNAtendedor(Integer.parseInt(cajaNAtendedor.getText()));
                        personal.setNombreUsuario(CajaUsuario.getText());
                        personal.setContraseña(nuevaContraseña);
                        personal.setNombre(cajaNombre.getText());
                        personal.setCorreo(cajaCorreo.getText());
                        personal.setFechaIngreso(fecha);
                        personal.setIdTipo_usuario(Integer.parseInt(cajaCargo.getText()));
                        personal.setSalario(Double.parseDouble(cajaSalario.getText()));

                        if (ctlPersonal.registrar(personal)) {
                            JOptionPane.showMessageDialog(null, "Error al Registrar el Usuario");

                        } else {
                            JOptionPane.showMessageDialog(null, "Registro Correcto");
                            limpiarCajas();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo no es Correcto");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
        actualizarTabla();
        cajaContraseña.setVisible(true);
        casillaContraAntigua.setVisible(true);
        cajaNAtendedor.setEditable(true);

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMouseClicked
        JOptionPane.showMessageDialog(null, "!holi");
    }//GEN-LAST:event_txt_idMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiarCajas();
        btn_agregar.setVisible(true);
        casillaContraAntigua.setText("Contraseña");
        casillaContraNueva.setText("Confirmar Contraseña");
        cajaContraseña.setVisible(true);
        casillaContraAntigua.setVisible(true);
        cajaNAtendedor.setEditable(true);
        btn_eliminar.setVisible(false);
        btn_actualizar.setVisible(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void tablaPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonalMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        cajaNAtendedor.setEditable(false);
        cajaContraseña.setVisible(false);
        casillaContraAntigua.setVisible(false);
        btn_eliminar.setVisible(true);
        btn_actualizar.setVisible(true);
        casillaContraAntigua.setText("Contraseña Antigua");
        casillaContraNueva.setText("Contraseña nueva");

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            int fila = tablaPersonal.getSelectedRow();
            String codigo = tablaPersonal.getValueAt(fila, 0).toString();

            ps = conexion.prepareStatement("select id,nombreUsuario,NAtendedor,contraseña,nombre,correo,fecha_ingreso,idTipo_usuario,salario from personal where nombreUsuario=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                cajaidPersona.setText(String.valueOf(rs.getInt("id")));
                CajaUsuario.setText(rs.getString("nombreUsuario"));
                cajaNAtendedor.setText(String.valueOf(rs.getInt("NAtendedor")));
                cajaContraseña.setText(rs.getString("contraseña"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaCorreo.setText(rs.getString("correo"));
                SeleccionarFechar.setDate(rs.getDate("fecha_ingreso"));
                cajaCargo.setText(String.valueOf(rs.getInt("idTipo_usuario")));
                cajaSalario.setText(String.valueOf(rs.getDouble("salario")));
            }
            btn_agregar.setVisible(false);

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_tablaPersonalMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        casillaContraAntigua.setText("Contraseña");
        casillaContraNueva.setText("Confirmar Contraseña");

        actualizarTabla();
        PreparedStatement ps = null;

        Date date = SeleccionarFechar.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);

        String contraseña = new String(cajaContraseña.getPassword());
        String confirmarContraseña = new String(cajaConfirmarContraseña.getPassword());
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            if (confirmarContraseña.equals("")) {
                int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar sin cambiar la contraseña");
                String nuevaContraseña = CifrarContraseña.md5(confirmarContraseña);
                if (opcion == JOptionPane.YES_OPTION) {
                    ps = conexion.prepareStatement("update personal set nombreUsuario=?,NAtendedor=?,contraseña=?,nombre=?,correo=?,fecha_ingreso=?,salario=?,idTipo_usuario=? where id=?");
                    ps.setString(1, CajaUsuario.getText());
                    ps.setInt(2, Integer.parseInt(cajaNAtendedor.getText()));
                    ps.setString(3, nuevaContraseña);
                    ps.setString(4, cajaNombre.getText());
                    ps.setString(5, cajaCorreo.getText());
                    ps.setDate(6, fecha);
                    ps.setDouble(7, Double.parseDouble(cajaSalario.getText()));
                    ps.setInt(8, Integer.parseInt(cajaCargo.getText()));
                    ps.setInt(9, Integer.parseInt(cajaidPersona.getText()));
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente");
                    actualizarTabla();
                    cajaNAtendedor.setEditable(true);
                    btn_agregar.setVisible(true);
                    cajaContraseña.setVisible(true);
                    casillaContraAntigua.setVisible(true);
                    btn_eliminar.setVisible(false);
                    btn_actualizar.setVisible(false);
                    limpiarCajas();
                } else if (opcion == JOptionPane.NO_OPTION) {

                } else {
                    JOptionPane.showMessageDialog(null, "Cancelado");
                    limpiarCajas();
                    cajaNAtendedor.setEditable(true);

                }

            } else {
                String nuevaContraseña = CifrarContraseña.md5(confirmarContraseña);
                ps = conexion.prepareStatement("update personal set nombreUsuario=?,NAtendedor=?,contraseña=?,nombre=?,correo=?,fecha_ingreso=?,salario=?,idTipo_usuario=? where id=?");
                ps.setString(1, CajaUsuario.getText());
                ps.setInt(2, Integer.parseInt(cajaNAtendedor.getText()));
                ps.setString(3, nuevaContraseña);
                ps.setString(4, cajaNombre.getText());
                ps.setString(5, cajaCorreo.getText());
                ps.setDate(6, fecha);
                ps.setDouble(7, Double.parseDouble(cajaSalario.getText()));
                ps.setInt(8, Integer.parseInt(cajaCargo.getText()));
                ps.setInt(9, Integer.parseInt(cajaidPersona.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente");
                btn_agregar.setVisible(true);
                cajaContraseña.setVisible(true);
                casillaContraAntigua.setVisible(true);
                actualizarTabla();
                limpiarCajas();
                cajaNAtendedor.setEditable(true);
                btn_eliminar.setVisible(false);
                btn_actualizar.setVisible(false);
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }

    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        PreparedStatement ps = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            ps = conexion.prepareStatement("delete from personal where id=?");
            ps.setString(1, cajaidPersona.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se a elimado con Exito");
            actualizarTabla();
            limpiarCajas();
            cajaNAtendedor.setEditable(true);
            btn_eliminar.setVisible(false);
            btn_actualizar.setVisible(false);
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void agregarRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRegisterActionPerformed
        Personal personal = new Personal();
        ControladorPersonal ctlPersonal = new ControladorPersonal();

        String contraseña = new String(cajaContraseña.getPassword());
        String confirmarContraseña = new String(cajaConfirmarContraseña.getPassword());

        Date date = SeleccionarFechar.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);

        if (CajaUsuario.getText().equals("") || contraseña.equals("") || confirmarContraseña.equals("") || cajaNombre.getText().equals("") || cajaCorreo.getText().equals("") || cajaSalario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Porfavor rellene todos los campos");
        } else {
            if (contraseña.equals(confirmarContraseña)) {

                if (ctlPersonal.verificarUsuario(CajaUsuario.getText()) == 0) {

                    if (ctlPersonal.comprobarEmail(cajaCorreo.getText())) {
                        String nuevaContraseña = CifrarContraseña.md5(contraseña);
                        personal.setNAtendedor(Integer.parseInt(cajaNAtendedor.getText()));
                        personal.setNombreUsuario(CajaUsuario.getText());
                        personal.setContraseña(nuevaContraseña);
                        personal.setNombre(cajaNombre.getText());
                        personal.setCorreo(cajaCorreo.getText());
                        personal.setFechaIngreso(fecha);
                        personal.setIdTipo_usuario(Integer.parseInt(cajaCargo.getText()));
                        personal.setSalario(Double.parseDouble(cajaSalario.getText()));
                        
                        //inicialimzamos el login con el constructor sin parametros para enviar los datos registrados con el user
                        Login login = new Login(personal);
                        login.setVisible(true);
                        this.dispose();

                        if (ctlPersonal.registrar(personal)) {
                            JOptionPane.showMessageDialog(null, "Error al Registrar el Usuario");

                        } else {
                            JOptionPane.showMessageDialog(null, "Registro Correcto");
                            limpiarCajas();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo no es Correcto");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
        cajaContraseña.setVisible(true);
        casillaContraAntigua.setVisible(true);
        cajaNAtendedor.setEditable(true);
    }//GEN-LAST:event_agregarRegisterActionPerformed
//Limpiar las cajas

    private void limpiarCajas() {
        cajaNAtendedor.setText("");
        CajaUsuario.setText("");
        cajaContraseña.setText("");
        cajaConfirmarContraseña.setText("");
        cajaNombre.setText("");
        cajaCorreo.setText("");
        SeleccionarFechar.setDate(null);
        cajaSalario.setText("");
        cajaCargo.setText("");
        cajaNAtendedor.setEditable(true);
    }

    public void actualizarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaPersonal.setModel(modeloTabla);
        casillaContraAntigua.setText("Contraseña");
        casillaContraNueva.setText("Confirmar Contraseña");

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            ps = conexion.prepareStatement("select nombreUsuario,NAtendedor,nombre,correo,idTipo_usuario,salario from personal");
            rs = ps.executeQuery();

            modeloTabla.addColumn("Usuarios");
            modeloTabla.addColumn("N°");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Correo");
            modeloTabla.addColumn("Tipo Usuario");
            modeloTabla.addColumn("Sueldo");

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            int anchos[] = {30, 4, 80, 180, 20, 50};
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaPersonal.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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
            java.util.logging.Logger.getLogger(VentanaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPersonal dialog = new VentanaPersonal(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField CajaUsuario;
    private javax.swing.JLabel ImagenFondo;
    public com.toedter.calendar.JDateChooser SeleccionarFechar;
    private javax.swing.JButton agregarRegister;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    public javax.swing.JTextField cajaCargo;
    private javax.swing.JPasswordField cajaConfirmarContraseña;
    private javax.swing.JPasswordField cajaContraseña;
    public javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaNAtendedor;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaSalario;
    private javax.swing.JTextField cajaidPersona;
    private javax.swing.JLabel casillaContraAntigua;
    private javax.swing.JLabel casillaContraNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable tablaPersonal;
    private javax.swing.JTextField txt_id;
    private javax.swing.JButton volverAMenu;
    // End of variables declaration//GEN-END:variables
}
