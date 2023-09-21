/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicisUF1_IF04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String naci;
        String dias;
        String meses;
        String años;
        String nom;

        int dia, mes, any;

        System.out.println("Entra el nombre completo:");
        cadena = br.readLine();
        nom = cadena;

        System.out.println("Entra la fecha de nacimiento (dd/mm/aaaa):");
        naci = br.readLine();

        dias = naci.substring(0, 2);
        dia = Integer.parseInt(dias);

        meses = naci.substring(3, 5);
        mes = Integer.parseInt(meses);

        años = naci.substring(6, 9);
        any = Integer.parseInt(años);

        if (dia >= 21 && mes == 3 || (dia <= 20 && mes == 4)) {
            System.out.println("El signo zodiacal es: Aries");
        } else if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
            System.out.println("El signo zodiacal es: Tauro");
        } else if ((dia >= 21 && mes == 5) || (dia <= 21 && mes == 6)) {
            System.out.println("El signo zodiacal es: Géminis");
        } else if ((dia >= 22 && mes == 6) || (dia <= 22 && mes == 7)) {
            System.out.println("El signo zodiacal es: Cancer");
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            System.out.println("El signo zodiacal es: Leo");
        } else if ((dia >= 23 && mes == 8) || (dia <= 23 && mes == 9)) {
            System.out.println("El signo zodiacal es: Virgo");
        } else if ((dia >= 24 && mes == 9) || (dia <= 22 && mes == 10)) {
            System.out.println("El signo zodiacal es: Libra");
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            System.out.println("El signo zodiacal es: Escorpio");
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            System.out.println("El signo zodiacal es: Sagitario");
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            System.out.println("El signo zodiacal es: Capricornio");
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            System.out.println("El signo zodiacal es: Acuario");
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            System.out.println("El signo zodiacal es: Piscis");
        } else {
            System.out.println("Error, datos incorrectos");
        }

        br.close();
    }

}
