/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alumne
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileReader Fw = new FileReader("cuentaPalabras.txt");
        BufferedReader br = new BufferedReader(Fw);
        String [] datos;
        int i = 0;
        String linea;
        
        linea = br.readLine();
        datos = linea.split(" ");
        i = i + datos.length;
        
            for (int j = 0; j < datos.length; j++) {
                if (datos[j]==" ") {
                    i = i + datos.length;
                }
        }
            System.out.println(i);
    }
    
}
