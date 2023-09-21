/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class testC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;

        int i = 0, opcion, dinero;
        Cuenta c1 = null;

        do {
            System.out.println("MENU: ");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Saldo disponible");
            System.out.println("4. Salir");
            cadena = br.readLine();
            opcion = Integer.parseInt(cadena);
            if (opcion < 1 || opcion > 4){
            System.out.println("ERROR: INTRODUCIR NUMERO DEL 1 AL 4");
            }else {
            switch (opcion) {
                case 1:
                    System.out.println("Dinero a ingresar?");
                    cadena = br.readLine();
            dinero = Integer.parseInt(cadena);
                    c1.ingresar();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    i = 1;
                    System.out.println("ADEU!");
                    break;
            }
        } 
        } while (i == 0);

    }
    }
    
}
