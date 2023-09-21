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
public class ForStringEje6_Paso7 {

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
                System.out.println("i: " + i + " Caracter frase: " + c + "; primer caracter palabra a buscar: " + palabraBuscar.charAt(0));

                if (c == palabraBuscar.charAt(0)) {
                    sonIguales = true;
                    for (int j = 1; j < palabraBuscar.length() && sonIguales == true; j++) {
                        c1 = frase.charAt(i + j);
                        c2 = palabraBuscar.charAt(j);

                        System.out.println("\tIteración i+j = " + (i + j) + " caracter = " + c1);
                        System.out.println("\tIteración j = " + j + " caracter = " + c2);

                        if (c1 != c2) {
                            System.out.println("\t\t c1= " + c1 + " c2= " + c2 + " son distintos");
                            System.out.println("\t\tSALIMOS DEL BUCLE");
                            sonIguales = false;
                        }
                    }
                    
                    if (sonIguales == true) {
                        
                        pos = i;
                        System.out.println("SON IGUALES y el primer carácter se encuentra en pos: " + pos);
                        //cuando encontramos que podemos substituir la frase, ya no hace falta
                        //continuar el bucle principal -> condicion esIguales == false;       
                    }
                }
            }
        } else {
            System.out.println("Error");
        }

        br.close();

    }

}
