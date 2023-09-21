/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forstringeje6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author professor
 */
public class ForStringEje6_Paso3 {

    /**
     * PASO 3: 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal;
        String palabraBuscar, palabraSubstituir;
        char c;


                
        frase = "El elefante".toLowerCase();
        palabraBuscar = "ele".toLowerCase();
        palabraSubstituir = "iko".toLowerCase();
        
        
        if (frase.length() >= palabraBuscar.length() && frase.length() > 0) {
           
            for (int i = 0; i < frase.length() - (palabraBuscar.length()-1); i++) {
                c = frase.charAt(i);
                System.out.println("i: " + i + " Caracter frase: " + c + "; primer caracter palabra a buscar: " + palabraBuscar.charAt(0));          

                //encuentro un caracter en la frase que sea igual al primer carácter de la palabra a buscar, lo indico
                //me doy cuenta que el caracter E, no entra dentro del bucle, solución: utilizar el método toLowerCase
                if (c == palabraBuscar.charAt(0)){
                    System.out.println(" IGUALES ");
                }
            }

        } else { 
            System.out.println("Error");
        }

        br.close();

    }

}
