/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_uf2_grupob.oscar_julian;

/**
 *
 * @author Alumne
 */
public class User {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;

    public User(int id, String nombre, String apellido, int edad, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public String toString() {    
        //Pasamos de h a Hombre y de m a Mujer, si introduce otra cosa dará error:        
        String sexo=" ";
        switch (this.genero) {
            case 'h':
                sexo = "Hombre";
                break;
            case 'm':
                sexo = "Mujer";
                break;
            default:
                sexo = "(Parametro mal introducido)";
                break;
        }
        //Hacemos el toString tal i como lo pide al case 5:
        return "Usuario - " + "Identificador: " + id + ", " + nombre + " " + apellido + ", " + sexo + ", " + edad + " años.";
    }            
    
    public int getId() {
        return id;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    
}
