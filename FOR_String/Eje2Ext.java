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
public class Eje2Ext {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, ff = "";
        char c;

        System.out.print("Entra una frase en minusculas: ");
        cadena = br.readLine();

        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if ((c <= 122) && (c >= 97)) {
                c = (char) (c - 32);
            }
            ff = ff + c;
        }

        System.out.println("Frase en mayusculas: " + ff);

        br.close();

    }

}
