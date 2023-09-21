/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author oscar
 */
public class empleado {

    private String nombre;
    private String apellido;
    private int salario;
    private int porcentaje;
    private int id;

    public void getID(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getNombre(String nombre) {
        System.out.println("Nombre del empleado: " + nombre);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void getApellido(String apellido) {
        System.out.println("Apellido del empleado: " + apellido);
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario(int salario) {
        return salario;
    }

    public void getNombreCompleto(String nombre, String apellido) {
        System.out.println("El nombre completo es: " + nombre + " " + apellido);
    }

    public void getSalarioAnual(int salario) {
        System.out.print("El salario anual es de: " + (salario * 12));
    }

    public void incrementarSalario(int porcentaje, int salario) {
        this.porcentaje = porcentaje;
        salario = salario + ((salario * porcentaje) / 100);
        System.out.print("El salario incrementado es: " + salario);
    }

    public void toString(int id, String nombre, String apellido, int salario) {
        System.out.println("Informacion empleado: ID: '" + id + "', " + nombre + " " + apellido + ", Salario: " + salario + "€");
    }
}
