/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_matrices;

/**
 *
 * @author Alumne
 */
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] m = new int[3][3];
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {
                m[fila][columna] = fila + columna;
                System.out.print(m[fila][columna] + " ");                
            }
            System.out.println("");
        }
         System.out.println("");
        int [][] m1 = new int[3][3];
        for (int fila = 0; fila < m1.length; fila++) {
            for (int columna = 0; columna < m1[fila].length; columna++) {
                m1[fila][columna] = fila + columna;
                System.out.print(m1[fila][columna] + " ");                
            }
            System.out.println("");
        }
    }
    
}
