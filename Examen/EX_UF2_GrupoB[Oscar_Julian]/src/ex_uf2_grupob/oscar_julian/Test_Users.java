/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_uf2_grupob.oscar_julian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class Test_Users {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salirPrograma = false;
        int opcionMenu, id, count = 0;
        String cadena, datos;

        ArrayList<User> ListaUsers = new ArrayList();
        ArrayList<User> ListaRecinto = new ArrayList();
        ArrayList<User> ListaVetados = new ArrayList();

        do {
            boolean existe = false;

            System.out.println("-----MENU-----");
            System.out.println("1. Introduce un nuevo usuario");
            System.out.println("2. Entrada de un usuario al recinto");
            System.out.println("3. Vetar la entrada a un usuario");
            System.out.println("4. Número de usuarios en el recinto");
            System.out.println("5. Mostrar todos los hombres mayores de edad que hay en el recinto.");
            System.out.println("6. Salir del programa\n");
            System.out.print("Introducir una opción: ");
            opcionMenu = Integer.parseInt(br.readLine());

            switch (opcionMenu) {
                case 1:
                    System.out.println("Nuevo usuario");
                    System.out.println("Introduce (identificador,nombre,apellido,edad,género(h/m)): ");
                    datos = br.readLine();
                    String[] valores = datos.split(",");
                    User u = new User(Integer.parseInt(valores[0]),
                            valores[1],
                            valores[2],
                            Integer.parseInt(valores[3]),
                            valores[4].charAt(0));
                    ListaUsers.add(u);
                    System.out.println(" ");
                    break;

                case 2:
                    if (ListaUsers.isEmpty()) {
                        System.out.println("No hay usuarios");
                    } else {
                        System.out.println("Introduce identificador: ");
                        id = Integer.parseInt(br.readLine());
                        for (int i = 0; i < ListaUsers.size(); i++) {
                            User auxUser = ListaUsers.get(i);
                            if (id == auxUser.getId()) {            //Comprobamos que existe el usuario con ese id
                                existe = true;
                                if (ListaRecinto.size() < 10) {     //Comprobamos que el recinto no este lleno
                                    if (ListaVetados.isEmpty()) {
                                        ListaRecinto.add(auxUser);
                                        System.out.println("Añadimos el usuario con id " + id + " al recinto.");
                                        //SIN EL LISTA_VETADOS EMPTY NO ME FUNCIONABA, por eso no he hecho {else if}.
                                    } else {
                                        for (int j = 0; j < ListaVetados.size(); j++) {     //Comprobamos que el user con ese id no este vetado
                                            auxUser = ListaVetados.get(j);
                                            if (id == auxUser.getId()) {
                                                System.out.println("El usuario con identificador " + id + " no puede entrar en el recinto");
                                            } else {
                                                ListaRecinto.add(auxUser);
                                                System.out.println("Añadimos el usuario con id " + id + " al recinto.");
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("No se permite la entrada, el aforo está completo.");
                                }
                            }
                        }
                        if (existe == false) {
                            System.out.println("El identificador no pertenece a ningún usuario.");
                        }
                    }
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Introduce identificador: ");
                    id = Integer.parseInt(br.readLine());
                    for (int i = 0; i < ListaUsers.size(); i++) {
                        User auxUser = ListaUsers.get(i);
                        if (id == auxUser.getId()) {
                            existe = true;
                            ListaVetados.add(auxUser);
                            System.out.println("Se ha vetado el acceso al recinto al usuario con id: " + id);
                        }
                    }
                    if (existe == false) {
                        System.out.println("El identificador no pertenece a ningún usuario.");
                    }
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println(ListaRecinto.size());
                    System.out.println(" ");
                    break;

                case 5:
                    for (int i = 0; i < ListaRecinto.size(); i++) {
                        User auxUser = ListaRecinto.get(i);
                        if (auxUser.getGenero() == 'h' && auxUser.getEdad() >= 18) {
                            System.out.println(auxUser.toString());
                        }
                    }
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println("Nos vemos pronto!");
                    salirPrograma = true;
                    break;

//          Case de comprobación.
//                case 7:
//                    for (int i = 0; i < ListaUsers.size(); i++) {
//                        User auxUser = ListaUsers.get(i);
//                        System.out.println("USER: " + auxUser.toString());
//                    }
//                    for (int i = 0; i < ListaRecinto.size(); i++) {
//                        User auxUser = ListaRecinto.get(i);
//                        System.out.println("Recinto " + auxUser.toString());
//                    }
//                    for (int i = 0; i < ListaVetados.size(); i++) {
//                        User auxUser = ListaVetados.get(i);
//                        System.out.println("Vetados " + auxUser.toString());
//                    }
//                    break;
            }
        } while (salirPrograma == false);
    }

}
