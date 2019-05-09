package Entidad;

public class Ruta {
    private int id_ruta;
    private String codigo_postal;
    private String nombre_ruta;
    private String localidad;

    public Ruta(){

    }
    public Ruta(String nombre_ruta,String localidad){
        this.nombre_ruta=nombre_ruta;
        this.localidad=localidad;

    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(String nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "id_ruta=" + id_ruta +
                ", codigo_postal='" + codigo_postal + '\'' +
                ", nombre_ruta='" + nombre_ruta + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
