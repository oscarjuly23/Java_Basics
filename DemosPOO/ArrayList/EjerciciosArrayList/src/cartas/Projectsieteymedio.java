/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class Projectsieteymedio {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Carta1> baraja = new ArrayList();
        int opcion;
        crearBaraja(baraja);
        System.out.println(baraja.toString());
    }

    public static void crearBaraja(ArrayList<Carta1> auxBaraja) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] palos = {"oros", "espadas", "bastos", "copas"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        double puntuacion, user;
        boolean continuar;
        ArrayList<Carta1> arrayCarta = new ArrayList();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                Carta1 c = new Carta1(palos[i], numeros[j]);
                arrayCarta.add(c);
            }
        }
        continuar = true;
        puntuacion = 0;
        while (continuar == true) {
            int posicion = (int) (Math.random() * arrayCarta.size());
            System.out.println(arrayCarta.get(posicion));
            Carta1 auxCarta = arrayCarta.get(posicion);
            puntuacion += auxCarta.getPuntuacion();
            System.out.println("Puntuacion acumulada " + puntuacion);
            
            System.out.println("Desea seguir?");
            System.out.println("Quieres una carta mas");
            System.out.println("Val cualquier tecla");
            System.out.println("Quieres plantarte?");
            System.out.println("Tienes que decir que No");
            String respuesta = br.readLine();
            if ("No".equals(respuesta) || "no".equals(respuesta) || "NO".equals(respuesta)) {
                System.out.println("Adios");
                continuar = false;
            }

        }
    }
}
