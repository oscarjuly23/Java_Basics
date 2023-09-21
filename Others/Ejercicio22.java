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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int vel, multa;

        System.out.println("A quina velocitat anava?");
        cadena = br.readLine();
        vel = Integer.parseInt(cadena);

        if (vel <= 60) {
            multa = 200;
        } else if (vel <= 120) {
            multa = 0;
        } else if (vel >= 140) {
            multa = 1000;
        } else {
            multa = 200;
        }

        System.out.println("Ha de pagar una multa de " + multa + "€");

        br.close();
    }
}
