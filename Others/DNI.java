/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoa_oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class DNI {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String equivalencias = "ABCDEFGHJKLMNPQRSTVWXYZ";
        String cadena;

        char c;
        int residu, dni;

        System.out.println("Introduce la parte numérica de tu DNI: ");
        cadena = br.readLine();
        dni = Integer.parseInt(cadena);

        residu = (dni % 23);

        c = equivalencias.charAt(residu);

        System.out.println("La lletra del DNI " + dni + " es: " + c);
        System.out.println("DNI: " + dni + c);

    }

}
