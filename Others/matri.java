/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoa_oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class matri {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, num1, num2, num3, any = null;

        int n1, n2, n3, suma, hola = 0;
        char letras;

        System.out.println("Introducir la matrícula del coche (3 letras - 3 dígitos): ");
        cadena = br.readLine();
        letras = cadena.charAt(0);
        num1 = cadena.substring(4, 5);
        num2 = cadena.substring(5, 6);
        num3 = cadena.substring(6, 7);
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        n3 = Integer.parseInt(num3);
        suma = n1 + n2 + n3;

        switch (letras) {
            case 'A':
                any = "2000";
                break;
            case 'B':
                any = "2001";
                break;
            case 'C':
                any = "2002";
                break;
            case 'D':
                any = "2003";
                break;
            case 'E':
                any = "2004";
                break;
            case 'F':
                any = "2005";
                break;
            case 'G':
                any = "2006";
                break;
            case 'H':
                any = "2007";
                break;

        }

        System.out.println("La suma de las cifras es: " + suma);
        System.out.println("El año de matriculación del coche es: " + any);
    }

}
