/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_while_do;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int num, fact = 1, i = 1;

        System.out.print("Introduce numero entero positivo: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);
        if (num > 0) {
            System.out.print("Numero factorial de " + num + ": " + num + "! = ");
            while (i <= num) {
                fact = fact * i;
                if (i == num) {
                    System.out.print(num);
                } else {
                    System.out.print(i + "·");
                }
                i++;
            }
            System.out.println(" = " + fact);

        } else {
            System.out.println("No es un numero positivo");
        }
        br.close();
    }
    
}
