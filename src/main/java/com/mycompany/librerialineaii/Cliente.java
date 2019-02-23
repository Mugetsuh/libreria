/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

/**
 * Clase que se encarga de el manejo de los usuaios clientes en la aplicación
 * @author Germán
 */
public class Cliente {
    
    /**
     * Almacena el nombre del cliente
     */
    private String nombre;
    
    /**
     * Almacena el número de documento del cliente
     */
    private long documento;
    
    /**
     * Almacena el correo del cliente
     */
    private String correo;
    
    /**
     * Almacena el teléfono del cliente
     */
    private long telefono;
    
    /**
     * Almacena la dirección de residencia del cliente
     */
    private String direccion;

    /**
     * Constructor que recibe los parametros necesarios para inicializar un objeto de esta clase
     * @param nombre
     * @param documento
     * @param correo
     * @param telefono
     * @param direccion 
     */
    public Cliente(String nombre, long documento, String correo, long telefono, String direccion) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Método para obtener el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método para asignar el nombre del cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método para onbeter el número de documento
     * @return el número de documento
     */
    public long getDocumento() {
        return documento;
    }
    
    /**
     * Método para asignar el número de documento
     * @param documento 
     */
    public void setDocumento(long documento) {
        this.documento = documento;
    }

    /**
     * Método para obtener el correo de un cliente
     * @return el correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método para asignar el correo a un cliente
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método para obtener el número telefónico de un cliente
     * @return el número de teléfono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * Método para asignar el número telefónico
     * @param telefono 
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener la dirección de residencia
     * @return la dirección de residencia
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método para asignar la dirección de residencia
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método para agregar un cliente
     */
    public void agregarCliente(){
        
    }
    
    /**
     * Método para modificar un cliente
     */
    public void modificarCliente(){
    
    }
    
    /**
     * Método para eliminar un cliente
     */
    public void EliminarCliente(){
        
    }
    
    /**
     * Método para consultar un cliente
     */
    public void consultarCliente(){
        
    }
    
}
