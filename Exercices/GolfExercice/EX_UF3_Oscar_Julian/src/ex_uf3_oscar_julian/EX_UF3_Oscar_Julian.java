/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_uf3_oscar_julian;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class EX_UF3_Oscar_Julian {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader("DadesAlumnes.txt");
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Homes> h = new ArrayList();
        String dades[];
        String cadena = br.readLine();

        Homes h1 = new Homes();

        while (cadena != null) {
            dades = cadena.split(";");
            h1 = new Homes(dades[0], Integer.parseInt(dades[1]), Integer.parseInt(dades[2]), Integer.parseInt(dades[3]));
            h.add(h1);

            double cuants = (((Float.parseFloat(dades[2])) / (Float.parseFloat(dades[1]))) * 100);
            double cuants1 = (((Float.parseFloat(dades[3])) / (Float.parseFloat(dades[1]))) * 100);
            double suma = cuants + cuants1;

            FileWriter fw = new FileWriter("Resultats.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print(dades[0]);
            System.out.print("\t");
            System.out.print(dades[1]);
            System.out.print("\t");
            System.out.print(suma);
            System.out.print("\t");
            System.out.print(dades[2]);
            System.out.print("\t");
            System.out.print(cuants + "%");
            System.out.print("\t");
            System.out.print(dades[3]);
            System.out.print("\t");
            System.out.print(cuants1 + "%");
            System.out.println("");
            cadena = br.readLine();
        }
        br.close();

//        while (cadena != null) {
//            dades = cadena.split(";");
//            h1 = new Homes(dades[0], Integer.parseInt(dades[1]), Integer.parseInt(dades[2]), Integer.parseInt(dades[3]));
//            h.add(h1);
//
//            double cuants = (((Float.parseFloat(dades[2])) / (Float.parseFloat(dades[1]))) * 100);
//            double cuants1 = (((Float.parseFloat(dades[3])) / (Float.parseFloat(dades[1]))) * 100);
//            double suma = cuants + cuants1;
//
//            FileWriter fw = new FileWriter("Resultats.txt");
//            BufferedWriter bwSalida = new BufferedWriter(fw);
//
//            for (int i = 0; i < h.size(); i++) {
//
//                bwSalida.write(dades[0]);
//                bwSalida.write("\t");
//                bwSalida.write(dades[1]);
//                bwSalida.write("\t");
//                //bwSalida.write(suma);
//                bwSalida.write("\t");
//                bwSalida.write(dades[2]);
//                bwSalida.write("\t");
//                bwSalida.write(cuants + "%");
//                bwSalida.write("\t");
//                bwSalida.write(dades[3]);
//                bwSalida.write("\t");
//                bwSalida.write(cuants1 + "%");
//
//                bwSalida.write("");
//                bwSalida.newLine();
//
//                cadena = br.readLine();
//            }
//
//            bwSalida.close();
//        }

    }
}
