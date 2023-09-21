/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Ejercici1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        String test = "abcdf";
        int longitud;
        char c;

        longitud = test.length();
        System.out.println("La longitud de la cadena es: " + longitud);

        c = test.charAt(0);
        System.out.println("El primer caracter es: " + c);
        //System.out.println(test.charAt(0));

        c = test.charAt(3);
        System.out.println("El cuart caracter es: " + c);
        //System.out.println(test.charAt(3));

        br.close();

    }

}
