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
public class ForStringEje6_FINAL {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal = "";
        String palabraBuscar, palabraSubstituir;
        char c;
        char c1, c2;
        boolean sonIguales = false;
        int pos = -1; //inicializo la variable pos a -1, el -1 indica no encontrado

        System.out.println("Introduce una frase");
        frase = br.readLine();
        frase = frase.toLowerCase();
        
        System.out.println("Introduce la palabra a buscar: ");
        palabraBuscar = br.readLine();
        palabraBuscar = palabraBuscar.toLowerCase();

        System.out.println("Introducice la palabra a substituir: ");
        palabraSubstituir = br.readLine();
        palabraSubstituir = palabraSubstituir.toLowerCase();

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
                
                for (int i = 0; i < pos; i++) {
                    c = frase.charAt(i);
                    fraseFinal = fraseFinal + c;
                }
                
                for (int i = 0; i < palabraSubstituir.length(); i++) {
                    c = palabraSubstituir.charAt(i);
                    fraseFinal = fraseFinal + c;
                }
                 
                for (int i = pos + palabraBuscar.length(); i < frase.length(); i++) {
                    c = frase.charAt(i);
                    fraseFinal = fraseFinal + c;
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
