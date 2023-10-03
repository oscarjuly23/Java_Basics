/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alumne
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileReader fr = new FileReader("ficherooriginal.txt");
        FileReader ft = new FileReader("censura.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedReader bt = new BufferedReader(ft);
        String fraseEntrada = br.readLine();
        String frasePalabra = bt.readLine();
        String [] datos=frasePalabra.split(" ");
        FileWriter fw = new FileWriter("ficheroSalida2.txt");
        BufferedWriter bwSalida = new BufferedWriter(fw);
        
        while (fraseEntrada != null & frasePalabra != null) {
            datos=frasePalabra.split(" ");
           fraseEntrada=fraseEntrada.replaceAll(datos[0], datos[1]);
        
            
                   
            fraseEntrada = fraseEntrada + br.readLine();
            frasePalabra = bt.readLine();
        } 
            
        fraseEntrada=fraseEntrada.replaceAll("null"," ");
        bwSalida.write(fraseEntrada);
        bwSalida.close();

    }
}

