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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float num1, num2, resp = 0;
        char signe = 0;

        System.out.println("Introducir el primer número:");
        cadena = br.readLine();
        num1 = Float.parseFloat(cadena);

        System.out.println("Introducir el segundo número:");
        cadena = br.readLine();
        num2 = Float.parseFloat(cadena);

        System.out.println("Introducir la operación (/,*,+,-):");
        cadena = br.readLine();
        signe = cadena.charAt(signe);

        switch (signe) {
            case '+':
                resp = (num1 + num2);
                break;
            case '-':
                resp = (num1 - num2);
                break;
            case '*':
                resp = (num1 * num2);
                break;
            case '/':
                resp = (num1 / num2);
                break;
            default:
                System.out.println("Valor invàlid");
                break;

        }
        System.out.println("El resultado es : " + resp);
    }
}
