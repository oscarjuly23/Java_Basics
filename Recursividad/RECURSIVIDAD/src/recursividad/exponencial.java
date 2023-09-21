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
public class exponencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(exponencial(5, 3));

    }

    public static int exponencial(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * exponencial(a, b - 1);
        }
    }
}
