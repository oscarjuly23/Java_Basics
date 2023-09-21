package ejerciciosuf1.if_011;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumne
 */
public class Elevar2_3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int num, par, impar;

        System.out.println("Introdueix numero: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        if (num % 2 == 0) {
            par = num * num;
            System.out.println(par);
        } else {
            impar = num * num * num;
            System.out.println(impar);
        }

    }
}
