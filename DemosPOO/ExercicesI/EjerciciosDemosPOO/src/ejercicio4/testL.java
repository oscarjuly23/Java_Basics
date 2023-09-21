/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Alumne
 */
public class testL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        libro ll = new libro();
        String autor = "Froufe, Agustín";
        String titulo = "Java 2";
        String editorial = "Rama";
        String ISBN = "84-7897-429-6";
        int paginas = 673;
        String ciudad = "Barcelona";
        String fecha = "2000";
        ll.nl(autor,titulo,editorial,ISBN,paginas,ciudad,fecha);
        ll.nc(autor,titulo);
    }

}
