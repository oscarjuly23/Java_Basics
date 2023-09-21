/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        char [] vocales = {'a','e','i','o','u'};
        for (int index = 0; index < vocales.length; index++){
                System.out.println(vocales[index]);
        }
        System.out.println("Burriquito como tú,");
        System.out.println("TURURÚ!");
        br.close();
    }
    
}
