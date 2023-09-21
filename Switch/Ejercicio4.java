/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_UF1_SWITCH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int num;

        System.out.println("Polsa una tecla");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        switch (num) {
            case 0:
                System.out.println("Estas presionando el 0");
                break;
            case 1:
                System.out.println("Estas presionando el 1");
                break;
            case 2:
                System.out.println("Estas presionando el 2");
                break;
            case 3:
                System.out.println("Estas presionando el 3");
                break;
            case 4:
                System.out.println("Estas presionando el 4");
                break;
            case 5:
                System.out.println("Estas presionando el 5");
                break;
            case 6:
                System.out.println("Estas presionando el 6");
                break;
            case 7:
                System.out.println("Estas presionando el 7");
                break;
            case 8:
                System.out.println("Estas presionando el 8");
                break;
            case 9:
                System.out.println("Estas presionando el 9");
                break;
            default:
                System.out.println("Error: solo se puede introducir un dígito");
                break;

        }
        br.close();
    }
}
