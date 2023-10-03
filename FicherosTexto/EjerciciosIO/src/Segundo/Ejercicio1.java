/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segundo;

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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileReader fr = new FileReader("entradaCheques.txt");
        BufferedReader brEntrada = new BufferedReader(fr);
        
        
         FileWriter fw = new FileWriter("salidaCheques.txt");
         BufferedWriter bwSalida = new BufferedWriter(fw);
         
         for (int i = 0; i < 10; i++) {
             if (true) {
                 
             }else{
                 
             }
            
        }
    }
    
}
