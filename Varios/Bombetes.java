/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Bombetes {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float caja, contenedor, sobra, precio;
        int bombilla;

        System.out.println("Cuantes bombetes vols?: ");
        cadena = br.readLine();
        bombilla = Integer.parseInt(cadena);

        contenedor = bombilla / 6;
        caja = contenedor / 20;
        precio = bombilla * 0.50f;

        System.out.println("Necessitarem aquests contenidors: " + contenedor);
        System.out.println("Necessitarem aquestes caixes: " + caja);
//System.out.println("Sobren aquestes bombetes: " + sobra);
        System.out.println("Preu total: " + precio + "€");
        br.close();
    }

}
