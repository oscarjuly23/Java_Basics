/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Alumne
 */

public class factura {
    private String id;
    private String descripcion;
    private int cantidad;
    private double preciounidad;

    public factura (String id, String descripcion, int cantidad, double preciounidad) {
    this.id=id;
    this.descripcion=descripcion;
    this.cantidad=cantidad;
    this.preciounidad=preciounidad;
    }
    public String getID(){
    return id;
    }
    public String getDescripcion(){
    return descripcion;
    }
    public int getCantidad() {
    return cantidad;
    }
    public void setCantidad(int cantidad){
    this.cantidad=cantidad;
    }
    public double getprecioUnitario(){
    return preciounidad;
    }
    public void setPrecioUnitario(double preciounidad){
    this.preciounidad=preciounidad;
    }
    public double getTotal(){
    return (cantidad*preciounidad);
    }
    public String toString(){
    return "Item Factura[id= " + id + ",cantidad= " + cantidad + ",preciounidad= " + preciounidad + "]";
    }
}