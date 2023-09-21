/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_UF1_SWITCH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        char resp;

        System.out.println("¿Cuál es la forma correcta de declarar una variable para almacenar un valor entero en Java?");
        System.out.println("A int 1x=10");
        System.out.println("B int x=10");
        System.out.println("C float x=10.3");
        System.out.println("D string x=10");

        System.out.println("La respuesta correcta es:");
        cadena = br.readLine();
        resp = cadena.charAt(0);

        switch (resp) {
            case 'B':
                System.out.println("Correcte");
                break;
            case 'A':
            case 'C':
            case 'D':
                System.out.println("La respuesta correcta era la A");
                break;

            default:
                System.out.println("Respon A,B,C,D");
                break;

        }
        br.close();
    }

}
