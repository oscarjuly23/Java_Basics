/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Taula_multiplicar2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int n, x1, x2, x3, x4, x5, x6, x7, x8, x9;

        System.out.println("Introdueix número enter: ");
        cadena = br.readLine();
        n = Integer.parseInt(cadena);

        x1 = n * 1;
        x2 = n * 2;
        x3 = n * 3;
        x4 = n * 4;
        x5 = n * 5;
        x6 = n * 6;
        x7 = n * 7;
        x8 = n * 8;
        x9 = n * 9;

        System.out.println("Taula de multiplicar de" + n);
        System.out.println(n + "x1=" + x1);
        System.out.println(n + "x2=" + x2);
        System.out.println(n + "x3=" + x3);
        System.out.println(n + "x4=" + x4);
        System.out.println(n + "x5=" + x5);
        System.out.println(n + "x6=" + x6);
        System.out.println(n + "x7=" + x7);
        System.out.println(n + "x8=" + x8);
        System.out.println(n + "x9=" + x9);

        br.close();
    }

}
