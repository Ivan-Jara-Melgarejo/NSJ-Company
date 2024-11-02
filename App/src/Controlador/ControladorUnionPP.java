package Controlador;

import ConexionBD.Conexion;
import Modelo.Cliente;
import Modelo.UnionPP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorUnionPP {
    
    public boolean insertar(UnionPP union_pp) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
    
        Connection conexion = con.getconectar();
        String SQL_INSERT = "INSERT INTO union_pp (idProducto, idProveedor) values (?,?)";

        ps = conexion.prepareStatement(SQL_INSERT);
        ps.setInt(1, union_pp.getId_producto());
        ps.setInt(2, union_pp.getId_proveedores());

        ps.executeUpdate();

        return false;
    }
    
    public boolean modificar(UnionPP union_pp) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection conexion = con.getconectar();
        
        try {
            String SQL_MODIFICAR = "SELECT MAX(idProducto) AS idProducto FROM producto;";
            ps = conexion.prepareStatement(SQL_MODIFICAR);
            ps.setInt(1, union_pp.getId_producto());

            int resutado = ps.executeUpdate();

            if (resutado > 0) {
                return true;
            } else {
                return false;
            }
        } 
        catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } 
        finally {
            try {
                conexion.close();
            } 
            catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }  
    
}
