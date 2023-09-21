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
public class Eje4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int i, n;
        System.out.print("Introduce n: ");
        cadena = br.readLine();
        n = Integer.parseInt(cadena);

        i = 1;
        while (i < n) {
            System.out.print(i + ", ");
            i++;            
        }
        System.out.println(n);
        br.close();
    
    }
    
}
