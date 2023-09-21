
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumne
 */
public class testP {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Persona> listaPersonas = new ArrayList();
        String cadena, dades;
        boolean existeDNIPersona = false;

        int opcion, j = 0, count = 0, counth = 0, countm = 0;
        do {
            System.out.println("MENU: ");
            System.out.println("1. Añadir una nueva persona");
            System.out.println("2. Mostrar todas las persona");
            System.out.println("3. Mostrar una persona");
            System.out.println("4. Eliminar persona");
            System.out.println("5. Eliminar todas las personas");
            System.out.println("6. Calcular el peso ideal de todas las personas");
            System.out.println("7. Calcular el peso ideal de una persona");
            System.out.println("8. Mostrar el número de personas introducidas");
            System.out.println("9. Mostra les personas mayores de edad");
            System.out.println("10. Mostra le personas menores de edad");
            System.out.println("11. Mostra el número de mujeres introducidas");
            System.out.println("12. Mostrar el número de hombres introducidos");
            System.out.println("13. Salir");
            cadena = br.readLine();
            opcion = Integer.parseInt(cadena);

            switch (opcion) {
                case 1:
                    System.out.println("Introduce: Nombre, edad, sexo, peso, altura");
                    dades = br.readLine();
                    String[] valores = dades.split(",");
                    Persona p = new Persona(valores[0],
                            Integer.parseInt(valores[1]),
                            valores[2].charAt(0),
                            Double.parseDouble(valores[3]),
                            Double.parseDouble(valores[4]));
                    listaPersonas.add(p);
                    count++;
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Lista personas:");
                        System.out.println(listaPersonas.toString());
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Introducir DNI:");
                        String user_dni = br.readLine();
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            if (auxPersona.getDNI().equals(user_dni)) {
                                System.out.println(auxPersona.toString());
                                existeDNIPersona = true;
                            }
                        }
                        if (existeDNIPersona == false) {
                            System.out.println("No existe el DNI");
                        }
                    }
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Introducir DNI:");
                        String user_del = br.readLine();
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            if (auxPersona.getDNI().equals(user_del)) {
                                listaPersonas.remove(i);
                                existeDNIPersona = true;
                                count--;
                                System.out.println(auxPersona.getNombre() + " se ha borrado correctamente.");
                            }
                        }
                        if (existeDNIPersona == false) {
                            System.out.println("No existe el DNI");
                        }
                    }
                    break;
                case 5:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Se han eliminado todas las personas.");
                        listaPersonas.removeAll(listaPersonas);
                        count = 0;
                    }
                    break;
                case 6:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            int peso = auxPersona.calcularPesoIdeal();
                            switch (peso) {
                                case -1:
                                    System.out.println(auxPersona.getNombre() + ": " + "Estas en bajo peso");
                                    break;
                                case 0:
                                    System.out.println(auxPersona.getNombre() + ": " + "Estas en tu peso ideal");
                                    break;
                                default:
                                    System.out.println(auxPersona.getNombre() + ": " + "Estas en sobrepeso");
                                    break;
                            }
                        }
                    }
                    break;
                case 7:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Introduce DNI:");
                        String user_peso = br.readLine();
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            if (auxPersona.getDNI().equals(user_peso)) {
                                existeDNIPersona = true;
                                int peso = auxPersona.calcularPesoIdeal();
                                switch (peso) {
                                    case -1:
                                        System.out.println(auxPersona.getNombre() + ": " + "Estas en bajo peso");
                                        break;
                                    case 0:
                                        System.out.println(auxPersona.getNombre() + ": " + "Estas en tu peso ideal");
                                        break;
                                    default:
                                        System.out.println(auxPersona.getNombre() + ": " + "Estas en sobrepeso");
                                        break;
                                }
                            }
                        }
                        if (existeDNIPersona == false) {
                            System.out.println("No existe el DNI");
                        }
                    }
                    break;
                case 8:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Numero de personas creadas: " + listaPersonas.size());
                    }
                    break;
                case 9:
                    if (count == 0) {
                        System.out.println("No hay personas creadas o han sido eliminadas");
                    } else {
                        System.out.println("Personas mayores de edad:");
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            boolean major = auxPersona.esMayorDeEdad();
                            if (major == true) {
                                System.out.println(auxPersona.toString());
                            }
                        }
                    }
                    break;
                case 10:
                    if (count == 0) {
                        System.out.println("No hay personas creadas");
                    } else {
                        System.out.println("Personas menores de edad:");
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            boolean major = auxPersona.esMayorDeEdad();
                            if (major == false) {
                                System.out.println(auxPersona.toString());
                            }
                        }
                    }
                    break;
                case 11:
                    if (count == 0) {
                        System.out.println("No hay personas creadas");
                    } else {
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            char sexo = auxPersona.getSexo();
                            if (sexo == 'm') {
                                countm++;
                            }
                        }
                        System.out.println("Numero de mujeres creadas: " + countm);
                        countm=0;
                    }
                    break;
                case 12:
                    if (count == 0) {
                        System.out.println("No hay personas creadas");
                    } else {
                        for (int i = 0; i < listaPersonas.size(); i++) {
                            Persona auxPersona = listaPersonas.get(i);
                            char sexo = auxPersona.getSexo();
                            if (sexo == 'h') {
                                counth++;
                            }                            
                        }
                        System.out.println("Numero de hombres creados: " + counth);
                        counth=0;
                    }
                    break;
                case 13:
                    j = 1;
                    System.out.println("Nos vemos pronto!");
                    break;
            }
        } while (j == 0);
    }

}
