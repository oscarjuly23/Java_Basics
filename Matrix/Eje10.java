/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje10 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int i,j;
        boolean com;
        com = true;
        
        System.out.println("Cuantas filas vols?");
        cadena = br.readLine();
        i = Integer.parseInt(cadena);
        
        System.out.println("Cuantas columnas vols?");
        cadena = br.readLine();
        j = Integer.parseInt(cadena);
        
        int [][] m = new int[i][j];
        
          for (int fila = 0; fila < m.length; fila++) {
            System.out.println("Fila = " + fila);
            for (int columna = 0; columna < m[fila].length; columna++) {
                System.out.println("Columna " + columna + ": ");
                cadena = br.readLine();
                m[fila][columna] = Integer.parseInt(cadena);
            }
        }
          
          for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {
                if (m[fila][columna] + m[fila][columna] < 0) {
                    com = false;
                }
            }
          }           
                        
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                
                System.out.print(m[f][c] + " ");                
            }
            System.out.println("");
        }
        
       if (com == true) {
           System.out.println("Positiva");
       } else {
           System.out.println("No es positiva");
       }
        
        br.close();
    }
    
}
