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

public class Registro extends AppCompatActivity {
    /**
     * GESTION_USUARIO: objeto de la clase gestion usuario.
     */
    private final static GestionUsuario GESTION_USUARIO=new GestionUsuario();
    /**
     * Atributos:
     */

    /**
     * nombre: atributo que contiene el nombre del usuario.
     * apellido:atributo que contiene el apellido del usuario.
     * dni: atributo que contiene el dni del usuario.
     * nombreUsuario: atributo que contiene el nombre del usuario.
     * telefono: atributo que contiene el numero del telefono del usuario.
     * email: atributo que contiene el email del usuario del usuario.
     * contrasena:atributo que contiene la contrasena del usuario.
     * localidad:atributo qeu contiene la localidad del usuario.
     */
    private EditText nombre;
    private EditText apellido;
    private EditText dni;
    private EditText nombreUsuario;
    private EditText telefono;
    private EditText email;
    private EditText contrasena;
    private EditText localidad;
    private Button registarse;
    private Button cancelar;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre=(EditText) findViewById(R.id.txtNombre);
        apellido=(EditText) findViewById(R.id.txtApellidos);
        dni=(EditText) findViewById(R.id.txtDni);
        nombreUsuario=(EditText) findViewById(R.id.txtNombreUsuario);
        telefono=(EditText) findViewById(R.id.txtTelefono);
        email=(EditText) findViewById(R.id.txtEmail);
        contrasena=(EditText) findViewById(R.id.txtContrasena);
        localidad=(EditText) findViewById(R.id.txtLocalidad);
        registarse=(Button) findViewById(R.id.btnRegistrarse);
        cancelar=(Button) findViewById(R.id.btnCancelar);

    }

    /**
     * registrarse:metodo que permite al usuario registrar si cumple con los requisitos necesarios.
     * @param view
     */

    public void registrarse(View view){

       String nombre,apellido,dni,nombreUsuario,telefono,email,contrasena,localidad,tipo;//Atributos.
        //Asignar valor a atributos
       nombre=this.nombre.getText().toString();
       apellido=this.dni.getText().toString();
       dni=this.dni.getText().toString();
       nombreUsuario=this.nombreUsuario.getText().toString();
       telefono=this.telefono.getText().toString();
       email=this.email.getText().toString();
       contrasena=this.contrasena.getText().toString();
       localidad=this.localidad.getText().toString();
       tipo="cliente";

       Usuario usuario=new Usuario(nombre,apellido,nombreUsuario,telefono,localidad,email,dni,contrasena,tipo);

        //Controla que todo los datos esten rellenos
       if(ControlErrores.vaciar(usuario)==true){
           //Controla que el DNI contenga el formato correcto.
           if(ControlErrores.controlDni(dni)==true){
               //Controla que el telefono este en el formato correcto
               if(ControlErrores.controlTelefono(telefono)){
                   //Controla que el usuario se ha registrado correctamente.
                       if(GESTION_USUARIO.registrarse(usuario)==true){
                           Toast.makeText(getApplicationContext(),
                                   "El usuario se ha registrado correctamente", Toast.LENGTH_SHORT).show();
                       }
                       //muestra mensaje de error si no se ha registrado correctamente
                       else{
                           Toast.makeText(getApplicationContext(),
                                   "Error al registrar el nombre o el apellido contiene una letra", Toast.LENGTH_SHORT).show();
                       }


               }
               //muestra mensjae de error si no se ha introducido el telefono correctamente.
               else {
                   Toast.makeText(getApplicationContext(),
                           "Error al introducir el telefono. Un ejemplo  empezar 6,7 o 9  y debe contener 8 digito", Toast.LENGTH_SHORT).show();
               }

           }
           //muestra un mensaje de error si no se ha introducido el dni correctamente.
           else{
               Toast.makeText(getApplicationContext(),
                       "Error al introducir el DNI un ejemplo 12345678P", Toast.LENGTH_SHORT).show();
           }

       }
       //muestra un mensaje de errro si no se ha rellenado todos los campo.
       else{

           Toast.makeText(getApplicationContext(),
                   "Tienes un campo vacio los tienes que rellenar todos", Toast.LENGTH_SHORT).show();
       }


    }
    public void cancelar(View view){
        nombre.setText("");
        apellido.setText("");
        dni.setText("");
        nombreUsuario.setText("");
        telefono.setText("");
        email.setText("");
        contrasena.setText("");
        localidad.setText("");
        Intent inicio = new Intent(getApplicationContext(), Inicio.class);
        startActivity(inicio);
    }
}
