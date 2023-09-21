package ejerciciosuf1.if_011;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumne
 */
public class GastoAgua {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float L,cost,preu=0;
        int cuota=6;

        System.out.println("Quants litres has consumit?: ");
        cadena = br.readLine();
        L = Float.parseFloat(cadena);

        if (L < 50) {
           System.out.println("Cost mensual: 6€");
        } else if ((L >= 50) && (L <= 200)) {
            cost=(L*0.1f);
            preu=cost+cuota;
            System.out.println("Cost mensual: " + preu + "€");
        } else {
            cost=(L*0.3f);
            preu=cost+cuota;
            System.out.println("Cost mensual: " + preu +"€");

        }

    }

}
