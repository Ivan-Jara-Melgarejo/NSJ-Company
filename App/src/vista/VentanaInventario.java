package vista;

import ConexionBD.Conexion;
import Controlador.ControladorProducto;
import Controlador.ControladorUnionPP;
import Modelo.Categorias;
import Modelo.Producto;
import Modelo.Proveedores;
import Modelo.UnionPP;
import Reportes.Excel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaInventario extends javax.swing.JDialog {

    Categorias categoria = new Categorias();
    Proveedores proveedor = new Proveedores();
    
    ControladorUnionPP controlador_union = new ControladorUnionPP();
    

    public VentanaInventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if (modal) {
            
        }
        setLocationRelativeTo(null);
        etiquetaNumeroTabla.setVisible(false);
        cajaNumeros.setVisible(false);
        etiquetaPrecio.setVisible(false);
        cajaStock.setVisible(false);
        botonEditar.setVisible(false);
        actualizarTabla();

        DefaultComboBoxModel modeloCombo2 = new DefaultComboBoxModel(categoria.mostrarCategorias());
        comboCategoria.setModel(modeloCombo2);

        DefaultComboBoxModel modeloCombo4 = new DefaultComboBoxModel(categoria.mostrarCategoriasXtabla());
        FiltrarXCombo.setModel(modeloCombo4);
       
        DefaultComboBoxModel modeloCombo6 = new DefaultComboBoxModel(proveedor.mostrarProveedores());
        combo_proveedores.setModel(modeloCombo6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        etiquetaNumeroTabla = new javax.swing.JLabel();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaCodigo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaPrecio = new javax.swing.JLabel();
        cajaStock = new javax.swing.JTextField();
        cajaNumeros = new javax.swing.JTextField();
        cajaCodigo = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaPrecio1 = new javax.swing.JLabel();
        cajaPrecio = new javax.swing.JTextField();
        etiquetaPrecio2 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        botonEditar = new javax.swing.JButton();
        etiquetaDescripcion1 = new javax.swing.JLabel();
        combo_proveedores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInverntario = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonImprimir = new javax.swing.JButton();
        volverAMenu = new javax.swing.JButton();
        FiltrarXCombo = new javax.swing.JComboBox<>();
        cajaBuscarXID = new javax.swing.JTextField();
        botonBuscarXID = new javax.swing.JButton();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS DEL PRODUCTO");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INVENTARIO");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 223, -1));

        panel2.setBackground(new java.awt.Color(0, 153, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaNumeroTabla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaNumeroTabla.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNumeroTabla.setText("N°:");
        panel2.add(etiquetaNumeroTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 40));

        etiquetaDescripcion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDescripcion.setText("Proveedores:");
        panel2.add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        etiquetaCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaCodigo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCodigo.setText("Codigo:");
        panel2.add(etiquetaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("NOMBRE:");
        panel2.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        etiquetaPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaPrecio.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPrecio.setText("Stock:");
        panel2.add(etiquetaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 20));

        cajaStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel2.add(cajaStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 140, 40));

        cajaNumeros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel2.add(cajaNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 50, 30));

        cajaCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel2.add(cajaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, 30));

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel2.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 30));

        cajaCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel2.add(cajaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 140, 30));

        botonGuardar.setBackground(new java.awt.Color(0, 153, 0));
        botonGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panel2.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 130, 50));

        etiquetaPrecio1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaPrecio1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPrecio1.setText("PRECIO:");
        panel2.add(etiquetaPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        cajaPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel2.add(cajaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, 40));

        etiquetaPrecio2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPrecio2.setText("Categoria:");
        panel2.add(etiquetaPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        comboCategoria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", " " }));
        panel2.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, -1));

        botonEditar.setBackground(new java.awt.Color(204, 204, 0));
        botonEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        panel2.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 50));

        etiquetaDescripcion1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaDescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDescripcion1.setText("Cantidad:");
        panel2.add(etiquetaDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        combo_proveedores.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        combo_proveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", " " }));
        combo_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_proveedoresActionPerformed(evt);
            }
        });
        panel2.add(combo_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 170, -1));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 340, 570));

        tablaInverntario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaInverntario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablaInverntario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInverntarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaInverntario);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 620, 360));

        botonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 120, 50));

        botonLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        panel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 110, 50));

        botonImprimir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonImprimir.setText("IMPRIMIR");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });
        panel1.add(botonImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 120, 50));

        volverAMenu.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        volverAMenu.setText("Ir a Menu");
        volverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuActionPerformed(evt);
            }
        });
        panel1.add(volverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        FiltrarXCombo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FiltrarXCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Filtro--" }));
        FiltrarXCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrarXComboItemStateChanged(evt);
            }
        });
        FiltrarXCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarXComboActionPerformed(evt);
            }
        });
        panel1.add(FiltrarXCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 170, 40));

        cajaBuscarXID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarXIDActionPerformed(evt);
            }
        });
        panel1.add(cajaBuscarXID, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 88, 230, 40));

        botonBuscarXID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonBuscarXID.setText("Buscar");
        botonBuscarXID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarXIDActionPerformed(evt);
            }
        });
        panel1.add(botonBuscarXID, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 120, 50));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_clientes.jpg"))); // NOI18N
        panel1.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        Producto producto = new Producto();
        ControladorProducto ctlrProducto = new ControladorProducto();
        UnionPP union_pp = new UnionPP();
        ControladorUnionPP ctrl_union_pp = new ControladorUnionPP();

        int seleccionCombo = comboCategoria.getSelectedIndex();
        int seleccion_proveedores = combo_proveedores.getSelectedIndex();

        if (cajaNombre.getText().isEmpty() || cajaPrecio.getText().isEmpty() || cajaCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene los campos");
        } else if (seleccionCombo == 0) {
            JOptionPane.showMessageDialog(null, "Escoja una categoría");
        } 
        else {
            String codigo = cajaCodigo.getText();
            int nuevaCantidad = Integer.parseInt(cajaCantidad.getText());

            producto.setCodigoI(codigo);
            producto.setNombre(cajaNombre.getText());
            producto.setPrecio(Integer.parseInt(cajaPrecio.getText()));
            producto.setIdCategoria(seleccionCombo);
            producto.setCantidad(nuevaCantidad);
            producto.setNombreCategoria(FiltrarXCombo.toString());
            
            union_pp.setId_producto(1);
            union_pp.setId_proveedores(seleccion_proveedores);
            
            try {
                if (ctrl_union_pp.insertar(union_pp)) {
                    JOptionPane.showMessageDialog(null, "Proveedor insertado");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se ha insertado el proveedor");
                }
            } 
            catch (Exception ex) {
                System.err.println("ERROR: " +ex);
            }
            
            int stockActual = ctlrProducto.obtenerStockProducto(codigo);
            int nuevoStock = stockActual + nuevaCantidad;
            producto.setStock(nuevoStock);

            if (stockActual == 0) {
                // El producto no existe en la base de datos, realizar la inserción
                if (ctlrProducto.insertar(producto)) {
                    JOptionPane.showMessageDialog(null, "No se ha insertado el registro");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro Insertado");
                }
            } else {
                // El producto ya existe en la base de datos, realizar la actualización
                if (ctlrProducto.existeProducto(codigo)) {
                    if (ctlrProducto.actualizarStockProducto(producto)) {
                        JOptionPane.showMessageDialog(null, "Stock actualizado");
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "No se ha actualizado el stock");
                    }
                } 
                else {
                    // El producto no existe en la base de datos, realizar la inserción
                    if (ctlrProducto.insertar(producto)) {
                        JOptionPane.showMessageDialog(null, "No se ha insertado el registro");
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Registro Insertado");
                    }
                }
            }
            actualizarTabla();
            limpiarCajas();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void volverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAMenuActionPerformed
        dispose();
    }//GEN-LAST:event_volverAMenuActionPerformed

    private void FiltrarXComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrarXComboItemStateChanged
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            Categorias categorias = (Categorias) FiltrarXCombo.getSelectedItem();
            
            DefaultTableModel modeloTabla = new DefaultTableModel();
            tablaInverntario.setModel(modeloTabla);

            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                Conexion con = new Conexion();
                Connection conexion = con.getconectar();

                ps = conexion.prepareStatement("select p.codigoI, p.nombre, p.precio, c.nombre as 'Categoria' ,p.cantidad, p.stock  from producto as p inner join categoria as c on p.idCategoria=c.idCategoria where p.idCategoria=" + categorias.getIdCategoria());
                rs = ps.executeQuery();

                modeloTabla.addColumn("Codigo Barra");
                modeloTabla.addColumn("Nombre ");
                modeloTabla.addColumn("Precio ");
                modeloTabla.addColumn("Categoria ");
                modeloTabla.addColumn("Cantidad ");
                modeloTabla.addColumn("Stock ");

                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadColumnas = rsMD.getColumnCount();

                //Aqui cambiamos el ancho de las Columnas
                int ancho[] = {50, 110, 40, 20, 1, 1};
                for (int i = 0; i < cantidadColumnas; i++) {
                    tablaInverntario.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
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
    }//GEN-LAST:event_FiltrarXComboItemStateChanged

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCajas();
        actualizarTabla();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void tablaInverntarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInverntarioMouseClicked
        PreparedStatement ps = null; //hacer la consulta a la base de Datos
        ResultSet rs = null;// Obtener el resultado de la busqueda de la consulta
 
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            int fila = tablaInverntario.getSelectedRow();
            String codigo = tablaInverntario.getValueAt(fila, 0).toString();

            ps = conexion.prepareStatement("select idProducto,codigoI,nombre,precio,idCategoria,cantidad,stock from producto where codigoI=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cajaNumeros.setText(String.valueOf(rs.getInt("idProducto")));
                cajaCodigo.setText(rs.getString("codigoI"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaPrecio.setText(String.valueOf(rs.getInt("precio")));
                comboCategoria.setSelectedIndex(rs.getInt("idCategoria"));
                cajaCantidad.setText(String.valueOf(rs.getInt("cantidad")));
                cajaStock.setText(String.valueOf(rs.getInt("stock")));
            }
            botonGuardar.setVisible(false);
            botonEditar.setVisible(true);

        } 
        catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_tablaInverntarioMouseClicked

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
    
        Producto producto = new Producto();
        ControladorProducto ctlp = new ControladorProducto();
        int seleccionCombo = comboCategoria.getSelectedIndex();
        
        UnionPP union_pp = new UnionPP();
        ControladorUnionPP ctrl_union_pp = new ControladorUnionPP();

        // Aquí obtenemos el stock actual del producto desde la base de datos
        int stockActual = ctlp.obtenerStockProducto(cajaCodigo.getText());
        int seleccion_proveedores = combo_proveedores.getSelectedIndex();

        // Actualizamos los datos del producto
        producto.setCodigoI(cajaCodigo.getText());
        producto.setNombre(cajaNombre.getText());
        producto.setPrecio(Integer.parseInt(cajaPrecio.getText()));
        producto.setIdCategoria(seleccionCombo);
        producto.setCantidad(Integer.parseInt(cajaCantidad.getText()));
        producto.setStock(stockActual); // Mantenemos el stock actual obtenido de la base de datos
        producto.setIdProducto(Integer.parseInt(cajaNumeros.getText()));
        

        if (ctlp.modificar(producto)) {
            JOptionPane.showMessageDialog(null, "Registro Correcto");
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Registro Incorrecto");
            actualizarTabla();
            limpiarCajas();
        }
        botonGuardar.setVisible(true);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Producto producto = new Producto();
        ControladorProducto ctlProducto = new ControladorProducto();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        producto.setIdProducto(Integer.parseInt(cajaNumeros.getText()));

        if (opcion == JOptionPane.YES_OPTION) {
            if (ctlProducto.eliminar(producto)) {
                JOptionPane.showMessageDialog(null, "Exitoso");
                actualizarTabla();
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
        }

    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarXIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarXIDActionPerformed
        Producto producto = new Producto();
        ControladorProducto ctlProducto = new ControladorProducto();

        producto.setCodigoI(cajaBuscarXID.getText());
        if (ctlProducto.buscar(producto)) {
            cajaNumeros.setText(String.valueOf(producto.getIdProducto()));
            cajaNombre.setText(producto.getNombre());
            cajaPrecio.setText(String.valueOf(producto.getPrecio()));
            comboCategoria.setSelectedIndex(producto.getIdCategoria());
            cajaCantidad.setText(String.valueOf(producto.getCantidad()));
            cajaStock.setText(String.valueOf(producto.getStock()));
            cajaBuscarXID.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "no existe el producto");
            limpiarCajas();
        }
    }//GEN-LAST:event_botonBuscarXIDActionPerformed

    private void cajaBuscarXIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarXIDActionPerformed
        Producto producto = new Producto();
        ControladorProducto ctlProducto = new ControladorProducto();

        producto.setCodigoI(cajaBuscarXID.getText());
        if (ctlProducto.buscar(producto)) {
            cajaNumeros.setText(String.valueOf(producto.getIdProducto()));
            cajaCodigo.setText(producto.getCodigoI());
            cajaNombre.setText(producto.getNombre());
            cajaPrecio.setText(String.valueOf(producto.getPrecio()));
            comboCategoria.setSelectedIndex(producto.getIdCategoria());
            cajaCantidad.setText(String.valueOf(producto.getCantidad()));
            cajaStock.setText(String.valueOf(producto.getStock()));
            cajaBuscarXID.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "no existe el producto");
            limpiarCajas();
        }
    }//GEN-LAST:event_cajaBuscarXIDActionPerformed

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
        try {
            Excel.reporte();
        } catch (IOException ex) {
            Logger.getLogger(VentanaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void FiltrarXComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarXComboActionPerformed
        
        if(FiltrarXCombo.getSelectedIndex() == 0 ){
            actualizarTabla();
        }
    }//GEN-LAST:event_FiltrarXComboActionPerformed

    private void combo_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_proveedoresActionPerformed
        
        
    }//GEN-LAST:event_combo_proveedoresActionPerformed
    public void actualizarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaInverntario.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            ps = conexion.prepareStatement("select p.codigoI, p.nombre, p.precio, c.nombre as 'Categoria' ,p.cantidad, p.stock  from producto as p inner join categoria as c on p.idCategoria=c.idCategoria");
            rs = ps.executeQuery();

            modeloTabla.addColumn("Codigo Barra");
            modeloTabla.addColumn("Nombre ");
            modeloTabla.addColumn("Precio ");
            modeloTabla.addColumn("Categoria ");
            modeloTabla.addColumn("Cantidad ");
            modeloTabla.addColumn("Stock ");

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            //Con esto estamos cambiando el ancho de nuestras columnas
            int anchos[] = {50, 110, 40, 20, 1, 1};
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaInverntario.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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

    private void limpiarCajas() {
        cajaNumeros.setText("");
        cajaCodigo.setText("");
        cajaNombre.setText("");
        cajaPrecio.setText("");
        comboCategoria.setSelectedIndex(0);
        cajaCantidad.setText("");
        cajaStock.setText("");
        FiltrarXCombo.setSelectedIndex(0);
        cajaBuscarXID.setText("");
        combo_proveedores.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaInventario dialog = new VentanaInventario(new javax.swing.JFrame(), true);
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
    public javax.swing.JComboBox<String> FiltrarXCombo;
    public javax.swing.JButton botonBuscarXID;
    public javax.swing.JButton botonEditar;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JButton botonImprimir;
    public javax.swing.JButton botonLimpiar;
    public javax.swing.JTextField cajaBuscarXID;
    public javax.swing.JTextField cajaCantidad;
    public javax.swing.JTextField cajaCodigo;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaNumeros;
    public javax.swing.JTextField cajaPrecio;
    public javax.swing.JTextField cajaStock;
    public javax.swing.JComboBox<String> comboCategoria;
    public javax.swing.JComboBox<String> combo_proveedores;
    private javax.swing.JLabel etiquetaCodigo;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaDescripcion1;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNumeroTabla;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaPrecio1;
    private javax.swing.JLabel etiquetaPrecio2;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    public javax.swing.JTable tablaInverntario;
    private javax.swing.JButton volverAMenu;
    // End of variables declaration//GEN-END:variables
}
