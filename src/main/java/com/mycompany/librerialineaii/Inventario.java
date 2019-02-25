/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

import java.util.List;

/**
 * Clase que se encarga del manejo de todos los libros de la biblioteca
 * @author Germán
 */
public class Inventario {
    
    /**
     * objeto que almacena la lista de libros de la librería
     */
    List<Libro> listaLibros;
    
    /**
     * Constructor que recibe los parametros necesarios para inicializar un objeto de esta clase
     * @param listaLibros 
     */
    public Inventario(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * Método para obtener la lista de libros
     * @return 
     */
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * Método para asignar la lista de libros
     * @param listaLibros 
     */
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    /**
     * Método para agregar un libro
     */
    public void ingresarLibro(){
        
    }
    
    /**
     * Método para modificar un libro
     */
    public void modificarLibro(){
        
    }
    
    /**
     * Método para eliminar un libro
     */
    public void eliminarLibro(){
        
    }
    
    /**
     * Método para consultar libros
     */
    public void consultarLibro(){
        
    }
}
