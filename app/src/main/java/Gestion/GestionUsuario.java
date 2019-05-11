package Gestion;



import com.example.sportfrinds.Conexion;
import com.example.sportfrinds.Parametro;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Entidad.Usuario;

public class GestionUsuario {
    /*public Boolean login(Usuario usuario){
        return Boolean.valueOf(Conexion.GET_REQUEST(Parametro.LOGIN,"user="+usuario.getNombreUsuario()+"&password="+usuario.getContrasena()));
    }*/
    public Usuario login(Usuario usuario){
        String datos=Conexion.GET_REQUEST(Parametro.LOGIN,"user="+usuario.getNombreUsuario()+"&password="+usuario.getContrasena());

        try {
            JSONArray jaDatos=new JSONArray(datos);

            for (int i=0; i<jaDatos.length();i++){
                JSONObject objet=(JSONObject) jaDatos.get(i);
                String nombreUsuario= (String) objet.get("usuario");
                String contrasena=(String) objet.get("pass");
                String tipo=(String) objet.get("tipo");
                String dni=(String) objet.get("dni");
                Usuario usuario1=new Usuario(nombreUsuario,contrasena,tipo,dni);
                return usuario1;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;

    }
    public Boolean registrarse(Usuario usuario){

        return Boolean.valueOf(Conexion.GET_REQUEST("http://10.0.2.2/PhpProject1/script/insertarUsuario.php","dni="+usuario.getDni()+"&nombre="+usuario.getNombre()+"&apellidos="+usuario.getApellidos()
        +"&nombreUsuario="+usuario.getNombreUsuario()+"&telefono="+usuario.getTelefono()+"&mail="+usuario.getMail()+"&contrasena="+usuario.getContrasena()+"&localidad="+usuario.getLocalidad()+"&tipo="+usuario.getTipo()));
    }
}
