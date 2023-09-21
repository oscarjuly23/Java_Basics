/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicisUF1_IF02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class tienda7 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float preu, B, M, A, N, R;
        char bola;

        System.out.println("Entra la bola que ha salido: ");
        System.out.println("(B)lanca, (M)arron, (A)marilla, (N)egra, (R)oja");
        cadena = br.readLine();
        bola = cadena.charAt(0);

        System.out.println("Enrta el precio de la compra: ");
        cadena = br.readLine();
        preu = Float.parseFloat(cadena);

        switch (bola) {
            case 'B':
                System.out.println("Precio inicial:" + preu);
                System.out.println("Descuento: 0.0");
                System.out.println(" Precio final:" + preu);
                break;
            case 'M':
                System.out.println("Precio inicial:" + preu);
                System.out.println("Descuento: " + (preu * 0.1f));
                System.out.println(" Precio final:" + (preu - (preu * 0.1f)));
                break;
            case 'A':
                System.out.println("Precio inicial:" + preu);
                System.out.println("Descuento: " + (preu * 0.25f));
                System.out.println(" Precio final:" + (preu - (preu * 0.25f)));
                break;
            case 'N':
                System.out.println("Precio inicial:" + preu);
                System.out.println("Descuento: " + (preu * 0.5f));
                System.out.println(" Precio final:" + (preu - (preu * 0.5f)));
                break;
            case 'R':
                System.out.println("Precio inicial:" + preu);
                System.out.println("Descuento: " + (preu * 1f));
                System.out.println(" Precio final:" + (preu - (preu * 1f)));
                break;
            default:
                System.out.println("ERROR");
                br.close();
                break;
        }
    }
}
