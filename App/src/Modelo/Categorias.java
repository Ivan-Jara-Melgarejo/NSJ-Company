
package Modelo;

import ConexionBD.Conexion;
import java.util.Vector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;



public class Categorias {
    private int idCategoria;
    private String nombre;
    private int idFiltro;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdFiltro() {
        return idFiltro;
    }

    public void setIdFiltro(int idFiltro) {
        this.idFiltro = idFiltro;
    }
    

    @Override
    public String toString() {
        return this.nombre;
    }
    
    public Vector<Categorias> mostrarCategorias(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector<Categorias> vectorCategorias = new Vector<Categorias>();
        Categorias categoria = null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("select * from categoria");
            rs = ps.executeQuery();
            
            categoria = new Categorias();
            categoria.setIdCategoria(0);
            categoria.setNombre("--Seleccione--");
            vectorCategorias.add(categoria);
            
            while(rs.next()){
                categoria = new Categorias();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setNombre(rs.getString("nombre"));
                vectorCategorias.add(categoria);
            }
            rs.close();
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        return vectorCategorias;
    }
     
    public Vector<Categorias> mostrarCategoriasXtabla(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector<Categorias> vectorCategorias = new Vector<Categorias>();
        Categorias categoria = null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();
            
            ps = conexion.prepareStatement("select * from categoria");
            rs = ps.executeQuery();
            
            categoria = new Categorias();
            categoria.setIdCategoria(0);
            categoria.setNombre("--Todos--");
            vectorCategorias.add(categoria);
            
            while(rs.next()){
                categoria = new Categorias();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setNombre(rs.getString("nombre"));
                vectorCategorias.add(categoria);
            }
            rs.close();
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        return vectorCategorias;
    }
    
}
