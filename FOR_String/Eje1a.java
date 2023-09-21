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
public class Eje1a {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f2;
        String cadena;

        System.out.println("Introducir cadena: ");
        cadena = br.readLine();

        int counter;
        char c;

        f2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            f2 = f2 + c;
        }
        System.out.println("La cadena original es: " + cadena);
        System.out.println("La cadena copiada es: " + f2);

        br.close();
    }

}
