/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uf1_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int[] arrayNumeric = new int[10];
        for (int  i =0; i<arrayNumeric.length; i++){
            arrayNumeric[i] = 2 * 1;
        }
        for (int element: arrayNumeric){
            System.out.println(element + " ");
        }
        System.out.println("");
        br.close();
    }

}
