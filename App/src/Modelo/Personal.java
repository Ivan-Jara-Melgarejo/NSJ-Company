
package Modelo;

import java.util.Date;


public class Personal {
    private int id;
    private String nombreUsuario;
    private int NAtendedor;
    private String contraseña;
    private String nombre;
    private String correo;
    private Date fechaIngreso;
    private String ultima_sesion;
    private int idTipo_usuario;
    private String nombreRol;
    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNAtendedor() {
        return NAtendedor;
    }

    public void setNAtendedor(int NAtendedor) {
        this.NAtendedor = NAtendedor;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUltima_sesion() {
        return ultima_sesion;
    }

    public void setUltima_sesion(String ultima_sesion) {
        this.ultima_sesion = ultima_sesion;
    }

    public int getIdTipo_usuario() {
        return idTipo_usuario;
    }

    public void setIdTipo_usuario(int idTipo_usuario) {
        this.idTipo_usuario = idTipo_usuario;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
}
