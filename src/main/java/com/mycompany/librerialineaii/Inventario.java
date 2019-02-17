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
public class Inventario {
    
    private int idInventario;
    
    private int cantidadInicial;
    
    private int cantidadDisponible;

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Inventario(int idInventario, int cantidadInicial, int cantidadDisponible) {
        this.idInventario = idInventario;
        this.cantidadInicial = cantidadInicial;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public void ingresarLibro(){
        
    }
    
    public void modificarLibro(){
        
    }
    
    public void eliminarLibro(){
        
    }
    
    public void consultarLibro(){
        
    }
}
