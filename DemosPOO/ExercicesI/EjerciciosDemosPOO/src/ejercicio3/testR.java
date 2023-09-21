/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class testR {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double po, pr;
        rebaja r = new  rebaja();
        
        System.out.println("Precio original? ");
        po = Double.parseDouble(br.readLine());
        System.out.println("Precio rebajado? ");
        pr = Double.parseDouble(br.readLine());
        System.out.println("Tanto por ciento: " + r.descubrePorcentaje(po,pr) + "%");
        
        br.close();
    }
    
}
