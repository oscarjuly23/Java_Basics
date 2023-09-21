/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje12 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
    
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] suma = new int [5];
        int[] producte = new int [5];
        
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
        
        for (int i = 0; i < suma.length; i++) {
            suma[i] = v[i] + v1[i];            
            System.out.println("Suma de " + (i + 1) + ": " + suma[i]);           
        }
        for (int i = 0; i < producte.length; i++) {
        producte[i] = v[i] * v1[i];
        System.out.println("Producte de " + (i + 1) + ": " + producte[i]);
        }
        
        br.close();
       
    }
    
}
