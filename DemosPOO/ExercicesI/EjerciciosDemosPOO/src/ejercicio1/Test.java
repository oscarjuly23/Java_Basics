/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        int c;
        int o = 0;
        int velocidad = 0;
        
        Coche c1 = new Coche();

         
        while (o == 0) {
            System.out.println("Menú");
            System.out.println("1. Acelerar el coche");
            System.out.println("2. Frenar el coche");
            System.out.println("3. Imprimir velocidad");
            System.out.println("4. Salir");
            System.out.println("Introducir una opción:");
            cadena = br.readLine();
            c = Integer.parseInt(cadena);
            
            switch (c) {
                    case 1:
                        System.out.println("Velocidad que quieres acelerar: ");
                        velocidad = Integer.parseInt(br.readLine());
                         c1.acelerar(velocidad);
                        break;
                    case 2:
                         System.out.println("Velocidad que quieres frenar: ");
                        velocidad = Integer.parseInt(br.readLine());
                         c1.frenar(velocidad);
                        break;
                    case 3:
                        System.out.println("Velocidad actual: " + c1.getVelocidad());
                        break;
                    case 4:
                        o = 1;
                        break;
                    default:
                        break;
                }
        }

       
        
        br.close();
    }

}
