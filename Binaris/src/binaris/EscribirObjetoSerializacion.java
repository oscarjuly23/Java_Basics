/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaris;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alumne
 */
public class EscribirObjetoSerializacion {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        Producto producto1 = new Producto(1, "neumáticos", 35.20);
        Producto producto2 = new Producto(2, "ruedas", 62.23);

        FileOutputStream fos = new FileOutputStream("productos.dat");
        ObjectOutputStream oosProductos = new ObjectOutputStream(fos);

        //Escribimos en el fichero "productos.dat
        oosProductos.writeObject(producto1);
        oosProductos.writeObject(producto2);

        fos.close();
        oosProductos.close();
    }

}
