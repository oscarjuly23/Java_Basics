/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos1;

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
        float v = 0, n1, n2, f = 0;
        int j;
        
        System.out.println("MENU:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Elevar dos numeros");
        System.out.println("Introduzca una opción:");
        cadena = br.readLine();
        j = Integer.parseInt(cadena);
        
        

        System.out.println("Introduce primer número: ");
        cadena = br.readLine();
        n1 = Float.parseFloat(cadena);
        System.out.println("Introduce segundo número: ");
        cadena = br.readLine();
        n2 = Float.parseFloat(cadena);

       // int n = n(n1, n2, j);
       // System.out.println("Resultat: " + n(n1, n2, j));
    }

    public static float l(float n1, float n2, int j) throws IOException {
        
        float n = 0;
        switch (j) {
            case 1:
                n = n1 + n2;
                break;
            case 2:
                n = n1 - n2;
                break;
            case 3:
                n = n1 * n2;
                break;
            case 4:
                n = n1 / n2;
                break;
            case 5:
                n = (int) (float) Math.pow(n1, n2);
                break;
            default:
                break;
        }
        return n;
    }

   
}