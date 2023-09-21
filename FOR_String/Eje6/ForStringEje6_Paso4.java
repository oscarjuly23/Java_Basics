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
public class ForStringEje6_Paso4{

    /**
     * PASO 4:  
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal;
        String palabraBuscar, palabraSubstituir;
        char c;
        char c1, c2;

                
        frase = "El elefante".toLowerCase();
        palabraBuscar = "ele".toLowerCase();
        palabraSubstituir = "iko".toLowerCase();
        
        
        if (frase.length() >= palabraBuscar.length() && frase.length() > 0) {
           
            for (int i = 0; i < frase.length() - (palabraBuscar.length()-1); i++) {
                c = frase.charAt(i);
                System.out.println("i: " + i + " Caracter frase: " + c + "; primer caracter palabra a buscar: " + palabraBuscar.charAt(0));          

                if (c == palabraBuscar.charAt(0)){
                    System.out.println(" IGUALES ");
                    //si el carácter de la frase es igual al primer caracter de la palabra a buscar, tengo que comprar
                    //le de la palabra a buscar con los dos siguientes carácteres de la frase, utilizo un bucle pq 
                    //el tamaño de la frase a buscar no tiene que ser fijo, puede ser de 3 carácter como en el ejemplo o más o menos.
                    
                    for (int j = 1; j < palabraBuscar.length(); j++) { //j es igual a 1, pq estoy recorriendo el string palabraBuscar,
                        //y la primera letra ya sabemos que es igual pq ha entrado en el IF
                        
                        
                        c1 = frase.charAt(i+j); //la siguiente letra a comparar será i + j:  i es la posición de la primera letra y j nos 
                        //indicará cuantas posiciones nos estamos desplazando.
                        c2 = palabraBuscar.charAt(j); //j la utilizamos para recorrer la palabra a Buscar
                        
                        System.out.println("\tIteración i+j = " + (i+j) + " caracter = " + c1);
                        System.out.println("\tIteración j = " + j + " caracter = " + c2);
                        
                    }
                    
                    
                }
            }

        } else { 
            System.out.println("Error");
        }

        br.close();

    }

}
