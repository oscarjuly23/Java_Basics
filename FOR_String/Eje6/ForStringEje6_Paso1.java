/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forstringeje6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ForStringEje6_Paso1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal;
        String palabraBuscar, palabraSubstituir;

        System.out.println("Introduce una frase");
        frase = br.readLine();

        System.out.println("Introduce la palabra a buscar: ");
        palabraBuscar = br.readLine();

        System.out.println("Introducice la palabra a substituir: ");
        palabraSubstituir = br.readLine();

        
        // comprobar los valores de entrada:
        // a) La frase no puede estar vacía: frase.length() > 0
        // b )la longitud de la palabra a buscar tiene que ser menor o igual a la longitud de la frase
        if (frase.length() >= palabraBuscar.length() && frase.length() > 0) {
            System.out.println("Correcto");

        } else { 
            System.out.println("Error");
        }

        br.close();

    }

}
