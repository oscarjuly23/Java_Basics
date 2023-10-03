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
public class Alquiler {
    private String DNI;
    private int codigo_serie;
    private int num_temporada;
    private int capitulo;
    private float precio;

    public Alquiler(String DNI, int codigo_serie, int num_temporada, int capitulo, float precio) {
        this.DNI = DNI;
        this.codigo_serie = codigo_serie;
        this.num_temporada = num_temporada;
        this.capitulo = capitulo;
        this.precio = precio;
    }

    public Alquiler() {
    }

    public String getDNI() {
        return DNI;
    }

    public int getCodigo_serie() {
        return codigo_serie;
    }

    public int getNum_temporada() {
        return num_temporada;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "DNI=" + DNI + ", codigo_serie=" + codigo_serie + ", num_temporada=" + num_temporada + ", capitulo=" + capitulo + ", precio=" + precio + '}';
    }
    
}
