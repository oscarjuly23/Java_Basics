/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class banco {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        String op, passwd, p1;
        float saldo, din;
        float i = 0;

        System.out.println("Introduce saldo actual:");
        cadena = br.readLine();
        saldo = Float.parseFloat(cadena);

        System.out.println("Introduce contraseña (4 digitos)");
        passwd = br.readLine();

        if (passwd.length() == 4) {
            while (i == 0) {
                System.out.println("MENU TRANSACCIONES?");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Consultar el saldo actual");
                System.out.println("4. Cambiar la contraseña");
                System.out.println("5. Salir");
                System.out.println("Instroduce una opcion:");
                op = br.readLine();
                System.out.println(" ");

                if ("1".equals(op)) {
                    System.out.println("Introduce cantidad que quiere ingresar:");
                    cadena = br.readLine();
                    din = Float.parseFloat(cadena);
                    saldo = saldo + din;
                    System.out.println("Saldo actual = " + saldo + "€");
                    System.out.println(" ");
                } else if ("2".equals(op)) {
                    System.out.println("Introduce contraseña (4 digitos)");
                    p1 = br.readLine();
                    if (passwd == p1) {
                        System.out.println("Introduce cantidad que quiere retirar:");
                        cadena = br.readLine();
                        din = Float.parseFloat(cadena);
                        if (din > 400) {
                            System.out.println("No puedes sacar tanto dinero");
                            System.out.println(" ");
                        } else {
                            saldo = saldo - din;
                            if (saldo < 0) {
                                System.out.println("No tienes tanto dinero");
                                saldo = saldo + din;
                                System.out.println(" ");
                            } else {
                                System.out.println("Saldo actual = " + saldo + "€");
                                System.out.println(" ");
                            }
                        }
                    } else {
                        System.out.println("Contraseña incorrecta");
                        System.out.println(" ");
                    }
                } else if ("3".equals(op)) {
                    System.out.println("Saldo actual = " + saldo + "€");
                    System.out.println(" ");
                } else if ("4".equals(op)) {
                    System.out.println("Introduce contraseña actual:");
                    p1 = br.readLine();
                    if (p1.equals(passwd)) {
                        System.out.println("Introduce nueva contaseña:");
                        passwd = br.readLine();
                        System.out.println("Contraseña cambiada correctamente");
                        System.out.println(" ");
                    } else {
                        System.out.println("La contraseña actual es incorrecta");
                        System.out.println(" ");
                    }
                } else if ("5".equals(op)) {
                    i = 1;
                } else {
                    System.out.println("No existe esta opcion, vuelva  a intentarlo");
                    System.out.println(" ");
                }
            }
        } else {
            System.out.println("Contraseña incorrecta");
            System.out.println(" ");
        }

        br.close();
    }

}
