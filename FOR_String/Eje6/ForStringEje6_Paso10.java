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
public class ForStringEje6_Paso10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal = "";
        String palabraBuscar, palabraSubstituir;
        char c;
        char c1, c2;
        boolean sonIguales = false;
        int pos = -1; //inicializo la variable pos a -1, el -1 indica no encontrado

        frase = "El elefante".toLowerCase();
        palabraBuscar = "ele".toLowerCase();
        palabraSubstituir = "iko".toLowerCase();

        if (frase.length() >= palabraBuscar.length() && frase.length() > 0) {
            
            sonIguales = false;
            for (int i = 0; i < frase.length() - (palabraBuscar.length() - 1) && sonIguales == false; i++) {
                c = frase.charAt(i);

                if (c == palabraBuscar.charAt(0)) {
                    sonIguales = true;
                    for (int j = 1; j < palabraBuscar.length() && sonIguales == true; j++) {
                        c1 = frase.charAt(i + j);
                        c2 = palabraBuscar.charAt(j);
                        
                        if (c1 != c2) {
                            sonIguales = false;
                        }
                    }
                    
                    if (sonIguales == true) { 
                        pos = i;
                    }
                }
            }

            
            if (sonIguales == true){
                
                System.out.println("La frase original es: " + frase);
                System.out.println("La posición es: " + pos);
                
                //creamos la primera parte de la frase, 
                //los indices anteriores a pos -> la fraseFinal = frase
                for (int i = 0; i < pos; i++) {
                    c = frase.charAt(i);
                    fraseFinal = fraseFinal + c;
                    System.out.println("c = " + c + " frase final = " + fraseFinal);
                }
                
                //substituimos la palbra
                System.out.println("----------------");
                System.out.println("Palabra a substituir = " + palabraSubstituir);
                System.out.println("Frase final = " + fraseFinal);
                System.out.println("----------------");
                
                
                for (int i = 0; i < palabraSubstituir.length(); i++) {
                    c = palabraSubstituir.charAt(i);
                    fraseFinal = fraseFinal + c;
                    System.out.println("c = " + c + " frase final = " + fraseFinal);
                }
                
                System.out.println("----------------");
                System.out.println("Frase final = " + fraseFinal);
                System.out.println("----------------");
                
                
                //parte 3 de la construcción de la frase final
                for (int i = pos + palabraBuscar.length(); i < frase.length(); i++) {
                    c = frase.charAt(i);
                    fraseFinal = fraseFinal + c;
                    System.out.println("c = " + c + " frase final = " + fraseFinal);
                }
                System.out.println("LA frase final es: " + fraseFinal);
                
            } else {
                System.out.println("Error: palabra no encontrada en la frase");
            }
            
            
        } else {
            System.out.println("Error");
        }

        br.close();

    }

}
