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
public class NumPNZ {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int num;
        System.out.println("Introdueix número enter: ");
        cadena = br.readLine();
        num = Integer.parseInt(cadena);

        if (num > 0) {
            System.out.println("El número és POSITIU.");
        }
        if (num < 0) {
            System.out.println("El número és NEGATIU.");
        }
        if (num == 0) {
            System.out.println("El número és CERO.");

        }
    }

}
