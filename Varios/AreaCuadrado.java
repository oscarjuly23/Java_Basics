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
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String texto;
        int lado;
        int area;

        System.out.println("Introducing lado");
        texto = br.readLine();
        lado = Integer.parseInt(texto);

        area = lado * lado;

        System.out.println("El valor introducido es: " + texto);
        System.out.println("El area es: " + area);

        br.close();

    }

}
