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
public class Cliente {

    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private boolean abonado;

    public Cliente(String DNI, String nombre, String apellido1, String apellido2, int abonado) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        if (abonado == 1) {
            this.abonado = true;
        } else {
            this.abonado = false;
        }
    }

    public Cliente() {
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public boolean isAbonado() {
        return abonado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", abonado=" + abonado + '}';
    }

}
