/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Km_millas1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        float milles, km;
        final float paso = 1.6096f;

        System.out.println("Introdueix distància en milles: ");
        cadena = br.readLine();
        milles = Float.parseFloat(cadena);

        km = paso * milles;

        System.out.println("La distància en km és: " + km);

        System.out.printf("La distància en km és :  %.2f", km);

        // LIMITAR A DOS DECIMALS NO CAL!
        br.close();

    }
}
