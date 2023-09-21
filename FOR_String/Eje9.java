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
public class Eje9 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, ff = "";
        char c, c1, c2;
        boolean compara;
        compara = true;

        System.out.print("Entra una frase: ");
        cadena = br.readLine();
        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if (c == 32) { //(c == ' ')  OR (c != ' ') ff = ff + c;              
            } else {
                ff = ff + c;
            }
        }
        for (int i = 0; i < cadena.length() / 2; i++) {
            int index = cadena.length() - (i + 1);
            c1 = cadena.charAt(i);
            c2 = cadena.charAt(index);
            if (c1 != c2) {
                compara = false;
            }
        }
        System.out.println("Frase sin espacios: " + ff);
        if (compara == true) {
            System.out.println("Palíndroma!");
        } else {
            System.out.println("Diferent!");
        }
        br.close();
    }
}
