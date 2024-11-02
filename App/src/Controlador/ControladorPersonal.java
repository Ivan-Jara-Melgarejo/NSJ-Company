
package Controlador;


import ConexionBD.Conexion;
import Modelo.Personal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorPersonal {
      
    public boolean iniciarSesion(Personal personal){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("select u.id,u.nombreUsuario,u.NAtendedor,u.contraseña,u.nombre,u.idTipo_usuario,t.nombre from personal as u inner join tipo_usuario as t on u.idTipo_usuario = t.id where nombreUsuario=?");
            ps.setString(1, personal.getNombreUsuario());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(personal.getContraseña().equals(rs.getString("contraseña"))){
                    
                    ps = conexion.prepareStatement("update personal set ultima_sesion=? where id=?");
                    ps.setString(1, personal.getUltima_sesion());
                    ps.setInt(2, rs.getInt("id"));
                    ps.executeUpdate();
                    
                    personal.setId(rs.getInt("u.id"));
                    personal.setNombre(rs.getString("u.nombre"));
                    personal.setIdTipo_usuario(rs.getInt("u.idTipo_usuario"));
                    personal.setNombreRol(rs.getString("t.nombre"));
                    personal.setNAtendedor(rs.getInt("u.NAtendedor"));
                    return true;
                }
            }
            else{
                    return false;
                }
            return false;
        }catch(Exception ex){
            System.err.println("Error, "+ex);
            return false;
        }
        
    }
    
    public boolean registrar(Personal personal){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        
        
        
        try{
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("insert into personal (nombreUsuario,NAtendedor,contraseña,nombre,correo,fecha_ingreso,idTipo_usuario,salario) values (?,?,?,?,?,?,?,?)");
            ps.setString(1, personal.getNombreUsuario());
            ps.setInt(2, personal.getNAtendedor());
            ps.setString(3, personal.getContraseña());
            ps.setString(4, personal.getNombre());
            ps.setString(5, personal.getCorreo());
            ps.setDate(6, (Date) personal.getFechaIngreso());
            ps.setInt(7, personal.getIdTipo_usuario());
            ps.setDouble(8, personal.getSalario());
            ps.executeUpdate();
            
        return false;
        }catch(Exception ex){
            return false;
        }
    }
    
    public int verificarUsuario(String personal){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("select count(id) from personal where nombreUsuario=?");
            ps.setString(1, personal);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }catch(Exception ex){
            return 1;
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
