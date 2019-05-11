package Entidad;

import android.text.Editable;

public class Usuario {

    private String nombre;
    private String apellidos;
    private String nombreUsuario;
;
    private String telefono;
    private String mail;
    private String localidad;
    private String dni;
    private String contrasena;
    private String tipo;

    public Usuario(){

    }
    public Usuario(String nombreUsuario, String contrasena, String tipo, String dni){
        this.nombreUsuario=nombreUsuario;
        this.contrasena=contrasena;
        this.tipo=tipo;
        this.dni=dni;

    }
    public Usuario(String nombre, String apellidos,String nombreUsuario,String telefono,String mail,String localidad,String dni,String contrasena,String tipo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nombreUsuario=nombreUsuario;
        this.telefono=telefono;
        this.mail=mail;
        this.localidad=localidad;
        this.dni=dni;
        this.contrasena=contrasena;
        this.tipo=tipo;
    }
    public Usuario(String nombreUsuario, String contrasena){
        this.nombreUsuario=nombreUsuario;
        this.contrasena=contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getApellidos() {
        return apellidos;
    }
}
