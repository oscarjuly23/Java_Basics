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
public class Imrpimir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimir(10);
    }

    public static void imprimir(int n) {

        if (n > 0) {
            imprimir(n - 1);
            System.out.print(n + " ");
        }
    }

}
