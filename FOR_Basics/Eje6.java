/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_for_basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
        int num;
        int mult;
        
        System.out.println("Introdueix número: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        for (int i = 1; i <= 10; i++) {
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }
    }

}
