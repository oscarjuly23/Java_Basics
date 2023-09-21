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
public class OrdenarABC {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        char c1, c2;

        System.out.println("Introdueix caràcter 1: ");
        cadena = br.readLine();
        c1 = cadena.charAt(0);

        System.out.println("Introdueix caràcter 2: ");
        cadena = br.readLine();
        c2 = cadena.charAt(0);

        if (c1 < c2) {
            System.out.println("Ordedem alfabèticament els teus caràcters: " + c1 + "," + c2);
        } else {
            System.out.println("Ordedem alfabèticament els teus caràcters: " + c2 + "," + c1);
        }

    }

}
