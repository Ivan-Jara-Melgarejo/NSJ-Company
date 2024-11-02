package vista;

import ConexionBD.Conexion;
import Controlador.ControladorVentas;
import Modelo.Personal;
import Modelo.Producto;
import Modelo.Ventas;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import javax.swing.table.DefaultTableModel;

public class VentanaVentas extends javax.swing.JFrame {

    Producto producto = new Producto();
    ControladorVentas controladorVentas = new ControladorVentas();
    Personal personal;
    public VentanaVentas() {
        initComponents();
    }

    public VentanaVentas(Personal personal) {
        initComponents();
        setLocationRelativeTo(null);
        this.personal = personal;
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaVentas.setModel(modeloTabla);
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("precio");
        modeloTabla.addColumn("Stock");
        modeloTabla.addColumn("Total Linea");

        nombreUsuario.setText(personal.getNombre());
        cajaIVA.setText("19%");

    }
    
    public Object[][] obtenerDatosTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaVentas.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();
        Object[][] data = new Object[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                data[i][j] = model.getValueAt(i, j);
            }
        }
        return data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        cajaIngresoProducto = new javax.swing.JTextField();
        cajaDescuentoSubtotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        cajaIVA = new javax.swing.JTextField();
        cajaTotal = new javax.swing.JTextField();
        cajaTotalNeto = new javax.swing.JTextField();
        etiquetaTotal = new javax.swing.JLabel();
        botonPagar = new javax.swing.JButton();
        imagenUSer = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        botonAnularVenta = new javax.swing.JButton();
        botonAnularProducto = new javax.swing.JButton();
        botonDescuento = new javax.swing.JButton();
        botonX = new javax.swing.JButton();
        eitquetaF2 = new javax.swing.JLabel();
        etiquetaF5 = new javax.swing.JLabel();
        etiquetaF3 = new javax.swing.JLabel();
        botonIrAMenu = new javax.swing.JButton();
        cajaNombre = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        cajaCodigoBarra = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        cajaStock = new javax.swing.JTextField();
        cajaTotalLineaNeto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panel.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 150, 40));

        cajaIngresoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIngresoProductoActionPerformed(evt);
            }
        });
        cajaIngresoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaIngresoProductoKeyPressed(evt);
            }
        });
        panel.add(cajaIngresoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 40, 300, 40));

        cajaDescuentoSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaDescuentoSubtotal.setText("0");
        panel.add(cajaDescuentoSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 97, 35));

        tablaVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Barra", "Descripcion", "Cantidad", "Precio", "Stock", "Total Lineas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.setToolTipText("");
        tablaVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaVentasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 900, 270));

        cajaIVA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaIVA.setText("0");
        panel.add(cajaIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 97, 35));

        cajaTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaTotal.setText("0");
        panel.add(cajaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 160, 35));

        cajaTotalNeto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaTotalNeto.setText("0");
        panel.add(cajaTotalNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 160, 35));

        etiquetaTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTotal.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTotal.setText("Total:");
        panel.add(etiquetaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 40, -1));

        botonPagar.setBackground(new java.awt.Color(102, 255, 255));
        botonPagar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonPagar.setText("$PAGAR");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });
        panel.add(botonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 250, 140));

        imagenUSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.jpg"))); // NOI18N
        panel.add(imagenUSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, 40));

        nombreUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setText("Usuario1");
        panel.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        botonAnularVenta.setBackground(new java.awt.Color(51, 51, 255));
        botonAnularVenta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAnularVenta.setForeground(new java.awt.Color(255, 255, 255));
        botonAnularVenta.setText("<html>Anular Venta</html>");
        botonAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnularVentaActionPerformed(evt);
            }
        });
        panel.add(botonAnularVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 160, 70));

        botonAnularProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAnularProducto.setText("<html>Anular Producto</html>");
        botonAnularProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAnularProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAnularProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnularProductoActionPerformed(evt);
            }
        });
        panel.add(botonAnularProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 150, 90));

        botonDescuento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonDescuento.setText("Descuento");
        botonDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDescuentoActionPerformed(evt);
            }
        });
        panel.add(botonDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, 180, 70));

        botonX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonX.setText("X");
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });
        panel.add(botonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 130, 70));

        eitquetaF2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eitquetaF2.setForeground(new java.awt.Color(255, 255, 255));
        eitquetaF2.setText("F2");
        panel.add(eitquetaF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 30, 30));

        etiquetaF5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaF5.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaF5.setText("F5");
        panel.add(etiquetaF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 30, 30));

        etiquetaF3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaF3.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaF3.setText("F3");
        panel.add(etiquetaF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 30, 30));

        botonIrAMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonIrAMenu.setText("Ir a menu");
        botonIrAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrAMenuActionPerformed(evt);
            }
        });
        panel.add(botonIrAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panel.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, -1));
        panel.add(cajaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 130, -1));
        panel.add(cajaCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 150, -1));
        panel.add(cajaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 160, -1));
        panel.add(cajaStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 150, -1));

        cajaTotalLineaNeto.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        panel.add(cajaTotalLineaNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 150, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descuento:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 80, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IVA:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Neto:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_clientes.jpg"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 730));

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

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        String texto = cajaTotal.getText();
        this.personal = personal;
        Object[][] datosTabla = obtenerDatosTabla();
        //String personal = nombreUsuario.getText();
        
        VentanaPago ventanaP = new VentanaPago(datosTabla, texto, personal);
        
        ventanaP.setVisible(true);
        //ventanaP.setSize(1120, 780);
    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonIrAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrAMenuActionPerformed
        dispose();
    }//GEN-LAST:event_botonIrAMenuActionPerformed

    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed
        int num = Integer.parseInt(cajaIngresoProducto.getText());
        //Aqui estamos agregando el * al JTextField
        cajaIngresoProducto.setText(num + "*");
    }//GEN-LAST:event_botonXActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        //DefaultTableModel modeloTabla = new DefaultTableModel();
        String codigoBarras = cajaIngresoProducto.getText();
        int posicionAsterisco = codigoBarras.indexOf("*");
        int posicionResta = codigoBarras.indexOf("-");

        if (cajaIngresoProducto.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "EVTSS");

        } else if (posicionAsterisco != -1) {
            agregarProductoATablaX();
            multiplicarColumnas(tablaVentas, 2, 3, 5);
            multiplicarLineaCompleta(tablaVentas, cajaTotal);
            subtotal(tablaVentas, cajaTotalNeto);

        } else if (posicionResta != -1) {
            restarProductoATabla();
            multiplicarColumnas(tablaVentas, 2, 3, 5);
            multiplicarLineaCompleta(tablaVentas, cajaTotal);
            subtotal(tablaVentas, cajaTotalNeto);
        } else {
            agregarProductoATabla();
            multiplicarColumnas(tablaVentas, 2, 3, 5);
            multiplicarLineaCompleta(tablaVentas, cajaTotal);
            subtotal(tablaVentas, cajaTotalNeto);
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnularVentaActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_botonAnularVentaActionPerformed

    private void botonAnularProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnularProductoActionPerformed
        int seleccion = tablaVentas.getSelectedRow();

        if (seleccion != -1) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar esta fila?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
                modeloTabla.removeRow(seleccion);
                JOptionPane.showMessageDialog(null, "Fila eliminada Exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        }
    }//GEN-LAST:event_botonAnularProductoActionPerformed

    private void cajaIngresoProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIngresoProductoKeyPressed
        // Verificar si se ha presionado la tecla F5
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            int num = Integer.parseInt(cajaIngresoProducto.getText());
            //Aqui estamos agregando el * al JTextField
            cajaIngresoProducto.setText(num + "*");
        }

        // Verificar si se ha presionado la tecla f4
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            int num = Integer.parseInt(cajaIngresoProducto.getText());
            //Aqui estamos agregando el - al JTextField
            cajaIngresoProducto.setText(num + "-");
        }
    }//GEN-LAST:event_cajaIngresoProductoKeyPressed

    private void cajaIngresoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIngresoProductoActionPerformed
        String codigoBarras = cajaIngresoProducto.getText();
        int posicionAsterisco = codigoBarras.indexOf("*");
        int posicionResta = codigoBarras.indexOf("-");

        if (cajaIngresoProducto.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "EVTSS");
        } else if (posicionAsterisco != -1) {
            agregarProductoATablaX();
            multiplicarColumnas(tablaVentas, 2, 3, 5);
        } else if (posicionResta != -1) {
            restarProductoATabla();
            multiplicarColumnas(tablaVentas, 2, 3, 5);
        } else {
            agregarProductoATabla();
            multiplicarColumnas(tablaVentas, 2, 3, 5);
        }
        // Cada vex que le hago click a esta caja de texto el cursor debera colocarse al final del texto
        SwingUtilities.invokeLater(() -> {
            // Establecer el cursor al final del texto
            cajaIngresoProducto.setCaretPosition(cajaIngresoProducto.getText().length());
        });

    }//GEN-LAST:event_cajaIngresoProductoActionPerformed

    private void tablaVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaVentasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            int seleccion = tablaVentas.getSelectedRow();

            if (seleccion != -1) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar esta fila?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
                    modeloTabla.removeRow(seleccion);
                    JOptionPane.showMessageDialog(null, "Fila eliminada Exitosamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            }
        }
    }//GEN-LAST:event_tablaVentasKeyPressed

    private void botonDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDescuentoActionPerformed

    public void agregarProductoATabla() {
        //DefaultTableModel modeloTabla = new DefaultTableModel();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
        tablaVentas.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        // Código de barras del producto a consultar
        String codigoBarras = cajaIngresoProducto.getText();
        String codigoA = obtenerNumeroAntesDeAsterisco(codigoBarras);
        int cantidade = Integer.parseInt(codigoA);
        //String codigoI = obtenerNumeroDespuesDeAsterisco(codigoBarras);
        String where = "";

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            if (!"".equals(codigoBarras)) { //si el campo no esta vacio
                where = " where codigoI=" + codigoBarras;
            }

            // Preparar la consulta
            ps = conexion.prepareStatement("select idProducto,codigoI,nombre,precio,stock from producto" + where);
            // Ejecutar la consulta
            rs = ps.executeQuery();

            while (rs.next()) {

                // Obtener los datos del registro
                String codigoBarra = rs.getString("codigoI");
                String nombre = rs.getString("nombre");
                int precio = rs.getInt("precio");
                int cantidad = 1;
                int stock = rs.getInt("stock");
                int totalLinea = precio * cantidad;

                boolean encontrado = false;
                int filaEncontrada = -1;
                for (int fila = 0; fila < tablaVentas.getRowCount(); fila++) {
                    String valorTabla = tablaVentas.getValueAt(fila, 0).toString(); // Obtener valor de la primera columna

                    if (valorTabla.equals(codigoBarras)) {
                        encontrado = true;
                        filaEncontrada = fila;
                        break;
                    }

                }

                String num = encontrarCodigoBarra(codigoBarras, tablaVentas);
                //Aca pasa si esque el codigo de barra ya esta en la tabla se siga sumando la cantidad a ese mismo codigo de barra
                if (num.equals(codigoBarras)) {
                    int cantidadActual = (int) tablaVentas.getValueAt(filaEncontrada, 2);
                    int total = cantidade + cantidadActual;
                    tablaVentas.setValueAt(total, filaEncontrada, 2);

                } else {
                    modeloTabla.addRow(new Object[]{codigoBarra, nombre, cantidad, precio, stock, totalLinea});
                }

                producto.setCodigoI(cajaCodigoBarra.getText());
                cajaCodigoBarra.setText(codigoBarra);
                cajaNombre.setText(nombre);
                cajaCantidad.setText(String.valueOf(cantidad));
                cajaPrecio.setText(String.valueOf(precio));
                cajaStock.setText(String.valueOf(stock));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        limpiarCajas();
    }

    public void agregarProductoATablaX() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
        tablaVentas.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        // Código de barras del producto a consultar
        String codigoBarras = cajaIngresoProducto.getText();
        String codigoA = obtenerNumeroAntesDeAsterisco(codigoBarras);
        int cantidade = Integer.parseInt(codigoA);
        String codigoI = obtenerNumeroDespuesDeAsterisco(codigoBarras);

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            // Preparar la consulta
            ps = conexion.prepareStatement("select idProducto,codigoI,nombre,precio,stock from producto where codigoI='" + codigoI + "'");
            // Ejecutar la consulta
            rs = ps.executeQuery();

            // Obtener los datos del registro
            if (rs.next()) {

                String codigoBarra = rs.getString("codigoI");
                String nombre = rs.getString("nombre");
                int precio = rs.getInt("precio");
                String cantidad = obtenerNumeroAntesDeAsterisco(codigoBarras);
                int stock = rs.getInt("stock");
                int totalLinea = precio * cantidade;

                boolean encontrado = false;
                int filaEncontrada = -1;
                for (int fila = 0; fila < tablaVentas.getRowCount(); fila++) {
                    String valorTabla = tablaVentas.getValueAt(fila, 0).toString(); // Obtener valor de la primera columna

                    if (valorTabla.equals(codigoI)) {
                        encontrado = true;
                        filaEncontrada = fila;
                        break;
                    }
                }
                String num = encontrarCodigoBarra(codigoI, tablaVentas);

                //Aca pasa si esque el codigo de barra ya esta en la tabla se siga sumando la cantidad a ese mismo codigo de barra
                if (num.equals(codigoI)) {
                    int col = (int) tablaVentas.getValueAt(filaEncontrada, 2);
                    int total = cantidade + col;
                    tablaVentas.setValueAt(total, filaEncontrada, 2);

                } else {
                    modeloTabla.addRow(new Object[]{codigoBarra, nombre, cantidade, precio, stock, totalLinea});
                }

                //Aca mostramos en las cajas de textos lo que agregamos a la tabla
                producto.setCodigoI(cajaCodigoBarra.getText());
                cajaCodigoBarra.setText(codigoBarra);
                cajaNombre.setText(nombre);
                cajaCantidad.setText(String.valueOf(cantidad));
                cajaPrecio.setText(String.valueOf(precio));
                cajaStock.setText(String.valueOf(stock));

            } else {
                JOptionPane.showMessageDialog(null, "Producto no se ah encontrado en bodega");
                System.err.println("No se encontro");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        limpiarCajas();
    }

    public void restarProductoATabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
        tablaVentas.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        // Código de barras del producto a consultar
        String codigoBarras = cajaIngresoProducto.getText();
        String codigoA = obtenerNumeroAntesResta(codigoBarras);
        int cantidade = Integer.parseInt(codigoA);
        String codigoI = obtenerNumeroDespuesResta(codigoBarras);

        try {

            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            // Preparar la consulta
            ps = conexion.prepareStatement("select codigoI,nombre,precio,stock from producto where codigoI='" + codigoI + "'");
            // Ejecutar la consulta
            rs = ps.executeQuery();

            // Obtener los datos del registro
            if (rs.next()) {

                String codigoBarra = rs.getString("codigoI");
                String nombre = rs.getString("nombre");
                int precio = rs.getInt("precio");
                String cantidad = obtenerNumeroAntesDeAsterisco(codigoBarras);
                int stock = rs.getInt("stock");
                double totalLinea = Double.valueOf(precio) * cantidade;

                boolean encontrado = false;
                int filaEncontrada = -1;
                for (int fila = 0; fila < tablaVentas.getRowCount(); fila++) {
                    String valorTabla = tablaVentas.getValueAt(fila, 0).toString(); // Obtener valor de la primera columna

                    if (valorTabla.equals(codigoI)) {
                        encontrado = true;
                        filaEncontrada = fila;
                        break;
                    }
                }
                String num = encontrarCodigoBarra(codigoI, tablaVentas);
                if (num.equals(codigoI)) {

                    int col = (int) tablaVentas.getValueAt(filaEncontrada, 2);
                    int total = col - cantidade;
                    if (total > 0) {
                        tablaVentas.setValueAt(total, filaEncontrada, 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede Seguir restando");
                        System.out.println(total);
                    }
                } else {
                    modeloTabla.addRow(new Object[]{codigoBarra, nombre, cantidade, precio, stock, totalLinea});

                }

                //encontrarCodigoBarra(codigoI, cantidade, tablaVentas);
                //Aca mostramos en las cajas de textos lo que agregamos a la tabla
                producto.setCodigoI(cajaCodigoBarra.getText());
                cajaCodigoBarra.setText(codigoBarra);
                cajaNombre.setText(nombre);
                cajaCantidad.setText(String.valueOf(cantidad));
                cajaPrecio.setText(String.valueOf(precio));
                cajaStock.setText(String.valueOf(stock));

            } else {
                System.err.println("No se encontro Resta");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int columna = 5;
        double suma = 0;
        //ACa estamos sumando la columna completa de totales en linea para tener un conteo
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            double valor = Double.parseDouble(modeloTabla.getValueAt(i, columna).toString());
            suma += valor;
        }

        cajaTotal.setText(String.valueOf(suma));

        limpiarCajas();
    }

    public void limpiarCajas() {
        cajaIngresoProducto.setText("");
    }

    public String obtenerNumeroAntesDeAsterisco(String texto) {
        // Valor predeterminado si no se encuentra el asterisco o el número no es válido
        String numero = "1";

        // Definir la expresión regular para buscar antes y después del asterisco
        String textos = "(.*?)\\*(.*)";

        // Crear un objeto Pattern con la expresión texto
        Pattern pattern = Pattern.compile(textos);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {
            String antes = matcher.group(1);
            String despues = matcher.group(2);

            try {
                numero = antes;
            } catch (NumberFormatException e) {
                // El número no es válido, se mantiene el valor predeterminado de 1
            }
        }
        return numero;
    }

    public String obtenerNumeroAntesResta(String texto) {
        // Valor predeterminado si no se encuentra el asterisco o el número no es válido
        String resultado = "";

        // Definir la expresión regular para buscar antes y después del asterisco
        String[] numeros = texto.split("-");

        if (numeros.length == 2) {
            String numeroAntes = numeros[0].trim();
            String numeroDespues = numeros[1].trim();
            resultado = numeroAntes;
        } else {
            System.out.println("nones");
        }
        return resultado;
    }

    public String obtenerNumeroDespuesResta(String texto) {
        // Valor predeterminado si no se encuentra el asterisco o el número no es válido
        String resultado = "";

        // Definir la expresión regular para buscar antes y después del asterisco
        String[] numeros = texto.split("-");

        if (numeros.length == 2) {
            String numeroAntes = numeros[0].trim();
            String numeroDespues = numeros[1].trim();
            resultado = numeroDespues;
        } else {
            System.out.println("nones");
        }
        return resultado;
    }

    public String obtenerNumeroDespuesDeAsterisco(String texto) {
        // Valor predeterminado si no se encuentra el asterisco o el número no es válido
        String numero = "";

        // Definir la expresión regular para buscar antes y después del asterisco
        String textos = "(.*?)\\*(.*)";

        // Crear un objeto Pattern con la expresión texto
        Pattern pattern = Pattern.compile(textos);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {
            String antes = matcher.group(1);
            String despues = matcher.group(2);

            try {
                numero = despues;

            } catch (NumberFormatException e) {
                // El número no es válido, se mantiene el valor predeterminado de 1
            }
        }
        return numero;
    }

    public String encontrarCodigoBarra(String caja, JTable tabla) {
        boolean encontrado = false;
        int filaEncontrada = -1;
        int columnaSeleccionada = 0;
        String numero = "";

        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            String valorTabla = tabla.getValueAt(fila, 0).toString();

            if (valorTabla.equals(caja)) {
                encontrado = true;
                filaEncontrada = fila;
                break;
            }
        }
        if (encontrado) {
            Object numeroEncontrado = tabla.getValueAt(filaEncontrada, columnaSeleccionada);
            numero = (String) numeroEncontrado.toString();
        } else {
            // El número no se encuentra en la primera columna del JTable
            System.out.println("El número no está en la primera columna del JTable");
        }
        return numero;
    }

    public static void multiplicarColumnas(JTable table, int columna1, int columna2, int columnaResultado) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        for (int fila = 0; fila < model.getRowCount(); fila++) {
            Object valor1 = model.getValueAt(fila, columna1);
            Object valor2 = model.getValueAt(fila, columna2);

            if (valor1 instanceof Number && valor2 instanceof Number) {
                int resultado = ((Number) valor1).intValue() * ((Number) valor2).intValue();
                model.setValueAt(resultado, fila, columnaResultado);
            }
        }
    }

    public static void multiplicarLineaCompleta(JTable table, JTextField texto) {
        int columna = 5;
        int suma = 0;

        for (int i = 0; i < table.getRowCount(); i++) {
            int valor = Integer.parseInt(table.getValueAt(i, columna).toString());
            suma += valor;
        }

        texto.setText(String.valueOf(suma));
    }

    public static void subtotal(JTable table, JTextField totalneto) {
        int columna = 5;
        int suma = 0;

        for (int i = 0; i < table.getRowCount(); i++) {
            int valor = Integer.parseInt(table.getValueAt(i, columna).toString());
            suma += valor;
        }

        //total.setText(String.valueOf(suma));
        int rescatando = suma;
        int descuento = (int) (rescatando * (19.0 / 100));
        int resultado = rescatando - descuento;
        totalneto.setText(String.valueOf(resultado));
    }

    public String formatearPesosChilenos(String numero) {
        // Remover cualquier punto existente en el número
        numero = numero.replace(".", "");

        // Verificar si el número tiene más de 3 dígitos
        if (numero.length() > 3) {
            // Calcular la cantidad de puntos necesarios para separar los miles
            int puntos = (numero.length() - 1) / 3;

            // Insertar los puntos en la posición adecuada
            for (int i = 1; i <= puntos; i++) {
                int posicion = numero.length() - (i * 3);
                numero = numero.substring(0, posicion) + "." + numero.substring(posicion);
            }
        }

        // Agregar el símbolo de pesos al inicio
        numero = "$" + numero;

        return numero;
    }

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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnularProducto;
    private javax.swing.JButton botonAnularVenta;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonDescuento;
    private javax.swing.JButton botonIrAMenu;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton botonX;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaCodigoBarra;
    private javax.swing.JTextField cajaDescuentoSubtotal;
    private javax.swing.JTextField cajaIVA;
    private javax.swing.JTextField cajaIngresoProducto;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JTextField cajaStock;
    private javax.swing.JTextField cajaTotal;
    private javax.swing.JTextField cajaTotalLineaNeto;
    private javax.swing.JTextField cajaTotalNeto;
    private javax.swing.JLabel eitquetaF2;
    private javax.swing.JLabel etiquetaF3;
    private javax.swing.JLabel etiquetaF5;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel imagenUSer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
