package com.example.sportfrinds;

import Entidad.Usuario;

public class ControlErrores {

    public static boolean vaciar(Usuario usuario){
        if(usuario.getTelefono().isEmpty() | usuario.getLocalidad().isEmpty() | usuario.getContrasena().isEmpty() | usuario.getMail().isEmpty() |
                usuario.getNombreUsuario().isEmpty() | usuario.getNombre().isEmpty() | usuario.getApellidos().isEmpty())
                return false;
        else
            return  true;

    }
    public static boolean controlDni(String datos){
        String patron="[0-9]{8}[A-Z]{1}";
        if(datos.matches(patron))
            return true;
        else
            return false;
    }
    public static boolean controlTelefono(String datos){
        String patron="[6,9,7]{1}[0-9]{8}";
        if(datos.matches(patron))
            return true;
        else
            return false;
    }


}
