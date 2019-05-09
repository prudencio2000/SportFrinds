package com.example.sportfrinds;

import android.os.StrictMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Prudencio Chaparro Gonzalez y Carlos Garcia Tello
 */

/**
 * Conexion:Clase que nos permite conectar con la Base de datos SportFriends
 *
 */
public class Conexion {
    /**
     * Get_Resquiest: Metodo que nos permite enviar y recibir datos de la base de dato mediante
     * el metodo get de php.
     * @param url: Parametro que indica la url.
     * @param values: Parametro que indica la cantidad de parametro y el resultado.
     * @return resultado: Que es toda la informacion que contiene el resultado.
     */
    public static String GET_REQUEST(String url, String values) {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            StringBuilder result = new StringBuilder();
            String web = url + "?" + values;
            URL obj = new URL(web);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                result.append(inputLine);
            }
            return result.toString();

        } catch (MalformedURLException e) {
            return e.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }
}
