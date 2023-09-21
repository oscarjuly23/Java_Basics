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
 * @author Víctor
 */
public class Bombillas {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
        int bombillas, cajas, contenedor, sobran, descuento,resta;
        float precio;
        
        System.out.println("Cuantas bombillas quieres? ");
        cadena = br.readLine();
        bombillas = Integer.parseInt(cadena);
        
        cajas=bombillas/6;
        contenedor=cajas/20;
        sobran=(bombillas%6);
        
       
        resta=(cajas-(20*contenedor));
        System.out.println("Son estas cajas: " + resta);
       
        System.out.println("Son estos contenedores: " + contenedor);
        System.out.println("Sobran estas bombillas: " + sobran);
        
        precio=(bombillas*0.5f);
        System.out.println("Las bombillas cuestan: " + precio + "€");
        
        descuento=(contenedor*1);
        System.out.println("El descuento es: " + descuento + "%");
        
        
    }
}
