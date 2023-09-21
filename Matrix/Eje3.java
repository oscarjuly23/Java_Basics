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
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriu = {{23, 45, 11, 2}, {67, 2}, {1, 2, 3, 4, 5, 6}};
        for (int i = 0; i < matriu.length; i++) {
            System.out.println("\n\n Los valores de la fila " + i + " son: ");
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("\n En la Columna " + j + ": " + matriu[i][j]);
                
            }
            
        }
    }
    
}
