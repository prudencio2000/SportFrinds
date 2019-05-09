package Gestion;



import com.example.sportfrinds.Conexion;

import Entidad.Usuario;

public class GestionUsuario {
    public Boolean login(Usuario usuario){
        return Boolean.valueOf(Conexion.GET_REQUEST("http://10.0.2.2/PhpProject1/script/login.php","user="+usuario.getNombreUsuario()+"&password="+usuario.getContrasena()));
    }
    public Boolean registrarse(Usuario usuario){

        return Boolean.valueOf(Conexion.GET_REQUEST("http://10.0.2.2/PhpProject1/script/insertarUsuario.php","dni="+usuario.getDni()+"&nombre="+usuario.getNombre()+"&apellidos="+usuario.getApellidos()
        +"&nombreUsuario="+usuario.getNombreUsuario()+"&telefono="+usuario.getTelefono()+"&mail="+usuario.getMail()+"&contrasena="+usuario.getContrasena()+"&localidad="+usuario.getLocalidad()+"&tipo="+usuario.getTipo()));
    }
}
