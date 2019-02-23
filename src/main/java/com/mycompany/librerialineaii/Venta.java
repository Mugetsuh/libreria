/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerialineaii;

import java.util.List;

/**
 * Clase que se encarga de administrar las ventas de la librería
 * @author Germán
 */
public class Venta {
    
    /**
     * Objeto que almacena la lista de faturas totales de la librería
     */
    private List<Factura> listaFacturas;
    
    /**
     * Variable que almacena el id de la factura de compra
     */
    private int idFactura;
    

    /**
     * Constructor que recibe los parametros necesarios para inicializar un objeto de esta clase
     * @param listaFacturas
     * @param idVenta
     */
    public Venta(List<Factura> listaFacturas, int idVenta) {
        this.listaFacturas = listaFacturas;
        this.idFactura = idVenta;
    }

    /**
     * Método para obtener la lista de las facturas
     * @return una lista de facturas
     */
    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    /**
     * MMétodo para asignar la lista de las facturas
     * @param listaFacturas 
     */
    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    /**
     * Método para obtener id de la factura
     * @return el id de la factura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * Método para asignar el id de la factura
     * @param idFactura 
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * Método para agregar una factura
     */
    public void agragarFactura(){
        
    }
    
    /**
     * Método para modificar una factura
     */
    public void modificarFactura(){
        
    }
    
    /**
     * Método para eliminar una factura
     */
    public void eliminarFactura(){
        
    }
    
    /**
     * Método para consultar una factura
     */
    public void consultarFactura(){
        
    }
}
