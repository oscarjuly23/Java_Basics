/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_v10_oscar_julian;

/**
 *
 * @author Alumne
 */
public class Serie {
    private int ID;
    private String nombre;
    private int numero_temporadas;
    private int capitulos_temporadas;
    private float precio;
    private boolean esPremium;

    public Serie(int ID, String nombre,int numero_temporadas, int capitulos_temporadas, float precio, int esPremium) {
        this.ID = ID;
        this.nombre = nombre;
        this.numero_temporadas = numero_temporadas;
        this.capitulos_temporadas = capitulos_temporadas;
        this.precio = precio;
         if (esPremium == 1) {
            this.esPremium = true;
        } else {
            this.esPremium = false;
        }
    }

    public Serie() {
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    public int getCapitulos_temporadas() {
        return capitulos_temporadas;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isEsPremium() {
        return esPremium;
    }

    @Override
    public String toString() {
        return "Serie{" + "ID=" + ID + ", nombre=" + nombre + ", numero_temporadas=" + numero_temporadas + ", capitulos_temporadas=" + capitulos_temporadas + ", precio=" + precio + ", esPremium=" + esPremium + '}';
    }
    
}
