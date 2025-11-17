/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Registro {
       
    
    
 String ciudad;
 
 Date fecha;
 
 int Tminima;
 
 int Tmaxima;
 
 int media;
 
 String temporada;

    public Registro(String ciudad, Date fecha, int Tminima, int Tmaxima, int media, String temporada) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.Tminima = Tminima;
        this.Tmaxima = Tmaxima;
        this.media = media;
        this.temporada = temporada;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTminima() {
        return Tminima;
    }

    public void setTminima(int Tminima) {
        this.Tminima = Tminima;
    }

    public int getTmaxima() {
        return Tmaxima;
    }

    public void setTmaxima(int Tmaxima) {
        this.Tmaxima = Tmaxima;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
 
 
 

   
    
    
    
}
