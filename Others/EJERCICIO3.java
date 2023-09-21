/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf1_oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        float v = 0, n1, n2, f = 0;
        int j;
        while (v == 0) {
            System.out.println("MENU:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir del programa");
            System.out.println("Introduzca una opción:");
            cadena = br.readLine();
            j = Integer.parseInt(cadena);
            //if (j == 1 || j == 2 || j == 3 || j == 4) {
            if (j >= 1 && j <= 4) {
                System.out.println("Introduce primer número: ");
                cadena = br.readLine();
                n1 = Float.parseFloat(cadena);
                System.out.println("Introduce segundo número: ");
                cadena = br.readLine();
                n2 = Float.parseFloat(cadena);
                switch (j) {
                    case 1:
                        f = n1 + n2;
                        break;
                    case 2:
                        f = n1 - n2;
                        break;
                    case 3:
                        f = n1 * n2;
                        break;
                    case 4:
                        f = n1 / n2;
                        break;
                    default:
                        break;
                }
                System.out.println("El resultado de la operación es: " + f);
                System.out.println(" ");
            } else if (j == 5) {
                v = 2;
                System.out.println("Saliendo de la calculadora");
            } else {
                System.out.println("ERROR, volvemos al MENU");
                System.out.println(" ");
            }
        }
        br.close();
    }
}
