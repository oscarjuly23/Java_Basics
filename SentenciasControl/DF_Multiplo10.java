package ExercicisUF1_IF01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class DF_Multiplo10 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int mult;

        System.out.println("Introdueix numero enter: ");
        cadena = br.readLine();
        mult = Integer.parseInt(cadena);

        if (mult % 10 == 0) {
            System.out.println("El número " + mult + " és múltiple de 10");
        } else {
            System.out.println("El número " + mult + " NO és múltiple de 10");

            br.close();
        }

    }
}
