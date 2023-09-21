/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Alumne
 */
public class Coche {

    private int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int km_h) {
        velocidad = velocidad + km_h;
    }

    public void frenar(int km_h) {
        if (velocidad <= km_h) {
            velocidad = 0;
        } else {
            velocidad = velocidad - km_h;
        }
    }
}
