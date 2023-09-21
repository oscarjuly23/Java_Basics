/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_control_acceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salirPrograma = false;
        int opcionMenu;
        ControlDeAcceso c = new ControlDeAcceso(); 
        
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Introducir usuario al recinto");
            System.out.println("2. Entrada de un usuario al recinto");
            System.out.println("3. Salir \n");
            System.out.print("Introducir una opción: ");
            opcionMenu = Integer.parseInt(br.readLine());

            switch (opcionMenu) {
                case 1:
                   c.entraUsuario(id);
                    break;
                case 2:
                    c.vetaUsuario(id);
                    break;
                case 3:
                    System.out.println("Nos vemos pronto!");
                    salirPrograma = true;
                    break;
                default:
                    System.out.println("ERROR. Introduce un númeroi ebtre ek 1 y el 3.");
            }
        } while (salirPrograma == false);

    }
}
