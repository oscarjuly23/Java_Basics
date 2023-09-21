/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class testE {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, nombre = "", apellido = "";

        int opcion, i = 0, salario = 0, porcentaje, id = 0;
        empleado e1 = new empleado();

        do {
            System.out.println("MENU: ");
            System.out.println("1. Crear empleado(solo ID)");
            System.out.println("2. Asignar nombre");
            System.out.println("3. Asignar apellido");
            System.out.println("4. Mostrar nombre");
            System.out.println("5. Mostrar apellido");
            System.out.println("6. Mostrar nombre completo");
            System.out.println("7. Asignar salario");
            System.out.println("8. Mostrar salario");
            System.out.println("9. Mostrar salario anual");
            System.out.println("10.Incrementar salario");
            System.out.println("11.Mostrar empleado");
            System.out.println("12.Salir");
            System.out.println("Introduce opcion: ");
            cadena = br.readLine();
            opcion = Integer.parseInt(cadena);
            if (opcion < 1 || opcion > 12) {
                System.out.println("ERROR");
                System.out.println("");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce ID del empleado:");
                        e1.getID(id = Integer.parseInt(br.readLine()));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Introduce nombre del empleado:");
                        e1.setNombre(nombre = br.readLine());
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Introduce apellido del empleado:");
                        e1.setApellido(apellido = br.readLine());
                        System.out.println("");
                        break;
                    case 4:
                        e1.getNombre(nombre);
                        System.out.println("");
                        break;
                    case 5:
                        e1.getApellido(apellido);
                        System.out.println("");
                        break;
                    case 6:
                        e1.getNombreCompleto(nombre, apellido);
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("Introduce salario del empleado:");
                        e1.setSalario(salario = Integer.parseInt(br.readLine()));
                        System.out.println("");
                        break;
                    case 8:
                        e1.getSalario(salario);
                        System.out.print("€");
                        System.out.println("");
                        break;
                    case 9:
                        e1.getSalarioAnual(salario);
                        System.out.println("€");
                        System.out.println("");
                        break;
                    case 10:
                        System.out.println("En cuanto quieres incrementar tu salario(%)? ");
                        e1.incrementarSalario(porcentaje = Integer.parseInt(br.readLine()), salario);
                        System.out.println("€");
                        System.out.println("");
                        break;
                    case 11:
                        e1.toString(id, nombre, apellido, salario);
                        System.out.println("");
                        break;
                    case 12:
                        i = 1;
                        System.out.println("Nos vemos pronto!");
                        break;
                }
            }
        } while (i == 0);
    }

}
