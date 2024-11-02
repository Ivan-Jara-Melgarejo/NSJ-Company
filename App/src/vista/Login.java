
package vista;

import Controlador.CifrarContraseña;
import Controlador.ControladorPersonal;
import Modelo.Personal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Personal personal;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Login(Personal personal){
        initComponents();
        setLocationRelativeTo(null);
        this.personal = personal;
        
        cajaUsuario.setText(personal.getNombreUsuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        imagenUser = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 20, 100, 30));

        imagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel1.add(imagenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, 148));

        etiquetaUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setText("Usuario:");
        jPanel1.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        etiquetaContraseña.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContraseña.setText("Contraseña:");
        jPanel1.add(etiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 30));
        jPanel1.add(cajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 160, -1));

        btnIniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciar.setText("Iniciar Seccion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 180, 40));

        botonRegistro.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(0, 0, 0));
        botonRegistro.setText("Registrarse");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 110, 40));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Personal personal = new Personal();
        ControladorPersonal ctlPersonal = new ControladorPersonal();
        
        
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String contraseña = new String(cajaContraseña.getPassword());
        
        if(cajaUsuario.getText().equals("") || cajaContraseña.equals("")){
            JOptionPane.showMessageDialog(null, "Porfavor rellene los Campos");
        }
        else{
            String nuevaContraseña = CifrarContraseña.md5(contraseña);
            
            personal.setNombreUsuario(cajaUsuario.getText());
            personal.setContraseña(nuevaContraseña);
            personal.setUltima_sesion(fechaHora.format(date));
            
            
            if(ctlPersonal.iniciarSesion(personal)){
                this.dispose();
                Menu menu = new Menu(personal);
                VentanaVentas ventana = new VentanaVentas(personal);
                CuadrarCaja cuadrarCaja = new CuadrarCaja(personal);
                Object[][] datosTabla={};
                //VentanaPago ventanaPago = new VentanaPago( personal);
                menu.setVisible(true);
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No esta Ingresado en el sistema");
            }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        VentanaPersonal ventanaPersonal = new VentanaPersonal();
        ventanaPersonal.setVisible(true);
        ventanaPersonal.setSize(440, 700);
        dispose();
        
    }//GEN-LAST:event_botonRegistroActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel imagenUser;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
