/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaris;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Alumne
 */
public class LeerObjetoSerializacion {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here

        FileInputStream fis = new FileInputStream("productos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Cuando no haya mas objectos saltara la excepcion EOFException
        try {
            while (true) {
                Producto auxProd = (Producto) ois.readObject();
                System.out.println("Código: " + auxProd.getCodigo() + ".Nombre: "
                        + auxProd.getNommbre() + ". Precio: " + auxProd.getPrecio());
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
            fis.close();
            ois.close();
        }
    }

}
