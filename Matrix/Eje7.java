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
public class Eje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [][] m = {{1,2,3,4,5}, {5,6,7,8,9}, {3,4,5,6,7}};
  
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {
                System.out.println("m[" + fila + "][" + columna + "]= " + m[fila][columna]);
            }
        }
        int sumaf=0;
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {
                sumaf += m[fila][columna];
                }
            System.out.println("Fila " + fila + " = " + sumaf);
            sumaf=0;
        }
        int sumac=0;
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m.length; columna++) {
                sumac += m[columna][fila];
                }
            System.out.println("Columna " + fila + " = " + sumac);
            sumac=0;
        }
        
    }
}
