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
public class Eje3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int i, n, suma = 0;
        System.out.print("Introduce el valor de n: ");
        cadena = br.readLine();
        n = Integer.parseInt(cadena);

        i = 1;
        while (i <= n) {
            suma = suma + i;
            i++;
            
        }
        System.out.print("La suma total de los n primeros es: " + suma);
        br.close();
    }
}
