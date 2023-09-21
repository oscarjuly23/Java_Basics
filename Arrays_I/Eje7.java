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
public class Eje7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
    
        int[] v = new int[4];
        int[] v1 = new int[4];
        int[] v3 = new int[8];
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introdueix elements del primer vector " + (i + 1) + " = ");
            cadena = br.readLine();
            v[i] = Integer.parseInt(cadena);
        }        
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introdueix elements del segon vector " + (i + 1) + " = ");
            cadena = br.readLine();
            v1[i] = Integer.parseInt(cadena);
        }
        if ((v[i] % 2) == 0)
        for (int i = 0; i < v3.length; i++) {
            v3[i] = v
        }
        
        
        br.close();
    }
    
}
