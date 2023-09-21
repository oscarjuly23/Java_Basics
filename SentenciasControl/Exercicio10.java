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
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int edat, anti;

        System.out.println("Quina edat tens?");
        cadena = br.readLine();
        edat = Integer.parseInt(cadena);

        System.out.println("Quina antigüetat de treball tens?");
        cadena = br.readLine();
        anti = Integer.parseInt(cadena);

        if ((edat >= 60) && (anti < 25)) {
            System.out.println("Està adscrit a la jubilació per edat.");
        } else if ((edat < 60) && (anti >= 25)) {
            System.out.println("Està adscrit a la jubilació per antiguetat jove.");
        } else if ((edat >= 60) && (anti >= 25)) {
            System.out.println("Està adscrit la jubilació per antigüetat adulta.");
        } else {
            System.out.println("No està jubilat.");
        }

        br.close();

    }
}
