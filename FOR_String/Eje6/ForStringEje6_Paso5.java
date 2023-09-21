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
public class ForStringEje6_Paso5 {

    /**
     * PASO 4:  
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal;
        String palabraBuscar, palabraSubstituir;
        char c;
        char c1, c2;
        boolean sonIguales;
                
        frase = "El elefante".toLowerCase();
        palabraBuscar = "ele".toLowerCase();
        palabraSubstituir = "iko".toLowerCase();
        
        
        if (frase.length() >= palabraBuscar.length() && frase.length() > 0) {
           
            for (int i = 0; i < frase.length() - (palabraBuscar.length()-1); i++) {
                c = frase.charAt(i);
                System.out.println("i: " + i + " Caracter frase: " + c + "; primer caracter palabra a buscar: " + palabraBuscar.charAt(0));          

                if (c == palabraBuscar.charAt(0)){
                    
                    //comprobar si son iguales
                    sonIguales = true; //inicializamos la variable antes de entrar al bucle
                    //en principio decimos que las dos palabras son iguales y cuando encontramos
                    //dos carácteres que son distintos podemos afirmar que las dos frases no son iguales
                    //y salimos del bucle
                    for (int j = 1; j < palabraBuscar.length() && sonIguales == true; j++) { 
                        
                        
                        c1 = frase.charAt(i+j); 
                        c2 = palabraBuscar.charAt(j); 
                        
                        System.out.println("\tIteración i+j = " + (i+j) + " caracter = " + c1);
                        System.out.println("\tIteración j = " + j + " caracter = " + c2);
                        
                        if (c1 != c2){
                            System.out.println("\t\t c1= " + c1 + " c2= " + c2 + " son distintos");
                            System.out.println("\t\tSALIMOS DEL BUCLE");
                            sonIguales = false;
                        }
                        
                        
                    }
                    
                    
                }
            }

        } else { 
            System.out.println("Error");
        }

        br.close();

    }

}
