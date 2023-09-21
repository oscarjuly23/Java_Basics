/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Alumne
 */
public class multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println(multiplicacio(2, 3));
        System.out.println(mult(2, 3));

    }

    public static int mult(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + mult(a, b - 1);
        }
    }
}
