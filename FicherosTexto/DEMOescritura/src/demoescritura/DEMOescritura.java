/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoescritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alumne
 */
public class DEMOescritura {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileWriter Fw=new FileWriter("escribirtexto.txt");
        BufferedWriter bwSalida = new BufferedWriter(Fw);
        bwSalida.write("Primera linea = estamos escribiendo en un archivo");
         bwSalida.newLine();
          bwSalida.write("Segunda linea: ");
         bwSalida.write(" continuamos en la segunda línea.");
         bwSalida.newLine();
         bwSalida.write("Terminamos la escritura");
         
         bwSalida.close();
//        FileWriter(File file)
        //Constructs a FileWriter object given a File object
    }
    
}
