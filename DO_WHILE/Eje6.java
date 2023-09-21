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
public class Eje6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        float mitja = 0;
        int sum = 0, count = 0, num = 1;

        System.out.print("Introduce numero: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        while (num > 0) {
            sum = sum + num;
            count++;
            System.out.print("Introduce numero: ");
            cadena = br.readLine();
            num = Integer.parseInt(cadena);
        }
        mitja = sum / (float) count;
        System.out.println("Suma dels valors: " + sum);
        System.out.println("Numero de valors introduits: " + count);
        System.out.println("Mitja aritmética: " + mitja);
        br.close();
    }
}
