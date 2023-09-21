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
public class Eje9 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        boolean esNula;

        int[][] m = new int[2][5];
        for (int i = 0; i < m.length; i++) {
            System.out.println("Fila = " + i);
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Columna " + j + ": ");
                cadena = br.readLine();
                m[i][j] = Integer.parseInt(cadena);
            }
        }

        esNula = true;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0) {
                    esNula = false;
                }
            }
        }

        if (esNula == true) {
            System.out.println("La matriz es nula");
        } else {
            System.out.println("La matriz no es nula");
        }

        br.close();
    }

}
