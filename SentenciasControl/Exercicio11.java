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
public class Exercicio11 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String sexo;

        int edat, t;

        System.out.println("Introduce tu sexo:");
        System.out.println("H/M");
        sexo = br.readLine();

        System.out.println("Quina edat tens?");
        cadena = br.readLine();
        edat = Integer.parseInt(cadena);

        System.out.println("Quin temps (minuts) tens de l'anterior Marató?");
        cadena = br.readLine();
        t = Integer.parseInt(cadena);

        if ((t <= 150) && (edat < 40) && (sexo.equals("H"))) {
            System.out.println("Seleccionat");
        } else if ((t <= 175) && (edat > 40) && (sexo.equals("H"))) {
            System.out.println("Seleccionat");
        } else if ((t <= 180) && (sexo.equals("M"))) {
            System.out.println("Seleccionat");
            br.close();
        } else {
            System.out.println("No Seleccionat");
        }
    }
}
