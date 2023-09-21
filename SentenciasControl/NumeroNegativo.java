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
public class NumeroNegativo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int numero;

        System.out.println("Introdueix numero: ");
        cadena = br.readLine();
        numero = Integer.parseInt(cadena);

        if (numero < 0) {
            System.out.println("El numero negatiu es: " + numero);

            br.close();
        }

    }

}
