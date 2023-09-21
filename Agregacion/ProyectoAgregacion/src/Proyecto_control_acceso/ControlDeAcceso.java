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
public class ControlDeAcceso {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<ControlDeAcceso> ListaRecinto = new ArrayList(9);
    ArrayList<ControlDeAcceso> ListaVetados = new ArrayList();

    private String id;

    public ControlDeAcceso() {

    }

    public ControlDeAcceso(String id) {
        this.id = id;
    }

    public void entraUsuario(String id) throws IOException {
        System.out.print("Introduce id del usuario que quieres entrar al recinto: ");
        id = br.readLine();
        for (int i = 0; i < ListaVetados.size(); i++) {
            ControlDeAcceso auxUser = ListaVetados.get(i);
            if (id.equals(auxUser.getId())) {
                System.out.println("Usuario vetado!");
            } else {
                ListaRecinto.add(auxUser);
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void vetaUsuario(String id) throws IOException {
        System.out.print("Introduce id del usuario que quieres vetar: ");
        id = br.readLine();
        for (int i = 0; i < ListaVetados.size(); i++) {
            ControlDeAcceso auxUser = ListaVetados.get(i);
            if (id.equals(auxUser.getId())) {
                System.out.println("El Usuario ya está vetado!");
            } else {
                ListaVetados.add(auxUser);
            }
        }
    }
}
