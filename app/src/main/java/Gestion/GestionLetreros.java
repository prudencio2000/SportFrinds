package Gestion;

import android.graphics.drawable.Drawable;

import com.example.sportfrinds.Conexion;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;


import Entidad.Letrero;
import Entidad.Ruta;

/**
 * @author Prudencio Chaparro Gonzalez y Carlos Garcia Tello
 * GestionLetreros: Clase que nos pemite gestionar la informacion de los letreros
 *
 */
public class GestionLetreros {
    /**
     * listadoLetrero: metodo que nos guardar en una array list todos los datos del letreos
     * @return ArrayList de tipo letrero
     */
    public ArrayList<Letrero> listadoLetrero(){
        int numero=0;
        String datos=Conexion.GET_REQUEST("http://10.0.2.2/PhpProject1/script/listadoLetreroRuta.php","");
        ArrayList<Letrero> letreros=new ArrayList<>();

        try {
            JSONArray jaDatos=new JSONArray(datos);
            numero=jaDatos.length();
            for (int i=0; i<jaDatos.length();i++){
                JSONObject objet=(JSONObject) jaDatos.get(i);
                String descripcion= (String) objet.get("descripcion");
                String horario_inicial=(String) objet.get("horario_inicial");
                String horario_final=(String) objet.get("horario_final");
                String nombreRuta=(String) objet.get("nombreRuta");
                String localidad=(String) objet.get("localidad");
                Letrero letrero=new Letrero(descripcion,horario_inicial,horario_final,new Ruta(nombreRuta,localidad));
                letreros.add(letrero);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return letreros;
    }
    /**
     * listadoLetrero: metodo que nos guardar en una array list todos los datos del letreos de una zona.
     * @return ArrayList de tipo letrero
     */
    public ArrayList<Letrero> listadoLetreroZona(){
        int numero=0;
        String datos=Conexion.GET_REQUEST("http://10.0.2.2/PhpProject1/script/listadoLetreroRuta.php","");
        ArrayList<Letrero> letreros=new ArrayList<>();

        try {
            JSONArray jaDatos=new JSONArray(datos);
            numero=jaDatos.length();
            for (int i=0; i<jaDatos.length();i++){
                JSONObject objet=(JSONObject) jaDatos.get(i);
                String descripcion= (String) objet.get("descripcion");
                String horario_inicial=(String) objet.get("horario_inicial");
                String horario_final=(String) objet.get("horario_final");
                String nombreRuta=(String) objet.get("nombreRuta");
                String localidad=(String) objet.get("localidad");
                Letrero letrero=new Letrero(descripcion,horario_inicial,horario_final,new Ruta(nombreRuta,localidad));
                letreros.add(letrero);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return letreros;

    }
}
