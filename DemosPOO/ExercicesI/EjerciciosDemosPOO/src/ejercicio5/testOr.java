/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class testOr {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String cadena, procesador = "";
            float peso = 0;
            int j, i=0;
            boolean estaEncendido = false, pantallaActivada = false;
            Ordenador j1 = new Ordenador(); 
            do{
            System.out.println("MENU:");
            System.out.println("1. Introducir el procesador");
            System.out.println("2. Obtener el procesador");
            System.out.println("3. Introducir el peso");
            System.out.println("4. Obtener el peso");
            System.out.println("5. ¿Está encendido el ordenador?");
            System.out.println("6. Encender el odenador");
            System.out.println("7. Apagar el ordenador");
            System.out.println("8. Activar la pantalla");
            System.out.println("9. Desactivar la pantalla");
            System.out.println("10. Imprimir características del ordenador");
            cadena = br.readLine();
            j = Integer.parseInt(cadena);
            switch (j) {
                    case 1:
                        j1.SetProcesador(procesador = br.readLine());
                        break;
                    case 2:
                        j1.GetProcesador(procesador);
                        break;
                    case 3:
                        j1.SetPeso(peso = Integer.parseInt(br.readLine()));
                        break;
                    case 4:
                        j1.getPeso(peso);
                        break;
                    case 5:
                        j1.estaEncendido(estaEncendido);
                        break;
                    case 6:
                        j1.encenderOrdenador(estaEncendido = true);
                        break;
                    case 7:
                        j1.apagarOrdenador(estaEncendido = false);
                        break;
                    case 8:
                        j1.activarPantalla(pantallaActivada = true);
                        break;
                    case 9:
                        j1.desactivarPantalla(pantallaActivada = false);
                        break;
                    case 10:
                        j1.estaPantallaEncendida(pantallaActivada);
                        break;
                    default:
                        System.out.println("ERROR! Introducir un valor del 1 al 10");
                        break;
                }
            }while(i==0);
             
    }
    
}
