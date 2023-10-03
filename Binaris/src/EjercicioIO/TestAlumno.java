/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class TestAlumno {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader("Alumnos.dat");
        BufferedReader bra = new BufferedReader(fr);

        int opcion;

        do {
            System.out.println("1.Añadir alumno");
            System.out.println("2. Comparar alumno");
            System.out.println("3. Salir del programa");
            System.out.println("Escoge una opción");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    opcion = 3;
                    break;
                default:
                    System.out.println("Introduce una opción vàlida");
                    break;
            }

        } while (opcion != 3);
    }
}
