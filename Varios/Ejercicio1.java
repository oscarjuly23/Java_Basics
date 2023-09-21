/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String frase;
        char c, cf = 0;
        boolean si;
        
        System.out.print("Introducir una frase: ");
        frase=br.readLine();
        
        System.out.print("Introduir un carácter: ");
        cadena = br.readLine();
        c = cadena.charAt(0);
        
        System.out.print("Posición: ");
        si = false;
        for (int i = 0; i < frase.length(); i++) {
            cf = frase.charAt(i);
            if (cf == c){
                System.out.print(i + 1 + " ");
                si = true;
            }
        }
        if (si == false){
            System.out.println("-1");
        }
        
        br.close();
    }
    
}
