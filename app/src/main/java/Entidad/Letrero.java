package Entidad;





public class Letrero {
    private int idLetrero;
    private String descripcion;
    private String horario_inicial;
    private String horario_final;

    private Ruta ruta;

    public Letrero(){

    }
    public Letrero(String descripcion, String horario_inicial, String horario_final, Ruta ruta){
        this.descripcion=descripcion;
        this.horario_inicial=horario_inicial;
        this.horario_final=horario_final;

        this.ruta=ruta;
    }

    public int getIdLetrero() {
        return idLetrero;
    }

    public void setIdLetrero(int idLetrero) {
        this.idLetrero = idLetrero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario_inicial() {
        return horario_inicial;
    }

    public void setHorario_inicial(String horario_inicial) {
        this.horario_inicial = horario_inicial;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }



    @Override
    public String toString() {
        return "Letrero{" +
                "idLetrero=" + idLetrero +
                ", descripcion='" + descripcion + '\'' +
                ", horario_inicial='" + horario_inicial + '\'' +
                ", horario_final='" + horario_final + '\'' +
                ", ruta=" + ruta +
                '}';
    }
}
