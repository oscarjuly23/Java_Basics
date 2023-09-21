/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Recursivo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, count = 0, total = 0;

        System.out.print("Introduce primer numero: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Introduce segundo numero: ");
        b = Integer.parseInt(br.readLine());
        total = b;
        System.out.println("A   |   B   |   Sumanndos");
        System.out.println("-------------------------");
        System.out.println(a + "    |    " + b + "  |   " + b);
        System.out.println("-------------------------");

        System.out.println("A");
        do {
            System.out.print(a + "/2=");
            a = a / 2;
            count++;
            System.out.println(a);

        } while (a != 1);
        System.out.println("B");
        for (int i = 0; i < count; i++) {
            System.out.print(b + "*2=");
            b = b * 2;
            System.out.println(b);
            total = total + b;
        }
        System.out.println("    |   Total   | " + total);

    }
    //FALTA QUE ELS IMPARS DE A NO SUMIN LA COLUMNA B.

}
