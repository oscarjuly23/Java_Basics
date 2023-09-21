/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_for_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String f1 = "HoY eS JuEVeS".toLowerCase();
        char letra, carac;
        int num = 0;
        int count;

        System.out.println("La frase és: " + f1);

        System.out.println("Quina lletra vols contar?");
        cadena = br.readLine();
        letra = cadena.charAt(0);

        count = 0;
        for (int i = 0; i < f1.length(); i++) {
            carac = f1.charAt(i);
            if (carac == 'e') {
                count++;
                //count = count + 1;
            }
            //System.out.println("i = " + i + ", lletra = " + letra);
        }
        System.out.println("Hi han " + count + " " + "'" + letra + "'");
        br.close();
    }

}
