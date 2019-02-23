/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

import java.util.Date;

/**
 * Clase que se encarga de manejar la compra de libros de la biblioteca por parte de los clientes
 * @author Germán
 */
public class Factura {
    
    /**
     * Variable que almacena la fecha de la compra
     */
    private Date fecha;
    
    /**
     * Variable que almacena el id del cliente que efectúa la compra
     */
    private int idCliente;
    
    /**
     * Variable que almacena el id del libro a comprar
     */
    private int idLibro;
    
    /**
     * Variable que almacena la cantidad de libros a comprar
     */
    private int cantidadLibro;
    
    /**
     * Variable que almacena el valor total de la compra
     */
    private long valorTotLibro;

    /**
     * Constructor que recibe los parametros necesarios para inicializar un objeto de esta clase
     * @param fecha
     * @param idCliente
     * @param idLibro
     * @param cantidadLibro
     * @param valorTotLibro 
     */
    public Factura(Date fecha, int idCliente, int idLibro, int cantidadLibro, long valorTotLibro) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idLibro = idLibro;
        this.cantidadLibro = cantidadLibro;
        this.valorTotLibro = valorTotLibro;
    }

    /**
     * Método para obtener la fecha de la factura
     * @return la fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método para asignar la fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método para obtener el id del cliente
     * @return el id del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Método para asignar el id del cliente
     * @param idCliente 
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Método para obtener el id del libro
     * @return el id del libro
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * Método para asignar el id del libro
     * @param idLibro 
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    /**
     * Método para obtener cantidad de libros a facturar
     * @return la cantidad(número) de libros
     */
    public int getCantidadLibro() {
        return cantidadLibro;
    }

    /**
     * Método para asignar cantidad de libros a facturar
     * @param cantidadLibro 
     */
    public void setCantidadLibro(int cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }

    /**
     * Método para obtener el precio total de los libros a facturar
     * @return el precio del todos los libros de la factura
     */
    public long getValorTotLibro() {
        return valorTotLibro;
    }

    /**
     * Método para asignar el precio total de los libros a facturar
     * @param valorTotLibro 
     */
    public void setValorTotLibro(long valorTotLibro) {
        this.valorTotLibro = valorTotLibro;
    }
    
    /**
     * Método para agregar un libro a la factura
     */
    public void agragarLibro(){
    
    }   
    
    /**
     * Método para modoficar un libro de la factura
     */
    public void modificarLibro(){
        
    }
    
    /**
     * Método para eliminar un libro a la factura
     */
    public void eliminarLibro(){
    
    }
    
    /**
     * Método para consultar los libros de una factura
     */
    public void consultarLibro(){
        
    }
}
