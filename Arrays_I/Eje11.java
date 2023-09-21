/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_uf1_arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje11 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
    
        int[] v = new int[10];
        int[] v1 = new int[10];

        //introduir valors al vector SEMPRE IGUAL!
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introdueix element " + (i + 1) + " = ");
            cadena = br.readLine();
            v[i] = Integer.parseInt(cadena);
        }        
        //imprimir v:
        for (int i = 0; i < v.length; i++) {            
            v1[i] = v[i] * 2;
            System.out.println("v[" + (i + 1) + "] = " + v1[i]);
        }
        
            br.close();
    }

}
