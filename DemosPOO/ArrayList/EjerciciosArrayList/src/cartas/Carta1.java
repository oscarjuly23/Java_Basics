/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartas;


public class Carta1 {
    private String palo;
    private int numero;
    private int random;

    public Carta1() {
    }

    public Carta1(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public float getPuntuacion(){
        if (numero <= 7) return numero;
        else return 0.5f;
    }    
    
    @Override
    public String toString() {
        return "sieteymiedo{" + "palo=" + palo + ", numero=" + numero + '}';
    }


}
