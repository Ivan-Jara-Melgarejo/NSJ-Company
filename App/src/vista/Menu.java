
package vista;

import Modelo.Personal;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    Personal personal;
    
    
    public Menu() {
        initComponents();
    }
    
    public Menu(Personal personal){
        initComponents();
        setLocationRelativeTo(null);
        this.personal = personal;
        
        nombreDelAtendedor.setText(personal.getNombre());
        //numeroDelAtendedor.setText(personal.getUltima_sesion());
        numeroDelAtendedor.setText(String.valueOf(personal.getNAtendedor()));
        
        if(personal.getIdTipo_usuario() == 1){
            botonCuadrataje.setVisible(false);
        
        }
        else if(personal.getIdTipo_usuario() == 2){
            botonPersonal.setVisible(false);
            etiquetaPersonal.setVisible(false);
            botonInventario.setVisible(false);
            etiquetaInventario.setVisible(false);
            botonProveedores.setVisible(false);
            etiquetaProovedores.setText("Cuadrar Caja");
            //botonSalir.setBounds(460, 450, 230, 210);
            botonSalir.setLocation(460, 450);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonVentas = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonProveedores = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        etiquetaClientes = new javax.swing.JLabel();
        botonPersonal = new javax.swing.JButton();
        botonInventario = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        etiquetaVentas = new javax.swing.JLabel();
        etiquetaInventario = new javax.swing.JLabel();
        etiquetaPersonal = new javax.swing.JLabel();
        etiquetaProovedores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreDelAtendedor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroDelAtendedor = new javax.swing.JLabel();
        botonCuadrataje = new javax.swing.JButton();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVentas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVentas (1).png"))); // NOI18N
        botonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentasActionPerformed(evt);
            }
        });
        panel.add(botonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 210));

        botonSalir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngwing.com (1).jpg"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panel.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 230, 210));

        botonProveedores.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonProveedores.png"))); // NOI18N
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });
        panel.add(botonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 230, 220));

        botonClientes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonClientes (1).png"))); // NOI18N
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });
        panel.add(botonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 230, 210));

        etiquetaClientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaClientes.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaClientes.setText("Clientes");
        panel.add(etiquetaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 80, 20));

        botonPersonal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPersonal (1).png"))); // NOI18N
        botonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonalActionPerformed(evt);
            }
        });
        panel.add(botonPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 230, 210));

        botonInventario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonIventario (1).jpg"))); // NOI18N
        botonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioActionPerformed(evt);
            }
        });
        panel.add(botonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 230, 210));

        Menu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");
        panel.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 151, 145));

        etiquetaVentas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaVentas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaVentas.setText("Ventas");
        panel.add(etiquetaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        etiquetaInventario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaInventario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaInventario.setText("Inventario");
        panel.add(etiquetaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, -1, -1));

        etiquetaPersonal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaPersonal.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPersonal.setText("Personal");
        panel.add(etiquetaPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, -1, -1));

        etiquetaProovedores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaProovedores.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaProovedores.setText("Proveedores");
        panel.add(etiquetaProovedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salir");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, -1, -1));

        nombreDelAtendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombreDelAtendedor.setForeground(new java.awt.Color(255, 255, 255));
        nombreDelAtendedor.setText("Nombre + Apellido");
        panel.add(nombreDelAtendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Atendedor:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N° Atendedor:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        numeroDelAtendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        numeroDelAtendedor.setForeground(new java.awt.Color(255, 255, 255));
        numeroDelAtendedor.setText("01");
        panel.add(numeroDelAtendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        botonCuadrataje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajaR (1).jpg"))); // NOI18N
        botonCuadrataje.setText("jButton1");
        botonCuadrataje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadratajeActionPerformed(evt);
            }
        });
        panel.add(botonCuadrataje, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 220, 210));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_clientes.jpg"))); // NOI18N
        panel.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioActionPerformed
        VentanaInventario ventanaIn = new VentanaInventario(this, true);
        ventanaIn.setVisible(true);
    }//GEN-LAST:event_botonInventarioActionPerformed

    private void botonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentasActionPerformed
        
        VentanaVentas ventana = new VentanaVentas(personal);
        ventana.setVisible(true);
    }//GEN-LAST:event_botonVentasActionPerformed

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        VentanaProveedores ventanaPro = new VentanaProveedores(this, true);
        ventanaPro.setVisible(true);
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
       VentanaCliente ventanaClie = new VentanaCliente(this, true);
       ventanaClie.setVisible(true);
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonalActionPerformed
        VentanaPersonal ventanaP = new VentanaPersonal(this, true);
        ventanaP.setVisible(true);
    }//GEN-LAST:event_botonPersonalActionPerformed

    private void botonCuadratajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadratajeActionPerformed
        CuadrarCaja cuadrarCaja = new CuadrarCaja(personal);
        cuadrarCaja.setVisible(true);
        //JOptionPane.showMessageDialog(null, "me presionaste");
    }//GEN-LAST:event_botonCuadratajeActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonCuadrataje;
    private javax.swing.JButton botonInventario;
    private javax.swing.JButton botonPersonal;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVentas;
    private javax.swing.JLabel etiquetaClientes;
    private javax.swing.JLabel etiquetaInventario;
    private javax.swing.JLabel etiquetaPersonal;
    private javax.swing.JLabel etiquetaProovedores;
    private javax.swing.JLabel etiquetaVentas;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nombreDelAtendedor;
    private javax.swing.JLabel numeroDelAtendedor;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
