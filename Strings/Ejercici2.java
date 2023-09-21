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
public class Ejercici2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        String test = "Hola Vtool";
        test = test.toUpperCase();
        System.out.println(test);

        String tes = "ADEU TORRU";
        tes = tes.toLowerCase();
        System.out.println(tes);

        br.close();

    }

}
