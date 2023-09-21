/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_for_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int nov, letra, vocal;

        System.out.print("Entra una frase: ");
        cadena = br.readLine();
        nov = 0;
        letra = 0;
        vocal = 0;

        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.charAt(x) == ' ') {
                letra = letra + 0;
            } else {
                letra++;
            }
        }
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {
                vocal++;
            } else if (cadena.charAt(i) == ' ') {
            } else {
                nov++;
            }
        }
        System.out.println("La frase tiene " + letra + " letras...");
        System.out.println("La frase tiene " + vocal + " vocal...");
        System.out.println("La frase tiene " + nov + " consonantes...");
        br.close();
    }
}
