package Controlador;

import ConexionBD.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorCliente {
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion con = new Conexion();
    
    public boolean insertar(Cliente cliente) throws SQLException {
        Connection conexion = con.getconectar();
        String SQL_INSERT = "INSERT INTO cliente (nombre, apellido, rut, telefono, correo, direccion) values (?,?,?,?,?,?)";

        ps = conexion.prepareStatement(SQL_INSERT);
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getApellido());
        ps.setString(3, cliente.getRut());
        ps.setInt(4, cliente.getTelefono());
        ps.setString(5, cliente.getCorreo());
        ps.setString(6, cliente.getDireccion());

        ps.executeUpdate();

        return false;
    }
    
    public boolean buscar(Cliente cliente) {
        Connection conexion = con.getconectar();
        String SQL_BUSCAR = "SELECT * FROM cliente WHERE idCliente=?";
                
        try {
            ps = conexion.prepareStatement(SQL_BUSCAR);
            ps.setInt(1, cliente.getIdCliente());
            rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setRut(rs.getString("rut"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setDireccion(rs.getString("direccion"));

                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }
    
    public void modificar(Cliente cliente) {
        Connection conexion = con.getconectar();
        String SQL_MODIFICAR = "UPDATE cliente SET nombre=?,apellido=?,rut=?,telefono=?,correo=?,direccion=? WHERE idCliente=?";
        
        try {
            ps = conexion.prepareStatement(SQL_MODIFICAR);
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getRut());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getDireccion());
            ps.setInt(7, cliente.getIdCliente());

            int resultado = ps.executeUpdate();

             if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado de manera exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Registro no modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex);
        }
    }
    
    public boolean eliminar(Cliente cliente) {
        Connection conexion = con.getconectar();
        String SQL_ELIMINAR = "DELETE FROM cliente WHERE idCliente=?";

        try {
            ps = conexion.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, cliente.getIdCliente());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }
    
    public static boolean validarRUT(String rut) {
        
        boolean valido = false;
        
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutNumerico = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int factor = 2;
            int suma = 0;
            for (int i = Integer.toString(rutNumerico).length() - 1; i >= 0; i--) {
                suma += Character.getNumericValue(Integer.toString(rutNumerico).charAt(i)) * factor;
                factor = factor == 7 ? 2 : factor + 1;
            }
            int resto = suma % 11;
            char dvCalculado = resto == 0 ? '0' : resto == 1 ? 'K' : Character.forDigit(11 - resto, 10);
            valido = dv == dvCalculado;
        } catch (Exception e) {
            valido = false;
        }
        return valido;
    }
}
