package Controlador;

import ConexionBD.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ControladorProducto {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion con = new Conexion();

    public boolean insertar(Producto producto) {

        
        try {
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("insert into producto (codigoI,nombre,precio,idCategoria,cantidad,stock) values (?,?,?,?,?,?)");
            ps.setString(1, producto.getCodigoI());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getIdCategoria());
            ps.setInt(5, producto.getCantidad());
            ps.setInt(6, producto.getStock());
            ps.executeUpdate();

        return false;
        } 
        catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } 
    }

    public boolean buscar(Producto producto) {
        Connection conexion = con.getconectar();

        try {
            ps = conexion.prepareStatement("select * from producto where codigoI=?");
            ps.setString(1, producto.getCodigoI());
            rs = ps.executeQuery();

            if (rs.next()) {
                
                producto.setCodigoI(rs.getString("codigoI"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setStock(rs.getInt("stock"));
                producto.setIdProducto(rs.getInt("idProducto"));
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
    
    public int obtenerStockProducto(String codigoProducto) {
        Connection conexion = con.getconectar();
        int stockActual = 0;
       
        try {
            String query = "SELECT stock FROM producto WHERE codigoI = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, codigoProducto);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                stockActual = rs.getInt("stock");
            }
            conexion.close();
        } 
        catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return stockActual;
    }
    
     public boolean actualizarStockProducto(Producto producto) {
        try {
            Connection conexion = con.getconectar();
            String query = "UPDATE producto SET stock = ? WHERE codigoI = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, producto.getStock());
            statement.setString(2, producto.getCodigoI());
            int filasActualizadas = statement.executeUpdate();
            conexion.close();
            return filasActualizadas > 0;
        } 
        catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return false;
    }
     
    public boolean existeProducto(String codigo) {
        try {
            Connection conexion = con.getconectar();
            String query = "SELECT * FROM producto WHERE CodigoI = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, codigo);
            ResultSet resultSet = statement.executeQuery();
            boolean existe = resultSet.next();
            conexion.close();
            return existe;
        } 
        catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return false;
    }

    public boolean modificar(Producto producto) {
        Connection conexion = con.getconectar();

        try {
            ps = conexion.prepareStatement("update producto set codigoI=?,nombre=?,precio=?,idCategoria=?,cantidad=?,stock=? where idProducto=?");
            ps.setString(1, producto.getCodigoI());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getIdCategoria());
            ps.setInt(5, producto.getCantidad());
            ps.setInt(6, producto.getStock());
            ps.setInt(7, producto.getIdProducto());
            

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

    public boolean eliminar(Producto producto) {
        Connection conexion = con.getconectar();

        try {
            ps = conexion.prepareStatement("delete from producto where idProducto=?");
            ps.setInt(1, producto.getIdProducto());

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
    
    

}
