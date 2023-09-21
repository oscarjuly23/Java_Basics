package ExercicisUF1_IF01;

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
public class DF_division {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        float cociente, dividendo, divisor;

        System.out.println("Divideixo numero(enter): ");
        cadena = br.readLine();
        dividendo = Float.parseFloat(cadena);
        System.out.println("Entre numero(enter): ");
        cadena = br.readLine();
        divisor = Float.parseFloat(cadena);

        if (divisor != 0) {
            cociente = dividendo / divisor;
            System.out.println("Resultat: " + cociente);
        } else {
            System.out.println("ERROR, no se puede dividir entre 0");

            br.close();
        }
    }
}
