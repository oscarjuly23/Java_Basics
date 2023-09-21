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
public class Eje5 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int valor, max;

        System.out.print("Entra valor (entra -1 para salir): ");
        cadena = br.readLine();
        valor = Integer.parseInt(cadena);
        max = Integer.parseInt(cadena);
        max = valor;
        if (valor == -1) {
            System.out.println("No se ha entrado valores");
        } else {
            while (valor != -1) {
                System.out.print("Entra valor (entra -1 para salir): ");
                cadena = br.readLine();
                valor = Integer.parseInt(cadena);
                if (valor > max && valor != -1) {
                    max = valor;
                }
            }
            System.out.println("El valor máximo es: " + max);
            br.close();
        }
    }

}
