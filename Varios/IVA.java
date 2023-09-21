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
public class IVA {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float precio, preciofinal, precioiva;
        final float IVA = 0.21f;

        System.out.println("Introducing precio: ");
        cadena = br.readLine();
        precio = Float.parseFloat(cadena);

        precioiva = IVA * precio;
        preciofinal = precioiva + precio;
        System.out.println("El precio con IVA es: " + preciofinal);

        br.close();
    }

}
