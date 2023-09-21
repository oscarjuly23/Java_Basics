/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_while_do;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class While_Extra1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int num;

        System.out.println("Entra un numero binari: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        while ((num == 0) || (num == 1)) {

        }
        System.out.println("No es binari!");

        br.close();
    }

}
