package Controlador;

import ConexionBD.Conexion;
import Modelo.Proveedores;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorProveedores {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion con = new Conexion();

    public boolean insertar(Proveedores proveedor) {

        try {
            Connection conexion = con.getconectar();
            ps = conexion.prepareStatement("insert into proveedores (nombre,direccion,numero,correo) values (?,?,?,?)");
            ps.setString(1, proveedor.getNombreEmpresa());
            ps.setString(2, proveedor.getDireccion());
            ps.setInt(3, proveedor.getNumeroTelefono());
            ps.setString(4, proveedor.getCorreo());
            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            return false;
        }

    }

    public boolean modificar(Proveedores proveedor) {
        Connection conexion = con.getconectar();

        try {
            ps = conexion.prepareStatement("update proveedores set nombre=?,direccion=?,numero=?,correo=? where idProveedores=?");
            ps.setString(1, proveedor.getNombreEmpresa());
            ps.setString(2, proveedor.getDireccion());
            ps.setInt(3, proveedor.getNumeroTelefono());
            ps.setString(4, proveedor.getCorreo());
            ps.setInt(5, proveedor.getIdEmpresa());

            int resutado = ps.executeUpdate();

            if (resutado > 0) {
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

    public boolean eliminar(Proveedores proveedor) {

        Connection conexion = con.getconectar();

        try {

            ps = conexion.prepareStatement("delete from proveedores where idProveedores=?");
            ps.setInt(1, proveedor.getIdEmpresa());

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
    
    public boolean comprobarEmail(String correo){
        //patron para validar el correo
        Pattern patron = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
                + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        
        Matcher matcher = patron.matcher(correo);
        
        return matcher.find();
    }
}
