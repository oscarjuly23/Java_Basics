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
public class CambioVariables {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int a, b, Aux;

        System.out.println("Introduce el valor de a: ");
        cadena = br.readLine();
        a = Integer.parseInt(cadena);

        System.out.println("Introduce el valor de b: ");
        cadena = br.readLine();
        b = Integer.parseInt(cadena);

        Aux = a;
        a = b;
        b = Aux;

        System.out.println("Cambio de variable es a:" + a);
        System.out.println("Cambio de variable es b:" + b);
        br.close();

    }

}
