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
public class Eje3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1;
        String f2;
        boolean compara;
        char c1, c2;

        System.out.println("Introducir cadena 1: ");
        f1 = br.readLine();

        System.out.println("Introducir cadena 2: ");
        f2 = br.readLine();

        if (f1.length() == f2.length()) {
            compara = true;
            for (int i = 0; i < f1.length() && compara == true; i++) {
                c1 = f1.charAt(i);
                c2 = f2.charAt(i);

                if (c1 != c2) { //cadenas distintas
                    compara = false;
                }
            }

        } else {
            compara = false;
        }

        if (compara == true) {
            System.out.println("Las cadenas son IGUALS.");
        } else {
            System.out.println("Las cadenas son DIFERENTS.");
        }
        br.close();
    }
}
