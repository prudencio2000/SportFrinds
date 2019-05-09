package com.example.sportfrinds;

import android.graphics.drawable.Drawable;

public class EstiloView {

    private String titulo;

    private String description;
    private String horario_inicio;
    private String horario_final;
    private String localizacion;
    public EstiloView(){

    }
    public EstiloView(String titulo, String description, String horario_inicio, String horario_final,String localidad) {
        super();
        this.titulo = titulo;
        this.description = description;
        this.horario_inicio=horario_inicio;
        this.horario_final=horario_final;
        this.localizacion=localidad;

    }

    public String getTitulo() {

        return titulo;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}


