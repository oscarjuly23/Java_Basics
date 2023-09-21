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
public class ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fact = factorial(5);
        System.out.println("El factorial es = " + fact);
    }

    public static int factorial(int n) {
        if (n == 0) {
            System.out.println("n = 0 devuelve 1");
            return 1;
        } else {
            System.out.println("n = " + n + " Llamada factorial de = " + (n - 1));
            return n * factorial(n - 1);
        }
    }

}
