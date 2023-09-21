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
public class CalcularTemperatura {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float T, TH, H, TH1, TH2, TH3, P1, P, P2, P3;
        final float h = 0.25f, h1 = 0.50f, h2 = 0.75f, h3 = 1f;

        System.out.println("Introdueix temperatura: ");
        cadena = br.readLine();
        T = Float.parseFloat(cadena);

        P = h * 51.138f;
        P1 = h1 * 51.138f;
        P2 = h2 * 51.138f;
        P3 = h3 * 51.138f;

        TH = T + (P - 10) * 5 / 9;
        TH1 = (T + (P1 - 10) * 5 / 9);
        TH2 = (T + (P2 - 10) * 5 / 9);
        TH3 = (T + (P3 - 10) * 5 / 9);

        System.out.println("Temperatura:" + T + "ºC / Humedad: 25% >>> TH =  " + TH + "ºC");
        System.out.println("Temperatura:" + T + "ºC / Humedad: 50% >>> TH =  " + TH1 + "ºC");
        System.out.println("Temperatura:" + T + "ºC / Humedad: 75% >>> TH =  " + TH2 + "ºC");
        System.out.println("Temperatura:" + T + "ºC / Humedad: 100% >>> TH =  " + TH3 + "ºC");

        br.close();

    }

}
