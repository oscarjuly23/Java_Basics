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
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float [] [] notas = new float [6][3];
        
        for (int posF = 0; posF < notas.length; posF++) {
            System.out.println("\nLos valores que hay en la fila " + posF + " son: \n");
            for (int posC = 0; posC < notas[posF].length; posC++) {
                System.out.println("\n El valor que hay en la columna " + posC + " es "
                    + notas[posF][posC]);
                          
            }
            
        }
    }
    
}
