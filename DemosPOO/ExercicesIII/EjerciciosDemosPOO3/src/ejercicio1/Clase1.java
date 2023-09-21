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
public class  Clase1 {
    private int p1 = 0;
    private int p2 = 0;
        
    public Clase1(int p1, int p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public void modificar (int i){
        p1 = p1 + i;
        p2 = p2 + i;
        System.out.println("P1 = " + p1 + " y P2 = " + p2);
    }
}