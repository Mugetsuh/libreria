/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

/**
 *
 * @author Germán
 */
public class Libro {
    
    private char nombre;
    
    private char autor;
    
    private char editoria;
    
    private char genero;
    
    private float version;
    
    private long valorLibro;

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getAutor() {
        return autor;
    }

    public void setAutor(char autor) {
        this.autor = autor;
    }

    public char getEditoria() {
        return editoria;
    }

    public void setEditoria(char editoria) {
        this.editoria = editoria;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public long getValorLibro() {
        return valorLibro;
    }

    public void setValorLibro(long valorLibro) {
        this.valorLibro = valorLibro;
    }

    public Libro(char nombre, char autor, char editoria, char genero, float version, long valorLibro) {
        this.nombre = nombre;
        this.autor = autor;
        this.editoria = editoria;
        this.genero = genero;
        this.version = version;
        this.valorLibro = valorLibro;
    }   
    
    
}
