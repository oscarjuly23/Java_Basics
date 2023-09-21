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
public class Eje5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int vocal, palabra;
        char a;

        System.out.print("Entra una cadena: ");
        cadena = br.readLine();
        palabra = 1;
        vocal = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {
                vocal++;                
                //vocal = vocal + 1;
            }
            a = cadena.charAt(i);
            if (a == ' ') {
                palabra++;
                //palabra = palabra + 1;
            }
        }
        System.out.println("Numero de vocals: " + vocal);
        System.out.println("Numero de paraules: " + palabra);
        br.close();
    }
}
