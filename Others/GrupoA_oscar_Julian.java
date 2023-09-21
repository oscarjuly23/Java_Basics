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
public class GrupoA_oscar_Julian {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        char letra1, letra2, letra3;
        int num1, num2, num3, suma, año = 0;

        System.out.println("Introdueix la PRIMERA LLETRA de la matrícula del coche:");
        cadena = br.readLine();
        letra1 = cadena.charAt(0);

        System.out.println("Introdueix la SEGONA LLETRA de la matrícula del coche:");
        cadena = br.readLine();
        letra2 = cadena.charAt(0);

        System.out.println("Introdueix la TERCERA LLETRA de la matrícula del coche:");
        cadena = br.readLine();
        letra3 = cadena.charAt(0);

        System.out.println("Introdueix el PRIMER NUMERI de la matrícula del coche:");
        cadena = br.readLine();
        num1 = Integer.parseInt(cadena);

        System.out.println("Introdueix el SEGON NUMERO de la matrícula del coche:");
        cadena = br.readLine();
        num2 = Integer.parseInt(cadena);

        System.out.println("Introdueix el TERCER NUMERO de la matrícula del coche:");
        cadena = br.readLine();
        num3 = Integer.parseInt(cadena);

        System.out.println("Matrícula: " + letra1 + letra2 + letra3 + "-" + num1 + num2 + num3);
        suma = (num1 + num2 + num3);
        System.out.println("La suma de las cifras es: " + suma);

        if (letra1 == 'A') {
            año = 2000;
        } else if (letra1 == 'B') {
            año = 2001;
        } else if (letra1 == 'C') {
            año = 2002;
        } else if (letra1 == 'D') {
            año = 2003;
        } else if (letra1 == 'F') {
            año = 2004;
        } else if (letra2 == 'D') {
            año = 2005;
        } else if (letra1 == 'G') {
            año = 2006;
        } else if (letra1 == 'H') {
            año = 2007;
        }
        System.out.println("El año de matriculación del coche es: " + año);

        br.close();

    }

}
