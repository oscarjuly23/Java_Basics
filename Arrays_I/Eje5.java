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
public class Eje5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int [] v = new int[5];
        int count = 1;
        //Introducir valor en el vector
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce un número " + count + ":");
                cadena=br.readLine();
                v[i] = Integer.parseInt(cadena);
                count ++;
               
        }
        //mostra elementos vector (orden inverso)
        for (int i = v.length-1; i >= 0; i--) {
            System.out.println("v[" + i + "] = " + v[i]);
        }
        br.close();
    }
    
}
