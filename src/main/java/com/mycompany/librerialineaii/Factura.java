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
public class Factura {
    
    private long fecha;
    
    private int idFactura;
    
    private int idCliente;
    
    private int idLibro;
    
    private int cantidadLibro;
    
    private long valorUniLibro;
    
    private long valorTotLibro;

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getCantidadLibro() {
        return cantidadLibro;
    }

    public void setCantidadLibro(int cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }

    public long getValorUniLibro() {
        return valorUniLibro;
    }

    public void setValorUniLibro(long valorUniLibro) {
        this.valorUniLibro = valorUniLibro;
    }

    public long getValorTotLibro() {
        return valorTotLibro;
    }

    public void setValorTotLibro(long valorTotLibro) {
        this.valorTotLibro = valorTotLibro;
    }

    public Factura(long fecha, int idFactura, int idCliente, int idLibro, int cantidadLibro, long valorUniLibro, long valorTotLibro) {
        this.fecha = fecha;
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.idLibro = idLibro;
        this.cantidadLibro = cantidadLibro;
        this.valorUniLibro = valorUniLibro;
        this.valorTotLibro = valorTotLibro;
    }
    
    public void agragarLibro(){
    
    }   
    
    public void quitarLibro(){
    
    }
    
    public void consultarLibro(){
        
    }
}
