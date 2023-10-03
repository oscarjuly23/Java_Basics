/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaris;

import java.io.Serializable;

/**
 *
 * @author Alumne
 */
public class Producto implements Serializable {

    private int codigo;
    private String nommbre;
    private double precio;

    public int getCodigo() {
        return codigo;
    }

    public String getNommbre() {
        return nommbre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(int codigo, String nommbre, double precio) {
        this.codigo = codigo;
        this.nommbre = nommbre;
        this.precio = precio;
    }

}
