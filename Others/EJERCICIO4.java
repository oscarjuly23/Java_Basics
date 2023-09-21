/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf1_oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, frase;
        char c, g;
        //char b;
        int count = 1;

        //dilluns-dimarts-dimecres-dijous-divendres
        //Para poner la barra como separador en el string final:
        //System.out.println("Substituir separadores por: ");
        //cadena = br.readLine();
        //b = cadena.charAt(0);
        System.out.println("Introduce frase: ");
        frase = br.readLine();
        System.out.println("Introduce separador: ");
        cadena = br.readLine();
        c = cadena.charAt(0);
        System.out.println("La cadena original es: " + frase);
        System.out.println("El separador es: " + c);ho

        for (int i = 0; i < frase.length(); i++) {
            g = frase.charAt(i);
            if (g == c) {
                count++;
            }
            System.out.print(g);
        }
        String[] v = new String[count];
        for (int i = 0; i < count; i++) {
            g = frase.charAt(i);
            //System.out.print(g);            
        }

        //Imprimeix el string final con las / en vez de los separadores del string original.
        System.out.println("El vector tiene " + count + " elementos: ");
        //for (int i = 0; i < frase.length(); i++) {
        //g = frase.charAt(i);
        //if (g == c) {
        ////count++;!
        //g = b;
        //}
        //System.out.print(g);
        //}
        br.close();
    }
}
