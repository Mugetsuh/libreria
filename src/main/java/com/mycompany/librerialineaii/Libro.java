/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

/**
 * Clase encargada de almacenar la información de los libros
 * @author Germán
 */
public class Libro {
    
    /**
     * Variable que almacena el nombre del libro
     */
    private String nombre;
    
    /**
     * Variable que almacena el nombre del autor del libro 
     */
    private String autor;
    
    /**
     * Variable que almacena el nombre del la editorial del libro
     */
    private String editorial;
    
    /**
     * Variable que almacena el género del libro
     */
    private String genero;
    
    /**
     * Variable que almacena la del libro
     */
    private float version;
    
    /**
     * Variable que almacena precio unitario del libro
     */
    private long valorLibro;

    /**
     * Constructor que recibe los parametros necesarios para inicializar un objeto de esta clase
     * @param nombre
     * @param autor
     * @param editorial
     * @param genero
     * @param version
     * @param valorLibro 
     */
    public Libro(String nombre, String autor, String editorial, String genero, float version, long valorLibro) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.version = version;
        this.valorLibro = valorLibro;
    }

    /**
     * Método para obtener el nombre del libro
     * @return el nombre del libro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el nombre del libro
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el nombre del autor del libro
     * @return el nombre del autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método para asignar el nombre del libro
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método para obtener el nombre de la editorial del libro
     * @return el nombre de la editorial del libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Método para asignar el nombre de la editorial del libro
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Método para obtener el género del libro
     * @return el género del libro
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Método para asignar el género del libro
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método para obtener la versión del libro
     * @return la versión del libro
     */
    public float getVersion() {
        return version;
    }

    /**
     * Método para asignar la versión del libro
     * @param version 
     */
    public void setVersion(float version) {
        this.version = version;
    }

    /**
     * Método para obtener el precio unitario del libro
     * @return el precio unitario del libro
     */
    public long getValorLibro() {
        return valorLibro;
    }

    /**
     * Método para asignar el precio unitario del libro
     * @param valorLibro 
     */
    public void setValorLibro(long valorLibro) {
        this.valorLibro = valorLibro;
    }

}
