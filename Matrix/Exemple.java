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
public class Exemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] m = new int[2][3];

        //assignar valor a la matriu
        for (int fila = 0; fila < m.length; fila++) {
            System.out.println("Fila = " + fila);

            for (int columna = 0; columna < m[fila].length; columna++) {
                System.out.println("\tFila " + fila + " Columna = " + columna);
                m[fila][columna] = 3 * fila;
            }
        }

        //IMPRIMIR MATRIU
        System.out.println("Imprimir matriu");
        for (int fila = 0; fila < m.length; fila++) {

            for (int columna = 0; columna < m[fila].length; columna++) {
                System.out.println("m[" + fila + "][" + columna + "]= " + m[fila][columna]);

            }

        }
    }

}
