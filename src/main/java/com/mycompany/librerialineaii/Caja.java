/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

/**
 * Clase con la cual se administra el dinero en caja de la librería
 * @author Germán
 *
 */
public class Caja {

    /**
     * Variable que almacena la cantidad de dinero que hay en caja
     */
    private int cantidad;
    
    /**
     * Método para obtener el dinero disponible en caja
     * @return el dinero que hay en caja
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * Método para asigar el dinero disponible en caja
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Constructor que recibe el paranetro necesario para inicializar un objeto de esta clase
     * @param cantidad 
     */
    public Caja(int cantidad) {
        this.cantidad = cantidad;
    }   

}
