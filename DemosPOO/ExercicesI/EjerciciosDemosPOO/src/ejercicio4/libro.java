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
public class libro {

    private String autor;
    private String titulo;
    private String editorial;
    private String ISBN;
    private int paginas;
    private String ciudad;
    private String fecha;

    public void nl(String autor, String titulo, String editorial, String ISBN, int paginas, String ciudad, String fecha) {
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.ciudad = ciudad;
        this.fecha = fecha;        
        System.out.println("Nombre Largo: " + autor +" "+ titulo +" "+ editorial +" "+ ciudad +" "+ fecha + " ISBN " + ISBN );
    }
    public void nc(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        System.out.println("Nombre Corto: " + autor +" "+ titulo);
    }

}
