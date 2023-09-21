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
public class Operacions_variables3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int n1, n2, suma, resta, multi, cuadrat, residu;
        double arrel;

        System.out.println("Introdueix primer número: ");
        cadena = br.readLine();
        n1 = Integer.parseInt(cadena);

        System.out.println("Introdueix segon número: ");
        cadena = br.readLine();
        n2 = Integer.parseInt(cadena);

        suma = n1 + n2;
        resta = n1 - n2;
        multi = n1 * n2;
        residu = n1 % n2;
        cuadrat = (n1 + n2) * (n1 + n2);
        arrel = Math.sqrt(n1 + n2);

        System.out.println("Operacions amb " + n1 + " i " + n2 + ":");
        System.out.println("Suma:" + suma);
        System.out.println("Resta: " + resta);
        System.out.println("multi:" + multi);
        System.out.println("residu: " + residu);
        System.out.println("cuadrat:" + cuadrat);
        System.out.println("arrel: " + arrel);

        br.close();
    }

}
