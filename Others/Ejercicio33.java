/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int km, persones;
        float preu, total;

        System.out.println("Quants km farás en bus?");
        cadena = br.readLine();
        km = Integer.parseInt(cadena);
        System.out.println("Quantes persones?");
        cadena = br.readLine();
        persones = Integer.parseInt(cadena);

        if (km > 200) {
            preu = ((km - 200) * 0.03f + 20);
        } else {
            preu = 20;
        }

        if (persones >= 3) {
            preu = (preu - 3);
        } else {
            preu = preu;
        }

        total = preu * persones;

        System.out.println("Ha de pagar " + preu + "€ cada persona.");
        System.out.println("Un total de: " + total + "€");

        br.close();
    }
}
