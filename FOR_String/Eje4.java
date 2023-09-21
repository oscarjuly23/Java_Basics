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
public class Eje4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String inver = "";

        System.out.print("Entra una cadena: ");
        cadena = br.readLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            inver = inver + cadena.charAt(i);
        }

        System.out.println("Cadena invertida:" + inver);
        br.close();
    }

}
