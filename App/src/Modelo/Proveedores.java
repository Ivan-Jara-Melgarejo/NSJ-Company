
package Modelo;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class Proveedores {
    private int idEmpresa;
    private String nombreEmpresa;
    private String direccion;
    private int numeroTelefono;
    private String correo;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombreEmpresa ;
    }
    
    public Vector<Proveedores> mostrarProveedores(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector<Proveedores> vectorProveedores = new Vector<Proveedores>();
        Proveedores proveedores = null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("select * from proveedores");
            rs = ps.executeQuery();
            
            proveedores = new Proveedores();
            proveedores.setIdEmpresa(0);
            proveedores.setNombreEmpresa("--Seleccione--");
            vectorProveedores.add(proveedores);
            
            while(rs.next()){
                proveedores = new Proveedores();
                proveedores.setIdEmpresa(rs.getInt("idProveedores"));
                proveedores.setNombreEmpresa(rs.getString("nombre"));
                vectorProveedores.add(proveedores);
            }
            rs.close();
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        return vectorProveedores;
    }
  
    
}
