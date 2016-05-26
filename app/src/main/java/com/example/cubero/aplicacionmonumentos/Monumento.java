package com.example.cubero.aplicacionmonumentos;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.io.Serializable;

/**
 * Created by Cubero on 22/05/2016.
 */
public class Monumento implements Serializable{
    private String nombre;
    private String descripcion;
    private int id;


    public Monumento(String nombre, String descripcion,int id) {
        setNombre(nombre);
        setDescripcion(descripcion);
        setId(id);
            }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n  Descripcion:"+this.getDescripcion();
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
