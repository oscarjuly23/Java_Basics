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
public class mcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(mcd(412, 184));
    }

    public static int mcd(int a, int b) {
        if (a == b) { //caso base
            return a;
        } else if (a > b) {
            return mcd(a - b, b);
        } else {
            return mcd(a, b - a);
        }
    }

}
