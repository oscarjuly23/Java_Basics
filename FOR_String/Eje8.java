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
public class Eje8 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, f1, f2, ff = "";
        int posi;
        char c;

        System.out.print("Entra la primera frase: ");
        f1 = br.readLine();

        System.out.print("Entra la segunda frase: ");
        f2 = br.readLine();

        System.out.print("Posición = ");
        cadena = br.readLine();
        posi = Integer.parseInt(cadena);

        for (int i = 0; i <= posi - 1; i++) {
            c = f1.charAt(i);
            ff = ff + c;
        }
        for (int i = 0; i < f1.length(); i++) {
            c = f2.charAt(i);
            ff = ff + c;
        }
        for (int i = posi; i < f2.length(); i++) {
            c = f1.charAt(i);
            ff = ff + c;
        }
        System.out.println("Frase final: " + ff);
        br.close();
    }
}
