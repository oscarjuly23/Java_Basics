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
public class Eje10 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int num;
        boolean j = false;

        int[] v = new int[10];

        //introduir valors al vector SEMPRE IGUAL!
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introdueix element " + (i + 1) + " = ");
            cadena = br.readLine();
            v[i] = Integer.parseInt(cadena);
        }
        System.out.println("Quin numero vols buscar? ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);
        //imprimir v:
        for (int i = 0; i < v.length; i++) {
            //System.out.println("v[" + i + "] = " + v[i]);
            if (num == v[i]) {
                System.out.println("Posició: " + (i + 1));
                j = true;
            }
        }
        if (j == false) {
            System.out.println("No està");
        }
        br.close();

    }

}
