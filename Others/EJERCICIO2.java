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
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int num, count = 0, par = 0, q, igual = 0;
        float media = 0;
        System.out.print("Introduce el número de valores a guardar: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);
        int[] v = new int[num];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Valor del elemento " + (i + 1) + " = ");
            cadena = br.readLine();
            v[i] = Integer.parseInt(cadena);
            if (v[i] >= 10 && v[i] <= 50) {
                count++;
            }
            if (v[i] % 2 == 0) {
                par++;
                media = media + v[i];
            }
            //Valor que s'aproxima a 15, he trobat en quant es diferencia cada valor de 15.
            //for (int j = v[i]; j != 15; j++) {
            //igual++;                
            //}
            //System.out.println("igual= " + igual);
        }
        media = media / par;
        System.out.println("Número de valores entre 10 y 50: " + count);
        System.out.println("Media de los números pares: " + media);
        br.close();
    }
}
