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
public class PrecioMedio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        float precio1, precio2, precio3, media;

        System.out.println("Introducing precio 1: ");
        cadena = br.readLine();
        precio1 = Float.parseFloat(cadena);

        System.out.println("Introducing precio 2: ");
        cadena = br.readLine();
        precio2 = Float.parseFloat(cadena);

        System.out.println("Introducing precio 3: ");
        cadena = br.readLine();
        precio3 = Float.parseFloat(cadena);

        media = (precio1 + precio2 + precio3) / 3;
        System.out.println("La media es: " + media);

        br.close();
    }

}
