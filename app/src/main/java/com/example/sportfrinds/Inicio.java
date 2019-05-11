package com.example.sportfrinds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import Entidad.Usuario;
import Gestion.GestionUsuario;

/**
 * @author Prudencio Chaparro González y Carlos García Tello
 */
public class Inicio extends AppCompatActivity {
    /**
     * Atributo;
     */
    /**
     * usuario: objeto de la clase Usuario
     * GESTION_USUARIO: objeto de la clase GestionUsuario
     * login: boton que nos permite entrar en la aplicacion
     */
    private Usuario usuario;
    private final static GestionUsuario GESTION_USUARIO=new GestionUsuario();
    private Button login;
    private Button registrar;
    private EditText nombreUsuario;
    private EditText contrasena;

    /**
     * onCreate: metodo para inicializar la varibles.
     * @param savedInstanceState objeto de la clase Bundle que se encutra en las API de Android Studio
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.boton);
        nombreUsuario=(EditText) findViewById(R.id.editText3);
        contrasena=(EditText) findViewById(R.id.editText4);
        registrar=(Button) findViewById(R.id.registrar);

    }

    /**
     * login: metodo que nos permite entrar en la aplicacion y comproeba que el usuario se ha registrado correstamente
     * @param view: objeto de la clase View de las API de Android Studio.
     */
    public void login(View view){
        usuario=new Usuario(nombreUsuario.getText().toString(),contrasena.getText().toString());
        Usuario usuario1= GESTION_USUARIO.login(usuario);
       if(usuario1!=null){//controla si el usuario existe.
           if (usuario1.getTipo().equals("administrador")){//controla si el usuario es administrador
               Toast.makeText(getApplicationContext(),
                       "Error al logearse eres un Administrador, debes entrar desde la aplicacion de Escritorio", Toast.LENGTH_SHORT).show();
           }
           if (usuario1.getTipo().equals("cliente")){//controla si el usuario es cliente o administrador
               Intent principal = new Intent(getApplicationContext(), Principal.class);
               startActivity(principal);
           }

        }else{
            Toast.makeText(getApplicationContext(),
                    "Error al iniciar Sesion la contrasenia o el usuario no es correcto.", Toast.LENGTH_SHORT).show();
        }

    }//fin del metodo

    /**
     * registrar:metodo que nos permite registrarno en la aplicacion.
     * @param view: objeto de la clase View de las API de Android Studio.
     */
    public void registrar(View view){
        Intent registro = new Intent(getApplicationContext(), Registro.class);
        startActivity(registro);
    }//fin del metodo.

}

