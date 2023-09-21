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
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] m = new int[5][8];
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {
                m[fila][columna] = fila + columna;
                System.out.print(m[fila][columna] + " ");                
            }
            System.out.println("");
        }
    }
    
}
