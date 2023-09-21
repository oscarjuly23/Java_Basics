/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String frase, sufijo;
        boolean acaba;
        char cf, cs;
        int index;

        acaba = true;
        System.out.println("Introducir una frase: ");
        frase = br.readLine();

        System.out.println("Introducir un sufijo: ");
        sufijo = br.readLine();

        for (int i = 0; i < sufijo.length(); i++) {
            index = i + (frase.length() - sufijo.length());
            cf = frase.charAt(index);
            cs = sufijo.charAt(i);

            if (cf != cs) {
                acaba = false;
            }
        }
        System.out.println(acaba);

        br.close();
    }

}
