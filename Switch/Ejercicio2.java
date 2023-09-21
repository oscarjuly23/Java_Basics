/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_UF1_SWITCH;

/**
 *
 * @author Alumne
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int s, x = 0;

        switch (x) {
            case 0:
                s = 0;

            default:
                if (x < 0) {
                    s = -1;
                } else {
                    s = 1;
                }
                System.out.println(s);
                
        }
    }
}
