/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_v10_oscar_julian;

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
public class UF3_v10_oscar_julian {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader("Clientes.txt");
        BufferedReader client = new BufferedReader(fr);

        FileReader fw = new FileReader("Series.txt");
        BufferedReader serie = new BufferedReader(fw);

        FileWriter al = new FileWriter("Alquileres.txt");
        BufferedWriter bwSalida = new BufferedWriter(al);

        ArrayList<Cliente> c = new ArrayList();
        ArrayList<Serie> s = new ArrayList();
        ArrayList<Alquiler> a = new ArrayList();

        Cliente c1 = new Cliente();
        Serie s1 = new Serie();
        Alquiler a1 = new Alquiler();

        String dades[];
        String dades1[];

        int opcion;
        boolean bucle = true;
        String cadena;
        String cadena1;

        while ((cadena = client.readLine()) != null) {
            dades = cadena.split(";");
            c1 = new Cliente(dades[0], dades[1], dades[2], dades[3], Integer.parseInt(dades[4]));
            c.add(c1);
        }
        while ((cadena1 = serie.readLine()) != null) {
            dades1 = cadena1.split(";");
            s1 = new Serie(Integer.parseInt(dades1[0]), dades1[1], Integer.parseInt(dades1[2]), Integer.parseInt(dades1[3]), Float.parseFloat(dades1[4]), Integer.parseInt(dades1[5]));
            s.add(s1);
        }

        do {
            boolean trobat = false;
            boolean trobatserie = false;
            System.out.println("1. Alquilar una serie");
            System.out.println("2. Mostrar todas los alquileres");
            System.out.println("3. Salir del programa");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Introducir el DNI del cliente: ");
                    String dni = br.readLine();
                    for (int i = 0; i < c.size(); i++) {
                        Cliente auxCliente = c.get(i);
                        if (auxCliente.getDNI().equals(dni)) {
                            trobat = true;
                            if (trobat == true) {
                                System.out.println("Introduce el identificador de la serie: ");
                                int id = Integer.parseInt(br.readLine());
                                for (int j = 0; j < s.size(); j++) {
                                    Serie auxSerie = s.get(i);
                                    if (auxSerie.getID() == id) {
                                        trobatserie = true;
                                        if (trobatserie == true) {
                                            System.out.println("Introduce el numero de temporada: ");
                                            int temporada = Integer.parseInt(br.readLine());
                                            System.out.println("Introduce un capitulo: ");
                                            int capitulo = Integer.parseInt(br.readLine());
                                            if (auxCliente.isAbonado() == true && auxSerie.isEsPremium() == true) {
                                                a1 = new Alquiler(auxCliente.getDNI(), auxSerie.getID(), temporada, capitulo, 0);
                                                a.add(a1);
                                            } else {
                                                a1 = new Alquiler(auxCliente.getDNI(), auxSerie.getID(), temporada, capitulo, auxSerie.getPrecio());
                                                a.add(a1);
                                            }
                                        } else {
                                            System.out.println("No existe ninguna serie con este codigo");
                                        }
                                    }
                                }
                            } else {
                                System.out.println("No tenemos ningun cliente con este DNI");
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < a.size(); i++) {
                        Alquiler auxAlquiler = a.get(i);
                        System.out.println(auxAlquiler.toString());
                        bwSalida.write(auxAlquiler.toString());
                        bwSalida.newLine();
                        System.out.println("");
                    }
                    bwSalida.close();
                    break;
                case 3:
                    System.out.println("Has salido del programa");
                    bucle = false;
                    break;
                default:
                    System.out.println("Solo acepta del 1 al 3. SORRY :)");
                    bucle = false;
                    break;
            }
        } while (bucle == true);
    }    
}