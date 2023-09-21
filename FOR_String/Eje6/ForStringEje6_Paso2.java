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
public class ForStringEje6_Paso2 {

    /**
     * PASO 2: los valores de la cadena se ponen en estático para facilitar la comprobación de los bucles
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frase, fraseFinal;
        String palabraBuscar, palabraSubstituir;
        char c;


        
        //para facilitar las pruebas, ponemos valores estáticos
        frase = "El elefante";
        palabraBuscar = "ele";
        palabraSubstituir = "iko";
        
        
        if (frase.length() >= palabraBuscar.length() && frase.length() > 0) {
            /*
            Se tiene que recorrer la frase, y buscar si el caracter es igual al primer 
            caracter de la palabra a buscar (en nuestro ejemplo, tenemos que buscar todas los carácteres
            de la frase que sean una e).
            RECORRIDO DEL FOR: empezamos por 0 y terminamos ?????
            No puedo recorrer toda la frase.
            Ejemplo: El elefante. Tengo que recorrer "El elefan", pq si estoy en el carácter t o e, ya es 
            seguro que no voy a entrar la palabra a buscar ya que la longitud Te es de 2 y la palabra a buscar = 3.
            */
            for (int i = 0; i < frase.length() - (palabraBuscar.length()-1); i++) {
                c = frase.charAt(i);
                System.out.println("i és : " + i + " c es: " + c);  //comprobación del bucle        
            }

        } else { 
            System.out.println("Error");
        }

        br.close();

    }

}
