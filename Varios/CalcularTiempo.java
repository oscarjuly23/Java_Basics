/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tercer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class CalcularTiempo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int entrada, tiempot, h, m, s, h1, m1, s1, H, M, S;

        System.out.println("ETRADA:");
        System.out.println("Hora:");
        cadena = br.readLine();
        h = Integer.parseInt(cadena);

        System.out.println("Minutos: ");
        cadena = br.readLine();
        m = Integer.parseInt(cadena);

        System.out.println("Segundos: ");
        cadena = br.readLine();
        s = Integer.parseInt(cadena);

        System.out.println("SALIDA:");

        System.out.println("Hora:");
        cadena = br.readLine();
        h1 = Integer.parseInt(cadena);

        System.out.println("Minutos:");
        cadena = br.readLine();
        m1 = Integer.parseInt(cadena);

        System.out.println("Segundos:");
        cadena = br.readLine();
        s1 = Integer.parseInt(cadena);

        H = h1 - h;
        M = m1 - m;
        S = s1 - s;

        System.out.println("El empleado ha trabajado: " + H + ":" + M + ":" + S);

        br.close();

    }

}
