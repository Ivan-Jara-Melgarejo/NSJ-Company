package Controlador;

import ConexionBD.Conexion;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Ventas;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;

public class ControladorVentas {

    Conexion con = new Conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean buscarProducto(Producto producto) {
        Connection conexion = con.getconectar();

        try {

            ps = conexion.prepareStatement("select codigoI,nombre,precio,stock from producto where codigoI=?");
            ps.setString(1, producto.getCodigoI());
            rs = ps.executeQuery();

            if (rs.next()) {
                producto.setCodigoI(rs.getString("codigoI"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock(rs.getInt("stock"));
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

    public boolean buscarCliente(Cliente cliente) {

        Connection conexion = con.getconectar();
        String SQL_BUSCAR = "SELECT rut,nombre,apellido,telefono,direccion,correo FROM cliente WHERE rut=?";

        try {
            ps = conexion.prepareStatement(SQL_BUSCAR);
            ps.setString(1, cliente.getRut());
            rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setRut(rs.getString("rut"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCorreo(rs.getString("correo"));

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

    public boolean insertar(Ventas ventas) {

        try {
            Connection conexion = con.getconectar();

            ps = conexion.prepareStatement("insert into detalle_venta (id_personal,idTipo_Documento,idProducto,fecha,cantidad,precioUnitario,subtotal,descuento,iva,totalPagar) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, ventas.getIdPersonal());
            ps.setInt(2, ventas.getIdTipoDeDocumento());
            ps.setInt(3, ventas.getIdProducto());
            ps.setDate(4, (Date) ventas.getFecha());
            ps.setInt(5, ventas.getCantidad());
            ps.setInt(6, ventas.getPrecioUnitario());
            ps.setInt(7, ventas.getSubtotal());
            ps.setInt(8, ventas.getDescuento());
            ps.setInt(9, ventas.getIva());
             ps.setInt(10, ventas.getTotalAPagar());
            ps.executeUpdate();

            return false;
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        }
    }
}
