/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicisUF1_IF03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String sexo;

        float puls, edat;

        System.out.println("Introduce tu sexo:");
        System.out.println("H/M");
        sexo = br.readLine();

        System.out.println("Introdueix edat:");
        cadena = br.readLine();
        edat = Float.parseFloat(cadena);

        switch (sexo) {
            case "H":
                puls = ((210 - edat) / 10);
                System.out.println("Deberias tener:" + puls + " pulsaciones por minuto.");
                break;
            case "M":
                puls = ((220 - edat) / 10);
                System.out.println("Deberias tener:" + puls + " pulsaciones por minuto.");
                break;
            default:
                System.out.println("ERROR (al introducir datos)");
                break;
        }
        br.close();

    }

}
