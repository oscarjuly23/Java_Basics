/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio3.empleado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class testF {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena, id, descripcion;

        int i = 0, opcion;
        factura f1 = null;

        do {
            System.out.println("MENU: ");
            System.out.println("1. Crear item factura: se pide el id, descripcion, cantidad y el precio");
            System.out.println("2. Obtener factura: muestra la informacion del item factura");
            System.out.println("3. Obten el importe de la factura");
            System.out.println("4. Salir");
            cadena = br.readLine();
            opcion = Integer.parseInt(cadena);
            if (opcion < 1 || opcion > 4){
            System.out.println("ERROR: INTRODUCIR NUMERO DEL 1 AL 4");
            }else {
            switch (opcion) {
                case 1:
                    f1 = new factura("oscar","julian",5,10);
                    break;
                case 2:
                    System.out.println(f1.toString());
                    break;
                case 3:
                    System.out.println(f1.getTotal());
                    break;
                case 4:
                    i = 1;
                    System.out.println("Hemos salido del bucle");
                    break;
            }
        } 
        } while (i == 0);

    }

}
    
    
