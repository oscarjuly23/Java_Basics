/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf1_oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, frase, subcadena;
        int c, f;
        char t, g;
        System.out.print("Introducir la cadena: ");
        frase = br.readLine();
        System.out.print("Introduce el índice inicial: ");
        cadena = br.readLine();
        c = Integer.parseInt(cadena);
        System.out.print("Introduce el índice final: ");
        cadena = br.readLine();
        f = Integer.parseInt(cadena);
        for (int i = 0; i < frase.length(); i++) {
            t = frase.charAt(i);
            //System.out.println(t);
        }
        System.out.print("La subcadena es: ");
        for (int i = c; i <= f; i++) {
            g = frase.charAt(i);
            System.out.print(g);
        }
        br.close();
    }
}
