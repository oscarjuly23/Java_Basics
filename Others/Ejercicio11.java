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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int hora, min;

        System.out.println("Introdueix hora(format 24h): ");
        cadena = br.readLine();
        hora = Integer.parseInt(cadena);

        System.out.println("Introdueix minuts: ");
        cadena = br.readLine();
        min = Integer.parseInt(cadena);

        System.out.println(hora + ":" + min);

        if (hora > 12) {
            hora = (hora - 12);
        } else if (hora == 00) {
            hora = 12;
        } else {
            hora = hora;
        }

        System.out.println("Hora formato AM/PM: " + hora + ":" + min + " PM");

        br.close();
    }
}
